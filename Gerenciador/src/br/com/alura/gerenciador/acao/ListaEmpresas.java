package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<body>");
        saida.println("<ul>");
        
        for (Empresa empresa: lista){
        	saida.println("<li>"+empresa.getNome()+"</li>");
        }
        saida.println("</ul>");
		saida.println("</body>");
		saida.println("</html>");	
		
	}

}
