package br.com.alura.gerenciador.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet	 {
    
	public int acessos = 1;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter saida = resp.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("Seu primeiro Servlet, Tião!!! ");
		saida.println("<br><br>Agora com mapeamento feito no web.xml e não mais com anotação");
		saida.println("</body>");
		saida.println("</html>");	
		
		
		System.out.println("Escreve no console, não na página"+" - "+acessos++);
	}
   

}
