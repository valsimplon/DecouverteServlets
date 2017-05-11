<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Création contacts - annuaire</title>
</head>
<body>
	<div class="formulaire">
		<form action="creerContact.do" method="post">
			<div class="champs">
				<label> Prénom</label> <input type="text" name="prenom" />
			</div>

			<div class="champs">
				<label> Nom </label> <input type="text" name="nom" />
			</div>

			<div class="champs">
				<label> Adresse E-mail</label> <input type="text" name="email" />
			</div>

			<div class="champs">
				<label> TypeContact</label> <input type="text" name="contact_type" />
			</div> 
			<div class="champs">
				<label> Age</label> <input type="text" name="age" />
			</div>

			<div>
				<p></p>
				<p>
					<button type="submit" class="button-block">
						<h4>Valider</h4>
					</button>
				</p>

			</div>
		</form>
	</div>
</body>
</html>