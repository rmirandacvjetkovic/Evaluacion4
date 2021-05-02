<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>PetSmile</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-md-center mt-3">
			<div class="col-lg-4">
				<h2 class="text-center">PET SMILE</h2>
				<hr>
				<h2 class="text-center">Login usuarios</h2>
				<hr>
				<form method="post" action="./UsuarioServlet">
					<input required="required" class="form-control" type="text" id="username"
						name="username" placeholder="Usuario" /><br /> 
					<input
						required="required"
						class="form-control" type="password" id="password" name="password"
						placeholder="Password" /><br />
					<button id="btnLogin" class="btn btn-primary form-control" type="submit">Ingresar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>