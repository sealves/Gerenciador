package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/novaEmpresaTiao")
public class NovaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando Nova Empresa");
		
		String nomeDaEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeDaEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.print("Empresa: ");
		saida.print("<b>"+empresa.getNome()	+"</b>");
		saida.println(" - Cadastrada Com Sucesso!!!");
		saida.println("</body>");
		saida.println("</html>");	
		

		
		
	}

}
