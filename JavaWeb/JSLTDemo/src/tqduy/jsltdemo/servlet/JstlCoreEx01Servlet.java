package tqduy.jsltdemo.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tqduy.jsltdemo.model.Dept;
import tqduy.jsltdemo.model.Product;
import tqduy.jsltdemo.utils.DBUtils;
import tqduy.jsltdemo.utils.DBUntils;

/**
 * Servlet implementation class JstlCoreEx01Servlet
 */
@WebServlet("/JstlCoreEx01Servlet")
public class JstlCoreEx01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JstlCoreEx01Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Truy vấn dữ liệu từ DB (Mô phỏng).
//        List<Dept> list = DBUtils.queryDepartments();
        List<Product> listProduct = null;
		Connection conn = DBUntils.conn();
		try {
			listProduct = DBUntils.queryProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
        // Lưu dữ liệu vào thuộc tính 'departments' của request.
//        request.setAttribute("departments", list);
        request.setAttribute("product", listProduct);
 
        // Tạo đối tượng RequestDispatcher
        // để Forward (chuyển tiếp) yêu cầu tới jstl_core_example01.jsp
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/jstl_core_example01.jsp");
 
        // Forward (Chuyển tiếp) yêu cầu, để hiển thị dữ liệu trên trang JSP.
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
