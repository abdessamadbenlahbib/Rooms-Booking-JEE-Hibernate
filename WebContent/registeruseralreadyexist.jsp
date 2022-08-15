<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<c:choose>
<c:when test="${empty sessionScope.USER }" >
<jsp:include page="header_nologin.jsp"></jsp:include>
<div class="container">
	<section id="content">
		<form action="client" method="post">
			<h1>Registration</h1>
			<h3 style="color : red; font : 15px Tahoma,sans-serif;">user already exist ! please chose another username !</h3>
			</br>
			<div>
				<input type="text" placeholder="Username" required="" id="username" name="username" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="" id="password" name="password" />
			</div>
			<div>
				<input type="text" placeholder="Nom" required="" id="nom" name="nom" />
			</div>

			<div>
				<input type="text" placeholder="Prenom" required="" id="prenom" name="prenom" />
			</div>
			<div>
				<input type="text" placeholder=Age required="" id="age" name="age" />
			</div>
			<div>
				<input type="text" placeholder="Nationalite" required="" id="nationalite" name="nationalite" />
			</div>
			<div>
				<input type="text" placeholder="Telephone" required="" id="telephone" name="telephone" />
			</div>
			<div>
				<input type="text" placeholder="Adresse" required="" id="adresse" name="adresse" />
			</div>

			<div>
				<input type="submit" value="Register" />
			</div>
		</form><!-- form -->
		</section>
		</div>
	</c:when>
	<c:otherwise>
	<jsp:forward page="main"></jsp:forward>
	</c:otherwise>
	</c:choose>
	
</body>
</html>