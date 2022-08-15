<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deja Reservé</title>
<style>
div.abc {
	width : 500px;
	height : 190px;
	padding: 10px;
	margin: 0 auto;
	border: 4px solid blue;
	box-sizing: border-box;
	text-align: center;
	font: 20px Tahoma,sans-serif;
	color: red;
	background-color: #FFF608;
		}

</style>

</head>
<body>

<jsp:include page="/header.jsp"></jsp:include>
</br>
</br>
<jsp:useBean id="numroom" class="java.lang.String" scope="request" />
<div class="abc"><p> la chambre : ${numroom} est deja reservé </p>
<p><a href=<c:url value="main"></c:url> >Main Page</a></p>

</div>


</body>
</html>