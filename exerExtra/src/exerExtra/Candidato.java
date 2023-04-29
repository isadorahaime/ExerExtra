package exerExtra;

public class Candidato {
	 String nome;
	 String cpf;
	 char [] respostas = new char [10];
	
	public Candidato() {
		
	}
	
	public Candidato(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public char[] getRespostas() {
		return respostas;
	}

	public void setRespostas(char[] respostas) {
		this.respostas = respostas;
	}
}
