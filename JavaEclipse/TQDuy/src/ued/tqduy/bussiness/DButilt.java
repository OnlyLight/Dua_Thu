package ued.tqduy.bussiness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ued.tqduy.view.ViewResult;

public class DButilt {
	public final static String DB_NAME = "ued";
	public final static String TB_NAME = "Student";
	public final static String USER_NAME = "duy";
	public final static String PASSWORD = "1234";
	public static boolean checkSearchData = false;
	private static Connection con;
	
	public static Connection conn() {
		con = null;
        String url = "jdbc:sqlserver://localhost:1189;" + "databaseName="+DButilt.DB_NAME+";";
        try {
            con = DriverManager.getConnection(url, DButilt.USER_NAME, DButilt.PASSWORD);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
		return con;
	}
	
//	public static void showAll(String code) {
//		String sql = "SELECT * FROM "+DButilt.TB_NAME+"";
//		
//		ResultSet res = query(sql);
//		
//		try {
//			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
//			      String stid = res.getString(1).trim();
//			      
//			      if(code.equals(stid)) {
//			    	  String stname = res.getString(2);
//				      String stClass = res.getString(3);
//				      String staddress = res.getString(4);
//				      String stpass = res.getString(5);
//				      StudentManager.txtID.setText(stid);
//				      StudentManager.txtName.setText(stname);
//				      StudentManager.txtClass.setText(stClass);
//				      StudentManager.txtAdd.setText(staddress);
//			      }
//			      
////			      System.out.println("--------------------");
////			      System.out.println("ID: " + stid);
////			      System.out.println("NAME: " + stname);
////			      System.out.println("Class: " + stClass);
////			      System.out.println("Address: " + staddress);
////			      System.out.println("Pass: " + stpass);
//			  }
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if(con != null) {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
	public static void search(String id) {
		String sql = "SELECT * FROM "+DButilt.TB_NAME+" WHERE scode = '"+id+"'";
		
		ResultSet res = query(sql);
		
		try {
			while(res.next()) {
				String scode = res.getString(1).trim();
				if(scode.equals(id)) {
					checkSearchData = true; break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(String id) {
		boolean check = false;
		String sql = "SELECT * FROM "+DButilt.TB_NAME+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
				  if(stid.equals(id.trim())) {
					  execute("DELETE FROM "+DButilt.TB_NAME+" WHERE scode = '"+id+"'");
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
	
	public static void insert(String id, String stName, String stClass, String stAdd, String stPass) {
		boolean check = true;
		String sql = "SELECT * FROM "+DButilt.TB_NAME+"";
		
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
				execute("INSERT INTO "+DButilt.TB_NAME+" VALUES ('"+id+"',N'"+stName+"',N'"+stClass+"',N'"+stAdd+"',N'"+stPass+"')");
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
	
	public static void update(String id, String stName, String stClass, String stAdd, String stPass) {
		boolean check = false;
		String sql = "SELECT * FROM "+DButilt.TB_NAME+"";
		
		ResultSet res = query(sql);
		
		try {
			while (res.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
				String stid = res.getString(1).trim();
			      if(stid.equals(id.trim())) {
			    	  execute("UPDATE "+DButilt.TB_NAME+" SET sname = N'"+stName+"', class = N'"+stClass+"', address = N'"+stAdd+"',"
			    	  		+ " pass = '"+stPass+"' WHERE scode = '"+id+"'");
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
