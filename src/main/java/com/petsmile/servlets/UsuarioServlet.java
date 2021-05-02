package com.petsmile.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petsmile.dto.UsuarioDTO;
import com.petsmile.service.UsuarioServiceImpl;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();
		UsuarioDTO usuario = usuarioService.login(request.getParameter("username"), request.getParameter("password"));
		
		if(usuario == null) {
			request.setAttribute("error", "Usuario y/o contraseña no válidos.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("./error.jsp");
			dispatcher.forward(request,response);
		} else {
	
			response.sendRedirect("./agenda.jsp");
		}
	}

}
