<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:choose>
	<c:when test="${ empty sessionScope.USER}">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Room Booking</title>

	<link rel="stylesheet" href="css/demo.css">
	<link rel="stylesheet" href="css/header-login-signup.css">
	<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>

</head>

<body>

<header class="header-login-signup">

	<div class="header-limiter">

		<h1><a href=<c:url value="main" ></c:url> >Company<span>logo</span></a></h1>

		<nav>
			<a href=<c:url value="main" ></c:url> >Home</a>
			<a href=<c:url value="chambres" ></c:url> class="selected" >Chambres</a>
			<a href=<c:url value="aboutus" ></c:url> >About Us</a>
		</nav>

		<ul>
			<li><a href=<c:url value="login" ></c:url> >Login</a></li>
			<li><a href=<c:url value="register" ></c:url>>Sign Up</a></li>
		</ul>

	</div>

</header>

<!-- The content of your page would go here. -->





<!-- Demo ads. Please ignore and remove. -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.tutorialzine.com/misc/enhance/v3.js" async></script>

</body>

</html>

</c:when>
	<c:otherwise>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Second Bar Header</title>

	<link rel="stylesheet" href="css/demo.css">
	<link rel="stylesheet" href="css/header-second-bar.css">
	<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

</head>

<body>

<header class="header-two-bars">

	<div class="header-first-bar">

		<div class="header-limiter">

			<h1><a href=<c:url value="main" ></c:url> >Company<span>logo</span></a></h1>

			<nav>
				<a href=<c:url value="main" ></c:url>>Home</a>
				<a href=<c:url value="chambres" ></c:url> class="selected" >Chambres</a>
				<a href=<c:url value="mesreservations" ></c:url> >Reservation</a>
				<a href=<c:url value="aboutus" ></c:url> >About Us</a>
			</nav>

			<a href=<c:url value="logout" ></c:url> class="logout-button">Logout</a>
		</div>

	</div>

</header>

<!-- The content of your page would go here. -->





<!-- Demo ads. Please ignore and remove. -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.tutorialzine.com/misc/enhance/v3.js" async></script>

</body>

</html>


</c:otherwise>
</c:choose>
