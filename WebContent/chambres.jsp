<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chambres</title>

<style>
th {
font: 25px Tahoma, sans-serif;
}
td {
font: 15px Tahoma, sans-serif;
color: black;
width :20%;
}
table {
/*background-color: #f1f1c1;*/
}
</style>


</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<jsp:useBean id="maliste" class="java.util.ArrayList" scope="request"/>
<%--<%request.getAttribute("maliste") ;--%>

</br>
</br>

<c:choose>
	<c:when test="${ not empty sessionScope.USER}">
			<table style="text-align : center;width:100%; color :blue;" border="1">

 <tr>
    <th>Images</th>
    <th>Info</th>
    <th>Prix / nuit</th>
    <th>Nbre de Personne</th>
    <th>Num Room</th>
    <th>Num Etage</th>
    <th>Reserver</th>
  </tr>
  
  <c:forEach var="list" items="${maliste}">
  
  <tr>
 
    <td>
    <c:forTokens var="photo" items="${list.photo }" delims="-">
	<a href='rooms/${photo}.jpg' ><img src='rooms/${photo}.jpg' height="90" width="90" border="5"hspace="10" vspace="10" /></a> 
	</c:forTokens>
	</td>
    <td >${list.desc} !</td>
    <td style="width :10%;">${list.prix} $</td>
    <td style="width :10%;" >${list.nbrPers } Personne(s)</td>
	<td style="width :10%;" >${list.numRoom }</td>
	<td style="width :10%;" >${list.numEtage }</td>
	<td style="width :10%;" >
	
		<form action="reserve.jsp" method="post" >
			<input type="hidden" name="numroom" value="${list.numRoom }" />
			<input type="hidden" name="prix" value ="${list.prix}" />
			<input type="hidden" name="maxnumpers" value="${list.nbrPers }" />
			<input type="submit" value="Reserver" />
		</form>
	 <c:url value="roomreservation" var="page" >
	 <c:param name="numroom" value="${list.numRoom }" /> 
	 </c:url> 
	 <a href="${page }" target="_blank" >Info</a>
	 
	</td>
</tr>

  </c:forEach>
  

</table>
	</c:when>
	<c:otherwise>
			<table style="text-align : center;width:100%; color :blue;" border="1">

 <tr>
    <th>Images</th>
    <th>Info</th>
    <th>Prix / nuit</th>
    <th>Nbre de Personne</th>
    <th>Num Room</th>
    <th>Num Etage</th>
  </tr>
  
  <c:forEach var="list" items="${maliste}">
  
  <tr>
 
    <td>
    <c:forTokens var="photo" items="${list.photo }" delims="-">
	<a href='rooms/${photo}.jpg' ><img src='rooms/${photo}.jpg' height="90" width="90" border="5"hspace="10" vspace="10" /></a> 
	</c:forTokens>
	</td>
    <td >${list.desc} !</td>
    <td style="width :10%;">${list.prix} $</td>
    <td >${list.nbrPers } Personne(s)</td>
	<td style="width :10%;" >${list.numRoom }</td>
	<td style="width :10%;" >${list.numEtage }</td>
</tr>

  </c:forEach>
  

</table>
	</c:otherwise>
</c:choose>

<%
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate"); 
%>

</body>
</html>