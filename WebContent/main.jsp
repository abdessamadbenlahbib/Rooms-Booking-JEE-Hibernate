<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Room</title>
<style>
div.abc {
	width : 250px;
	height : 50px;
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

<c:choose>
	<c:when test="${ not empty sessionScope.USER}">
			<div class="abc" >Hello Mr : ${sessionScope.USER} </div>
	</c:when>
	<c:otherwise>
			<div class="abc" >Please Log in </div>
	</c:otherwise>
</c:choose>
<%-- <p style="text-align : center; color : blue; font :30px Tahoma, sans-serif;" >Hello Mr : ${sessionScope.USER} </p> --%>
<%-- <no:Nocache/> --%>
<%
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate"); 
%>
</body>
</html>