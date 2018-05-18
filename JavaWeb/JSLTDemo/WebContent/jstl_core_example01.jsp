<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Departments and Employees</h2>

	<c:forEach items="${departments}" var="dept">
 		<h3>${dept.deptName}</h3>
		 <ul>
		   <!-- Dùng for để duyệt trên các nhân viên
		               thuộc phòng ban hiện tại -->
		   <c:forEach items="${dept.employees}" var="emp">
		       <li>
		          ${emp.empName} - (${emp.job})
		       </li>    
		   </c:forEach>
		 </ul>
	</c:forEach> 
	<c:forEach items="${product}" var="product">
		<h3>${ product.name }</h3>
	</c:forEach>
</body>
</html>