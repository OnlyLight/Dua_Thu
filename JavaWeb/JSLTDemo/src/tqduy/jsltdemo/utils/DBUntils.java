package tqduy.jsltdemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tqduy.jsltdemo.model.Product;

public class DBUntils {
	public final static String DB_NAME = "WebSaleDemo";
	public final static String TB_NAME_PRODUCT = "PRODUCT";
	public final static String TB_NAME_USER_ACCOUNT = "USER_ACCOUNT";
	public final static String USER_NAME = "duy";
	public final static String PASSWORD = "1234";
	private static Connection con;
	
	public static Connection conn() {
		con = null;
		String url = "jdbc:sqlserver://DESKTOP-6T1NTE9\\SQLEXPRESS:1433;" + "databaseName="+DBUntils.DB_NAME+";";
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, DBUntils.USER_NAME, DBUntils.PASSWORD);
            JOptionPane.showMessageDialog(null, "Connect Success !!");
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }	
	}
	
	public static void main(String[] args) {
		insertProduct("20", "aa", "1234");
	}
	
	public static void deleteProduct(String id) {
		boolean check = false;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME_PRODUCT+"";
		
		conn();
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
				  if(stid.equals(id.trim())) {
					  execute("DELETE FROM "+DBUntils.TB_NAME_PRODUCT+" WHERE CODE = '"+id+"'");
					  check = true; break;
				  }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(!check) {
				JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm cần xóa !!");
			} else {
				JOptionPane.showMessageDialog(null, "Xóa thành công !!");
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void insertProduct(String id, String stName, String price) {
		boolean check = true;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME_PRODUCT+"";
		
		conn();
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(id.trim())) {
			    	  check = false; break;
			      }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(check) {
				execute("INSERT INTO "+DBUntils.TB_NAME_PRODUCT+" VALUES ('"+id+"','"+stName+"', '"+price+"')");
				JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công !!");
			}
			else JOptionPane.showMessageDialog(null, "Trùng ID xin nhập lại !!");
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void updateProduct(String id, String stName, String price) {
		boolean check = false;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME_PRODUCT+"";
		
		conn();
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(id.trim())) {
			    	  execute("UPDATE "+DBUntils.TB_NAME_PRODUCT+" SET NAME = '"+stName+"', PRICE = '"+price+"' WHERE CODE = '"+id+"'");
			    	  check = true; break;
			      }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(!check) {
				JOptionPane.showMessageDialog(null, "Không tìm thấy sản phảm cần chỉnh sửa !!");
			} else {
				JOptionPane.showMessageDialog(null, "Sửa thành công !!");
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void insertAccount(String userName, String gender, String passWord) {
		boolean check = true;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME_USER_ACCOUNT+"";
		
		conn();
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(userName.trim())) {
			    	  check = false; break;
			      }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(check) {
				execute("INSERT INTO "+DBUntils.TB_NAME_USER_ACCOUNT+" VALUES ('"+userName+"','"+gender+"', '"+passWord+"')");
				JOptionPane.showMessageDialog(null, "Chèn thành công !!");
			}
			else JOptionPane.showMessageDialog(null, "Trùng ID xin nhập lại !!");
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void updateAccount(String userName, String gender, String passWord) {
		boolean check = false;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME_USER_ACCOUNT+"";
		
		conn();
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(userName.trim())) {
			    	  execute("UPDATE "+DBUntils.TB_NAME_USER_ACCOUNT+" SET GENDER = '"+gender+"', PASSWORD = '"+passWord+"' WHERE USER_NAME = '"+userName+"'");
			    	  check = true; break;
			      }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(!check) {
				JOptionPane.showMessageDialog(null, "Không tìm thấy phần tử cần chỉnh sửa !!");
			} else {
				JOptionPane.showMessageDialog(null, "Sửa thành công !!");
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void rollBack(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ResultSet query(String sql) {
		con = conn();
		ResultSet res = null;
		
		try {
			Statement statement = con.createStatement();
			res = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static void execute(String sql) {
		con = conn();
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Product> queryProduct() throws SQLException {
        String sql = "Select a.Code, a.Name, a.Price from Product a ";
 
        Connection conn = conn();
        
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            String code = rs.getString("Code");
            String name = rs.getString("Name");
            float price = rs.getFloat("Price");
            Product product = new Product();
            product.setCode(code);
            product.setName(name);
            product.setPrice(price);
            list.add(product);
        }
        return list;
    }
}
