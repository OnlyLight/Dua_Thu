package tqduy.bookmanage.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class DBUntils {
	public final static String DB_NAME = "BookStore";
	public final static String TB_NAME = "book";
	public final static String USER_NAME = "duy";
	public final static String PASSWORD = "1234";
	private static Connection con;
	
	public static Connection conn() {
		con = null;
		String url = "jdbc:sqlserver://DESKTOP-6T1NTE9\\SQLEXPRESS:1433;" + "databaseName="+DBUntils.DB_NAME+";";
        try {
            con = DriverManager.getConnection(url, DBUntils.USER_NAME, DBUntils.PASSWORD);
            System.out.println("Success !!");
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }	
	}
	
	public static void main(String[] args) {
		conn();
		insert("1", "aa", "bb", "2");
	}
	
	public static void delete(int id) {
		boolean check = false;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				int stid = res.getInt(1);
				  if(stid == id) {
					  execute("DELETE FROM "+DBUntils.TB_NAME+" WHERE book_id = '"+id+"'");
					  check = true; break;
				  }
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(!check) {
				JOptionPane.showMessageDialog(null, "Không tìm thấy phần tử cần xóa !!");
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
	
	public static void insert(String id, String stName,String author, String price) {
		boolean check = true;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME+"";
		
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
				execute("INSERT INTO "+DBUntils.TB_NAME+" VALUES ('"+id+"','"+stName+"','"+author+"', '"+price+"')");
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
	
	public static void update(String id, String stName) {
		boolean check = false;
		String sql = "SELECT * FROM "+DBUntils.TB_NAME+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(id.trim())) {
			    	  execute("UPDATE "+DBUntils.TB_NAME+" SET sname = '"+stName+"'WHERE scode = '"+id+"'");
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
