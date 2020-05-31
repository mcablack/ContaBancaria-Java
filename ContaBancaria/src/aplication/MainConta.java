package aplication;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int op = 0;

		// Dados - Cliente

		String nome;
		int idade;
		String sexo;

		System.out.println("Informe nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Informe idade: ");
		idade = sc.nextInt();
		System.out.println("Informe sexo: ");
		sexo = sc.next();

		
		Cliente cliente = new Cliente(nome, idade, sexo);
		System.out.println(cliente); // Metodo thString
		System.out.println("\nSeus Dados estão corretos? 1= SIM / 2= NÃO");
		op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("\nDados Salvo com sucesso!");
			break;
		case 2:

			System.out.println("Altere nome: ");
			nome = sc.next();
			cliente.AlteraNome(nome);
			System.out.print("Pressione ENTER para continuar...\n");
			System.out.println("Altere sexo: ");
			sexo = sc.next();
			cliente.AlteraSexo(sexo);
			System.out.println("\n" + cliente);

		
			break;
		}

	

		// Dados - Conta
		System.out.println("\n----*Abrindo conta-----*\n");
		System.out.println("\nDeseja realizar deposito? (1 = NÃO /2 = SIM");

		op = sc.nextInt();
		int numConta = 0;
		double saldoIni = 500.00;
		double valorDeposito = 0.0;

		for (int i = 0; i < 10; i++) {
			numConta = gerador.nextInt(26);
		}
		Conta conta = new Conta(numConta, saldoIni);
		switch (op) {
		case 1:
			System.out.println(cliente);
			System.out.println(conta);// Tostring mostrar valores

			break;
		case 2:
			System.out.println("\nDigite o valor do deposito: ");
			valorDeposito = sc.nextDouble();
			conta.Deposito(valorDeposito);
			System.out.println(cliente);
			System.out.println(conta);
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		System.out.println("\n----*Fazendo Saque*-----");
		System.out.println("\nInforme o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.Saque(valorSaque);
		System.out.println(cliente);
		System.out.println(conta);
		System.out.println("Encerando operação");
		sc.close();

	}

	// private static void AlteraCliente(String nome, int idade, String sexo) {
	// TODO Auto-generated method stub

//	}
}
