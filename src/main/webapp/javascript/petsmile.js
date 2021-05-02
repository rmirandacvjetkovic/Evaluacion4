$(document).ready(function(){
	listarAgendas();
	listarDuenos();
	listarMascotas();
});

$('#btnModal').click(function() {
	$('#modalRegistro').modal('toggle');
});

function listarAgendas() {
	resetTabla();
	$.ajax({

        url : "./AgendaServlet",
        dataType : 'json',
        error : function() {
            alert("Se ha producido un error");
        },
        success : data => {
            var datos = data;
			console.log(datos);
			 $.each(datos, function(i, item) {
			        var $tr = $('<tr>').append(
			            $('<td>').text(item.id),
			            $('<td>').text(item.idMascota),
			            $('<td>').text(item.rutDueno),
			            $('<td>').text(item.nombreMascota),
			            $('<td>').text(item.hora),
			            $('<td>').text(item.fecha));
			        $('#tabla-agenda > tbody').append($tr);
			 });
        }
    });
}

function resetTabla() {
	$('#tabla-agenda > tbody').html('');
}

function listarDuenos() {
	
	$.ajax({

        url : "./DuenoServlet",
        dataType : 'json',
		
        error : function() {
            alert("Se ha producido un error");
        },
        success : data => {
            var datos = data;
			console.log(datos);
			 
			 $.each(datos, function(i, item) {
			        var $tr = $("<option value='"+item.rut+"'>").append(item.rut + ' (' + item.nombre + ' ' + item.apellido + ')');
			        $('#selectDueno').append($tr);
			 });
        }
    });
}

$('#selectDueno').change(function() {
	var rut = $('#selectDueno').val();
	listarMascotas(rut);
});

function resetSelect() {
	 $('#selectMascota').find('option')
    .remove()
    .end()
    .append('<option value="">-- Seleccione --</option>')
}

$('#selectMascota').change(function() {
	var nombreMascota = $('#selectMascota option:selected').text();
	$('#inputNombreMascota').val(nombreMascota);
});

function registrarMascota() {
	$.ajax({
		url: "./AgendaServlet",
		method: 'POST',
		dataType: 'json',
		data: {
			rutDueno: $('#selectDueno').val(),
			idMascota: $('#selectMascota').val(),
			nombreMascota: $('#inputNombreMascota').val(),
			hora: $('#inputHora').val(),
			fecha: $('#inputFecha').val()
		},
		error : function() {
            alert("Se ha producido un error");
        },
		success : data => {
			$('#modalRegistro').modal('toggle');
			listarAgendas();
			
        }
	})
}

$('#btnRegistrarAgenda').click(function() {
	registrarMascota();
});

function listarMascotas(rut) {
	$.ajax({
		url: "./MascotaServlet",
		dataType: 'json',
		data: {
			rut: rut
		},
		error : function() {
            alert("Se ha producido un error");
        },
        success : data => {
			resetSelect();
            var datos = data;
			console.log(datos);
			
			 $.each(datos, function(i, item) {
			        var $tr = $("<option value='"+item.idMascota+"'>").append(item.nombreMascota);
			        $('#selectMascota').append($tr);
			 });
			
        }
	})
}
