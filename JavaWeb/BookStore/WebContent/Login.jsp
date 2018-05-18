<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Books Store Application</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/book-store.css" type="text/css">
	<style type="text/css">
		.width-label {
		    width: 100px;
		}
		
		.center {
		    text-align: center;
		    font-family: 'Pacifico', cursive;
		}
		
		.btn-custom {
		    cursor: pointer;
		}
		
		.center figure figcaption h3{
		    font-size: 58px;
		}
	</style>
</head>
<body>
	<!--<form style="text-align: center" action="login" method="post">
		<label>User Name:</label> 
		<input type="text" placeholder="Insert UserName" name="username"/><br><br>
		<label>PassWord:</label>
		<input type="password" placeholder="Insert Password" name="password"/><br><br>
			<input type="submit" value="OK">
	</form>-->
	
	<div class="container">
        <form class="center" action="login" method="post">
            <figure>
                <figcaption><h3>Login</h3></figcaption>
            </figure>
            <label class="width-label">User: </label>
            <input type="text" placeholder="Enter your user" name="username"><br>

            <label class="width-label">Password: </label>
            <input type="password" placeholder="Enter your password" name="password"><br>

            <input class="btn btn-danger btn-custom" type="submit" value="Login here">
        </form>
    </div>
</body>
</html>