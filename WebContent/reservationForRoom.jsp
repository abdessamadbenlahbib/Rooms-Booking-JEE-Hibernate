<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dates Reservations</title>

<style>
th {
font: 20px Tahoma, sans-serif;

}
td {
font: 15px Tahoma, sans-serif;
color: black;
width :20%;
padding : 20px;
}
table {
/*background-color: #f1f1c1;*/
}
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:useBean id="roomreservationliste" class="java.util.ArrayList" scope="request" /> 

</br>
</br>

<c:choose>
	<c:when test="${ not empty sessionScope.USER}">
			<table style="text-align : center;width:100%; color :blue;" border="1">

 <tr>
    <th>N. Chambre</th>
    <th>Date Debut</th>
    <th>Date Fin</th>
    <th>Period</th>
  </tr>
  
  <c:forEach var="list" items="${roomreservationliste}">
  
  <tr>
 
    <td style="width :25%;">${list.numroom} !</td>
    <td style="width :25%;" >${list.reservationstart } </td>
	<td style="width :25%;" >${list.reservationend }</td>
	<td style="width :25%;" >${list.reservationperiod } Jours</td>
	
</tr>

  </c:forEach>
  

</table>
	</c:when>
	<c:otherwise>
	<jsp:forward page="main"></jsp:forward>
	</c:otherwise>
	</c:choose>

<%
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate"); 
%>

</body>
</html>