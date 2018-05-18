package tqduy.simplewebdemo.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SQLServerConnect {
	public final static String DB_NAME = "WebSaleDemo";
	public final static String TB_NAME_PRODUCT = "PRODUCT";
	public final static String TB_NAME_USER_ACCOUNT = "USER_ACCOUNT";
	public final static String USER_NAME = "duy";
	public final static String PASSWORD = "1234";
	private static Connection con;
	
	public static Connection conn() {
		con = null;
		String url = "jdbc:sqlserver://DESKTOP-6T1NTE9\\SQLEXPRESS:1433;" + "databaseName="+SQLServerConnect.DB_NAME+";";
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, SQLServerConnect.USER_NAME, SQLServerConnect.PASSWORD);
            System.out.println("Success !!");
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }	
	}
	
	public static void main(String[] args) {
		conn();
	}
	
	public static void deleteProduct(String id) {
		boolean check = false;
		String sql = "SELECT * FROM "+SQLServerConnect.TB_NAME_PRODUCT+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
				  if(stid.equals(id.trim())) {
					  execute("DELETE FROM "+SQLServerConnect.TB_NAME_PRODUCT+" WHERE CODE = '"+id+"'");
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
		String sql = "SELECT * FROM "+SQLServerConnect.TB_NAME_PRODUCT+"";
		
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
				execute("INSERT INTO "+SQLServerConnect.TB_NAME_PRODUCT+" VALUES ('"+id+"','"+stName+"', '"+price+"')");
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
		String sql = "SELECT * FROM "+SQLServerConnect.TB_NAME_PRODUCT+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(id.trim())) {
			    	  execute("UPDATE "+SQLServerConnect.TB_NAME_PRODUCT+" SET NAME = '"+stName+"', PRICE = '"+price+"' WHERE CODE = '"+id+"'");
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
		String sql = "SELECT * FROM "+SQLServerConnect.TB_NAME_USER_ACCOUNT+"";
		
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
				execute("INSERT INTO "+SQLServerConnect.TB_NAME_USER_ACCOUNT+" VALUES ('"+userName+"','"+gender+"', '"+passWord+"')");
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
		String sql = "SELECT * FROM "+SQLServerConnect.TB_NAME_USER_ACCOUNT+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(userName.trim())) {
			    	  execute("UPDATE "+SQLServerConnect.TB_NAME_USER_ACCOUNT+" SET GENDER = '"+gender+"', PASSWORD = '"+passWord+"' WHERE USER_NAME = '"+userName+"'");
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
}
