<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@	 taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Affichage Contact</title>
</head>
<body>
	<div class="champs">
		<label> Prénom : </label> ${ nouveauContact.fname }
	</div>

	<div class="champs">
		<label> Nom : </label> ${ nouveauContact.lname }
	</div>

	<div class="champs">
		<label> E-mail : </label> ${ nouveauContact.email }
	</div>

	<div class="champs">
		<label> TypeContact : </label> ${ nouveauContact.contactType }
	</div>
	<div class="champs">
		<label> Age : </label> ${ nouveauContact.age }
	</div>
	<div class="champs">
		<label> liste de hobbies : </label>
		<c:forEach var="monHobby" items="${ nouveauContact.hobbies }" >
			${ monHobby.hobby }
		</c:forEach>
	</div>
</body>
</html>