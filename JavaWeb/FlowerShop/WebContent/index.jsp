<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Beautifull Flower Shop</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/flower-shop.css">
    <link rel="stylesheet" href="css/font-custom.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/flower-shop.js"></script>
</head>
<body>
	<div class="container">
		<!-- Header -->
		<jsp:include page="common/header.jsp"></jsp:include>
        <!--Introduce-->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="title">Introduce</h2>
                <p class="paragrap">Flowers are mostly used as gifts to people; it creates a simple smile to anyone who receives it. Flowers are needed to be taken care of in order to blossom beautifully.
                    Alexyz's Flower Shop provides that kind of purpose by staying in the business industry for almost 3 years with its main branch in Quezon City, Philippines and specializes in flower arrangements for birthdays, debuts, and other occasions. Our shop intends to provide quality service to customers. The flowers can also be arranged according to the clients’ chosen design. We also provide special discounts and offers to loyal customers and more.
                    Alexyz's Flower shop aims to achieve its goals through creating a good relationship between our clients and a good place for the business.
                    Our clients are mostly those who are involved in intimate relationships.
                </p>

                <!--Product-->
                <h2 class="title">Products</h2>

                <div class="row">

                    <!--Product infomation-->
                    <div class="col-lg-9">
                        <div class="row">
                        	<c:forEach var="product" items="${listProduct}">
		                    	<!--Product 1-->
		                            <div class="col-lg-5 col-xs-12 product-info">
		                                <div class="row">
		                                    <div class="col-lg-5">
		                                        <div class="thumbnail product-item">
		                                           <img src="<c:out value='${product.productImage }'/>" alt="hinh san pham">
		                                        </div>
		                                    </div>
		                                    <div class="col-lg-7 paragrap">
		                                        <h4><c:out value='${ product.productTitle }'/></h4>
		                                        <span><u><c:out value='${ product.productName }'/></u></span>
		                                        <p><c:out value='${ product.productDescription }'/></p>
		                                        <a class="pull-right" href="/FlowerShop/login">More info</a>
		                                    </div>
		                                </div>
		                            </div>
		                            <!--End Product 1-->
		                    </c:forEach>
                            
                            <!--Pagination-->
                            <ul class="pagination pull-right" style="margin-right: 4%">
                            	<c:forEach var="total" items="${ total }">
                            		<li><a href="/FlowerShop/product?pages=<c:out value='${ total }'/>"><c:out value='${ total }'/></a></li>
                            	</c:forEach>
                            </ul>
                            <!--End Pagination-->
                        </div>
                    </div>

                    <!--Advertising-->
                    <div class="col-lg-3 adv-info">
                        <div class="row">
                            <div class="col-sm-12">
                                <h2 class="title">Advertising</h2>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="thumbnail adv-item">
                                    <img src="images/flower-adv.jpg" alt="Flower adv 1">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="thumbnail adv-item">
                                    <img src="images/flower-adv-2.jpg" alt="Flower adv 2">
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--End Avertising-->
                </div>
            </div>
        </div>
    </div>
</body>
</html>