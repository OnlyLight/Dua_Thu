package tqduy.flowershop.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tqduy.flowershop.bean.User;
import tqduy.flowershop.bean.Product;

public class ProductDAO {
	public final static String DB_NAME = "FlowerShop";
	public final static String TB_NAME = "Product";
	public final static String TB_NAME_USER = "UserProduct";
	public final static String USER_NAME = "duy";
	public final static String PASSWORD = "1234";
	public static Connection con;

	public static Connection conn() {
		con = null;
		String url = "jdbc:sqlserver://DESKTOP-6T1NTE9\\SQLEXPRESS:1433;" + "databaseName=" + ProductDAO.DB_NAME + ";";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, ProductDAO.USER_NAME, ProductDAO.PASSWORD);
			// JOptionPane.showMessageDialog(null, "Connect Success !!");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		return con;
	}

	public static void disconnect() throws SQLException {
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}

	public static void insertProduct(Product product) throws SQLException {
		conn();
		execute("INSERT INTO " + ProductDAO.TB_NAME
				+ " (product_title, product_name, product_image, product_description) " + "VALUES ('"
				+ product.getProductTitle() + "', " + "'" + product.getProductName() + "', " + "'"
				+ product.getProductImage() + "', " + "'" + product.getProductDescription() + "')");
		disconnect();
	}

	public static void deleteProduct(Product product) throws SQLException {
		conn();
		execute("DELETE FROM " + ProductDAO.TB_NAME + " WHERE product_id = " + product.getProductID() + "");
		disconnect();
	}

	public static void updateProduct(Product product) throws SQLException {
		conn();
		execute("UPDATE " + ProductDAO.TB_NAME + " SET product_title = '" + product.getProductTitle() + "', "
				+ "product_name = '" + product.getProductName() + "', " + "product_image = " + product.getProductImage()
				+ " " + "WHERE product_id = " + product.getProductID() + "");
		disconnect();
	}

	public static List<Product> listAllProducts() throws SQLException {
		List<Product> listProducts = new ArrayList<>();

		String sql = "SELECT * FROM " + TB_NAME + "";

		conn();

		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("product_id");
			String title = resultSet.getString("product_title");
			String name = resultSet.getString("product_name");
			String img = resultSet.getString("product_image");
			String des = resultSet.getString("product_description");

			Product product = new Product(id, title, name, img, des);
			listProducts.add(product);
		}

		resultSet.close();
		statement.close();

		disconnect();

		return listProducts;
	}

	public static Product getProduct(int id) throws SQLException {
		Product product = null;
		String sql = "SELECT * FROM " + ProductDAO.TB_NAME + " WHERE product_id = ?";

		conn();

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			String title = resultSet.getString("product_title");
			String name = resultSet.getString("product_name");
			String img = resultSet.getString("product_image");
			String des = resultSet.getString("product_description");

			product = new Product(id, title, name, img, des);
		}

		resultSet.close();
		statement.close();
		disconnect();

		return product;
	}

	public static ArrayList<Product> getListProductByPages(int firstResult, int maxResult) throws SQLException {
		conn();
		String sql = "SELECT * FROM ( SELECT *, ROW_NUMBER() OVER (ORDER BY product_id) as row FROM "+ProductDAO.TB_NAME+" ) a WHERE row > "+firstResult+" and row <= "+maxResult+"";
		PreparedStatement ps = con.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {
			Product product = new Product();
			product.setProductID(rs.getInt("product_id"));
			product.setProductTitle(rs.getString("product_title"));
			product.setProductName(rs.getString("product_name"));
			product.setProductImage(rs.getString("product_image"));
			product.setProductDescription(rs.getString("product_description"));
			list.add(product);
		}
		rs.close();
		ps.close();
		disconnect();

		return list;
	}

	public static int countProducts() throws SQLException {
		conn();
		String sql = "SELECT count(product_id) FROM " + ProductDAO.TB_NAME + "";
		PreparedStatement ps = con.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		rs.close();
		ps.close();
		disconnect();

		return count;
	}

	public static boolean checkUser(User user) throws SQLException {
		String sql = "SELECT * FROM "+ProductDAO.TB_NAME_USER+"";
		if(user == null) System.out.println("fail");
		conn();
		
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String userName = resultSet.getString("userName");
			String passWord = resultSet.getString("passWord");
			System.out.println("userName: " + userName + " passWord: " + passWord);
			
			if(user.getUserName().trim().equals(userName) && user.getPassWord().trim().equals(passWord)) {
				System.out.println("userName: " + user.getUserName() + " passWord: " + user.getPassWord());
				return true;
			}
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		return false;
	}

	public static void execute(String sql) throws SQLException {
		Statement st = null;
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st.close();
		}
	}
}
