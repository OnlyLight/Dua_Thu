<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <!-- Product -->
        <div style="margin: 3% 0" class="row">
            <div class="col-sm-8">
                <div class="row">
                    <div class="col-sm-5">
                        <h2 class="title">Product title</h2>
                        <div class="thumbnail">
                            <img src="images/flower-1.jpg" alt="Hinh 1">
                        </div>
                    </div>

                    <div class="col-sm-7 paragrap">
                        <h3 class="title" style="margin-top: 12%">Details</h3>
                        <p>If you'd like someone to think sweet thoughts about you, send them this delightful bouquet! A graceful heart of bear grass is tied with purple waxflower, and appears to float above red roses nestled in a ruby-red glass vase. How sweet it is!
                            Red roses and purple waxflower accented with variegated pittosporum and bear grass arrive in a Teleflora red glass cube vase.
                        </p>
                        <p>If you'd like someone to think sweet thoughts about you, send them this delightful bouquet! A graceful heart of bear grass is tied with purple waxflower, and appears to float above red roses nestled in a ruby-red glass vase. How sweet it is!
                            Red roses and purple waxflower accented with variegated pittosporum and bear grass arrive in a Teleflora red glass cube vase.
                        </p>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#home">Description</a></li>
                            <li><a data-toggle="tab" href="#menu1">Review</a></li>
                        </ul>

                        <div class="tab-content paragrap">
                            <div id="home" class="tab-pane fade in active">
                                <p>As open and bright as a winter's sky, this exquisite mix of white and blue blossoms would make a stunning birthday gift, or a superb Hanukah present for a favorite friend or family member. An eye-catching selection.</p>
                                <p>White Asiatic lilies, white spray roses and dark blue iris - accented with greenery - are delivered in a glass vase.</p>
                                <ul>
                                    <li>Orientation: All-Around</li>
                                    <li>All prices in USD ($)</li>
                                </ul>
                            </div>
                            <div id="menu1" class="tab-pane fade">
                                <p>As open and bright as a winter's sky, this exquisite mix of white and blue blossoms would make a stunning birthday gift, or a superb Hanukah present for a favorite friend or family member. An eye-catching selection.</p>
                                <p>White Asiatic lilies, white spray roses and dark blue iris - accented with greenery - are delivered in a glass vase.</p>
                                <ul>
                                    <li>Orientation: All-Around</li>
                                    <li>All prices in USD ($)</li>
                                </ul>
                            </div>
                        </div>

                        <button style="background-color: black; border: none" class="btn btn-danger btn-custom paragrap">Add to cart</button>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="thumbnail video-flower">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3067.7971018860903!2d-84.63675498516781!3d39.74420830418959!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88400ce581421695%3A0xa7c482dc31fa9cc5!2s200+E+Main+St%2C+Eaton%2C+OH+45320!5e0!3m2!1svi!2s!4v1523845791197" width="100%" height="350" frameborder="0" style="border:0" allowfullscreen></iframe>
                </div>
                <div class="address paragrap">
                    <span class="info-contact">General Questions</span>
                    <p>410-576-3800
                        (9 am–4:30 pm, daily)</p>

                    <span class="info-contact">Stranded Animal Hotline</span>
                    <p>410-576-3880</p>

                    <span class="info-contact">Natural Resources Police</span>
                    <p>1-800-628-9944</p>

                    <span class="info-contact">Membership</span>
                    <p>410-659-4230
                        (9 am–4:30 pm, Mon.–Fri.)</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>