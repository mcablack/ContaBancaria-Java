package entities;

import java.util.Scanner;

public class Cliente {
	Scanner sc = new Scanner(System.in);
	// Atibutos
		private String nome; //Privatizando a variavel, para não ser acessada de outra classe.
		private int idade;  
		private String sexo;
		
		public Cliente() {
			
		}
		public Cliente(String nome, int idade, String sexo) {
			//super();
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
		
		}
		public String getNome() {
			return nome;
		}
		public String setNome(String nome) {
			return this.nome = nome;
		}
		public double getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getSexo() {
			return sexo;
		}
		public String setSexo(String sexo) {
			return this.sexo = sexo;
		} 
		
		
		public String toString() {
			return "Nome: " + nome 
					+ " = " + "Idade:" + idade 
					+ " = " + "Sexo: " + sexo;
					
		}
		
		public String AlteraNome(String nome) {
			// TODO Auto-generated method stub
			return this.setNome(nome);
		}
		public String AlteraSexo(String sexo) {
			// TODO Auto-generated method stub
			return this.setSexo(sexo);
		}
}
