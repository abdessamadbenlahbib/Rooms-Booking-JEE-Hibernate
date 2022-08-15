<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <title>CSS Booking Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="css/default.css"/>
    </head>
  
    <body>    
    <c:choose>
    <c:when test="${ not empty sessionScope.USER }">
      <jsp:include page="header.jsp"></jsp:include>
      
        <form action="reservation" class="register" method="post">
            <h1>Booking</h1>
            <fieldset class="row2">
                <legend>Personal Details
                </legend>
                <p>
                    <label>Name *
                    </label>
                    <input type="text" name="fullname" class="long" required />
                </p>
                <p>
                    <label>Phone *
                    </label>
                    <input type="text" name="phone" maxlength="10" required />
                </p>
                <p>
                    <label class="optional">Street
                    </label>
                    <input type="text" name="street" class="long"/>
                </p>
                <p>
                    <label>City *
                    </label>
                    <input type="text" name="city" class="long" required />
                </p>
                <p>
                    <label>Country *
                    </label>
                    <select name="country">
                        <option value="Maroc" >Maroc</option>
                        <option value="UK" >United Kingdom</option>
                        <option value="USA" >United States</option>
                 
                    </select>
                </p>
		     <p>
                    <label>Nationality *
                    </label>
                    <select name="nationality" >
                        <option value="Maroc">
                        Maroc
                        </option>
                        <option value="USA">United States
                        </option>
                        <option value="UK">United Kingdom
                        </option>
                    </select>
                </p>
               
            </fieldset>
            <fieldset class="row3">
                <legend>Booking Information
                </legend>
		   <p>
			  <label>Username
                    </label>
                    <input type="text" name="user" placeholder="" class="long" value="${sessionScope.USER}" readonly/>

		   </p>

		   <p>
			  <label>Reservation Start *
                    </label>
                    <input type="text" name="reservstart" placeholder="" class="long" required />

		   </p>
		   <p>
			  <label>Reservation Period *
                    </label>
                    <input type="text" name="reservperiod" placeholder="" class="long" required />

		   </p>
		   <p>
			  <label>Prix / nuit
                    </label>
                    <input type="text" name="prix" placeholder="" class="long" value="${param.prix} $" readonly />

		   </p>
		   <p>
			  <label>N. Room
                    </label>
                    <input type="text" name="numroom" placeholder="" class="long" value="${param.numroom }" readonly />

		   </p>
		   <p>
			  <label>Number Persons *
                    </label>
                    <input type="number" name="numberperson" value="1" min="1" max="${param.maxnumpers }" />

		   </p>
 

		   

     		    
                
                <div class="infobox"><h4>Helpful Information</h4>
                    <p>Ici vous trouvez quelques clarifications , ce qui concerne le champ "Reservation Start" : vous deviez specifier la date du commencement de votre reservation à cette format "yyyy-MM-dd" ex : 2016-02-26 . Le champ "Reservation Period" : vous deviez indiquer le nombre de jours de votre reservation ex : 5 (cad 5 jours)</p>
                </div>
            </fieldset>

            <div><input type="submit" class="button" value="Submit"/></div>
        </form>
        
        </c:when>
        <c:otherwise>
        <jsp:forward page="main" />
        </c:otherwise>
        </c:choose>
        
<%
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate"); 
%>

    </body>
</html>
