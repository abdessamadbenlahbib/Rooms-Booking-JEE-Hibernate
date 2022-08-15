<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>

<c:choose>
	<c:when test="${ not empty sessionScope.USER}">
			<jsp:forward page="main"></jsp:forward>
	</c:when>
	<c:otherwise>
			<div class="container" >
	<section id="content" >
		<form action="logincheck" method="post" >
			<h1>Login Form</h1>
			<div>
				<input type="text" placeholder="Username" id="username" name="username" required/>
			</div>
			<div>
				<input type="password" placeholder="Password" id="password" name="password" required/>
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href=<c:url value="register" ></c:url>>Sign Up</a>
			</div>
		</form>
	</section>
</div>
	</c:otherwise>
</c:choose>

<%-- if(request.getSession().getAttribute("USER")== null) {--%>



<%-- } else { --%>
	<%-- response.sendRedirect("main");}--%>


</body>
</html>