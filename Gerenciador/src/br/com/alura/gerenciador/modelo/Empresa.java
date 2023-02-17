package br.com.alura.gerenciador.modelo;

public class Empresa {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("nome inseridor pelo metodo!!");
	}
	private int id;
	private String nome;

}
