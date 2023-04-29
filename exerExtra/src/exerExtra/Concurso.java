package exerExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
	private char [] gabarito = new char [10];
	private ArrayList<Candidato> candidatos = new ArrayList<>();

	public char[] getGabarito() {
		return gabarito;
	}

	public void setGabarito(char[] gabarito) {
		this.gabarito = gabarito;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	public void addCandidato (Candidato candidato) {
		boolean cpfExiste = false;
		for(Candidato c : candidatos) {
			if(c.getCPF().equals(candidato.getCPF())) {
				cpfExiste = true;
				break;
			}
		}
		if(!cpfExiste) {
			candidatos.add(candidato);
		}
	}
	
	public void removerCandidato(String cpf) {
		for(Candidato c : candidatos) {
			if(c.getCPF().equals(cpf)) {
				candidatos.remove(c);
				return;
			}
		}
		System.out.println("Candidato não encontrado. ");
		
}
	
	public void addRespostasAoGabarito() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite as 10 respostas do gabarito: ");
		for(int i = 0; i < gabarito.length; i++) {
			gabarito[i] = scanner.next().charAt(0);
		}
	}
	
	public void corrigirProvas(Candidato candidato) {
		for(Candidato c : candidatos) {
			int acertos = 0;
				for(int i = 0; i < gabarito.length; i++) {
					if(c.getRespostas()[i] == gabarito[i]) {
						acertos++;
					}
				}
				System.out.println("Cadidato: " + c.getNome() + "CPF: " + c.getCPF() + "acertos: " + acertos);
		}
	}
		
		public void imprimirCadidatos() {
			for(Candidato c : candidatos) {
				int acertos = 0;
				for(int i = 0; i < gabarito.length; i++) {
					if(c.getRespostas()[i] == gabarito[i]) {
						acertos++;
					}
				}
				System.out.println("Candidato: " + c.getNome() + "CPF: " + c.getCPF() + "acertos: " + acertos);
		}
	}
}