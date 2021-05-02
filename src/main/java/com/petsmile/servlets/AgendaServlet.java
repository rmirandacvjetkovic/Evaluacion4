package com.petsmile.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.petsmile.dto.AgendaDTO;
import com.petsmile.service.AgendaServiceImpl;

/**
 * Servlet implementation class AgendaServlet
 */
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AgendaServiceImpl agendaService;
	private Gson gson = new Gson();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AgendaServlet() {
		super();
		// Instanciar servicio CRUD de agenda
		
		agendaService = new AgendaServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		List<AgendaDTO> agendas = agendaService.listarAgendas();
		
		// configurar respuesta json de sevlet
		
		String data = this.gson.toJson(agendas);

		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(data);
		out.flush();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		// configurar respuesta json de sevlet
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		// preparar objeto para registro
		AgendaDTO agenda = new AgendaDTO();
		agenda.setRutDueno(request.getParameter("rutDueno"));
		agenda.setIdMascota(Integer.parseInt(request.getParameter("idMascota")));
		agenda.setNombreMascota(request.getParameter("nombreMascota"));
		agenda.setHora(request.getParameter("hora"));
		try {
			agenda.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			agendaService.insertarAgenda(agenda);
		} catch(Exception e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			out.print(this.gson.toJson("Error"));
			out.flush();
			return;
		}
		
		response.setStatus(HttpServletResponse.SC_OK);
		out.print(this.gson.toJson("Ok"));
		out.flush();
	}

}
