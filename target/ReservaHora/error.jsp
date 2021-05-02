<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PetSmile - Error</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
	<% String error = (String) request.getAttribute("error"); %>
	
		<div class="row justify-content-md-center mt-3">
			<div class="col-lg-4">
			
				<p class="text-center"><%=error%></p>
				<br/>
				<p class="text-center">
					<a href="./login.jsp">Volver</a>
				</p>
			</div>
		</div>
</body>
</html>