<%@page import="com.petsmile.dto.AgendaDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PetSmile - Agendas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-md-center mt-3">
			<div class="col-lg-8">
				<div class="card">
					<div class="card-body">

						<h4>Agenda de visitas</h4>
						<br>
						<button id="btnModal" class="btn btn-outline-primary mt-3 mb-3">Registrar</button>

						<table id="tabla-agenda"
							class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th>ID Mascota</th>
									<th>RUT Dueño</th>
									<th>Nombre Mascota</th>
									<th>Hora</th>
									<th>Fecha</th>
								</tr>
							</thead>
							<tbody>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

<div class="modal fade" id="modalRegistro" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Agendar visita</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form id="formRegistro">
      <div class="modal-body">
        <div class="row g-3">
        	<div class="col-lg-12">
        		<label class="form-label">Dueño</label>
        		<select id="selectDueno" name="selectDueno" class="form-select" required="required">
        			<option value="">-- Seleccione --</option>
        		</select>
        	</div>
        	
        	<div class="col-lg-12">
        		<label class="form-label">Mascota</label>
        		<select id="selectMascota" name="selectMascota" class="form-select" required="required">
        			<option value="">-- Seleccione --</option>
        		</select>
        	</div>
        	
        	<div class="col-lg-12">
        		<label class="form-label">Nombre Mascota</label>
        		<input id="inputNombreMascota" name="inputNombreMascota" type="text" class="form-control" required="required" readonly="readonly"/>
        	</div>
        	
        	<div class="col-lg-12">
        		<label class="form-label">Hora</label>
        		<input id="inputHora" name="inputHora" type="time" class="form-control" required="required"/>
        	</div>
        	
        	<div class="col-lg-12">
        		<label class="form-label">Fecha</label>
        		<input id="inputFecha" name="inputFecha" type="date" class="form-control" required="required"/>
        	</div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button id="btnRegistrarAgenda" type="button" class="btn btn-success">Registrar</button>
      </div>
      </form>
    </div>
  </div>
</div>
</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
	integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"
	crossorigin="anonymous"></script>
<script src="./javascript/petsmile.js"></script>


</html>