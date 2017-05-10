<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HELLO JSP</title>
</head>
<body>
	<h1>1 - Bonjour à toi, ${ param["NOM"] } !</h1>
	<h1>2 - Bonjour bonjour ${ leNom }</h1>
	<h1>3 - Bonjour bonjour ${ param.NOM }</h1>
	<h1>4 - Bonjour bonjour ${ requestScope.leNom }</h1>
	<h1>5 -	<%=request.getParameter("NOM")%></h1>
	<h1>6 -	<%=request.getAttribute("leNom")%></h1>

	<h2>header 1 - ${ header["user-agent"] }</h2>
	<h2>header 2 - <%=request.getHeader("user-agent")%></h2>

	<h2>ContextPath - <%=request.getContextPath()%></h2>

	<h3>cookie - ${ cookie }</h3>

	<div id="demo">
		<script>
			var txt = "Quelques informations sur le navigateur en javaScript";

			txt += "<p>User-agent header: " + navigator.userAgent + "</p>";
			txt += "<p>Browser CodeName: " + navigator.appCodeName + "</p>";
			txt += "<p>Browser Name: " + navigator.appName + "</p>";
			txt += "<p>Browser Version: " + navigator.appVersion + "</p>";
			txt += "<p>Cookies Enabled: " + navigator.cookieEnabled + "</p>";
			txt += "<p>Browser Language: " + navigator.language + "</p>";
			txt += "<p>Browser Online: " + navigator.onLine + "</p>";
			txt += "<p>Platform: " + navigator.platform + "</p>";

			document.getElementById("demo").innerHTML = txt;
		</script>
	</div>

</body>
</html>