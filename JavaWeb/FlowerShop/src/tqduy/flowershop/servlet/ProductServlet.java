package tqduy.flowershop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tqduy.flowershop.bean.Product;
import tqduy.flowershop.bean.User;
import tqduy.flowershop.conn.ProductDAO;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			loadListProduct(request, response);
			login(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void loadListProduct(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException, SQLException {
		int firstResult = 0, maxResult = 0, pages = 0;
		if (request.getParameter("pages") != null) {
	        pages = (int) Integer.parseInt(request.getParameter("pages"));
	    }
		System.out.println("Page got: " +pages);
		
		int total = ProductDAO.countProducts();
		System.out.println("Total: " + total);
	    
	    if (total <= 4) {
	        firstResult = 0; 
	        maxResult = total; 
	    } else {
	        firstResult = (pages - 1) * 4;
	        maxResult = firstResult + 4;
	    }
	    System.out.println("First: " + firstResult);
	    System.out.println("Max: " + maxResult);
	    if(pages <= 0) {
	    	firstResult = 0;
	    	maxResult = 4;
	    }
	    
	    List<Integer> arrTotal = new ArrayList<>();
	    arrTotal.add(1);
	    for(int i = 1; i <= total/4; ++i) {
	    	if(total % 4 == 0) {
	    		arrTotal.add(i);
	    	} else {
	    		arrTotal.add(i+1);
	    	}
	    }
	    
	    List<Product> list = ProductDAO.getListProductByPages(firstResult, maxResult);
	    request.setAttribute("total", arrTotal);
	    request.setAttribute("listProduct", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		User user = new User(userName, passWord);
		
		if(!response.isCommitted()) System.out.println("fail !!");
		else System.out.println("success !!");
//		response.sendRedirect("product-detail.jsp");
		
		if(ProductDAO.checkUser(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
//			request.setAttribute("userName", userName);
//			response.sendRedirect("product-detail.jsp");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("login");
//			dispatcher.forward(request, response);
			return;
		}
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
