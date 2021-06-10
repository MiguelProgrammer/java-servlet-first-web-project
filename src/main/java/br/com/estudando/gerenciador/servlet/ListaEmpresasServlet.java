package br.com.estudando.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaEmpresasServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> listaEmpresas = banco.getEmpresas();

		PrintWriter pw = response.getWriter();
		
		pw.println("<!DOCTYPE html><html><head><title>Meu Sistema Web Com Java</title></head><body><ol>");
		
		for (Empresa empresa : listaEmpresas) {
			pw.println("<li><h2>"+empresa.getNome()+"</li></h2>");
		}
		pw.println("</ol></body></html>");
	}

}
