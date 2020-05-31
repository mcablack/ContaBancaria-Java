package entities;
import java.util.Random;

public class Conta {
 
	private int numConta;
	private	double saldoIni;

public Conta() {
		
	}
	
public Conta(int numConta, double saldoIni) {
		super();
		this.numConta = numConta;
		this.saldoIni = saldoIni;
	}

	
	Random gerador = new Random(10);
	//Contrutor
	
	public Conta (double valorSaque)  { //Para saque
		 this.saldoIni =valorSaque;
		System.out.println(getSaldoIni());
		
		
		//imprime sequência de 10 números inteiros aleatórios entre 0 e 25
      
        //System.out.println(gerador.nextInt(26));
        //Gerar numero automático, de 0 até 10, e não se repetir.
		
		
		/*int []array = new int [10];
		boolean temnumero= false;
		for ( int i=0; i<10;i++)
		{
			int valor = contaAleatoria.nextInt(10)+1; 
		for ( int j=0; j<10; j++){ //Faz uma verificação no array 
			if (array[j]==valor) { //se dentro do array, na posição j, for igual a valor, j, receberá 10.
				j=10; //encerra
				temnumero = true;
			}
			}
			
			if (!temnumero) { //Não tem nuemro no array
				array[i]=valor;
			}
			else {
				temnumero = false;
			i--;
			}
		}
		
		for ( int i=0; i<10; i++) {
		numConta=array[i];
		}
		
		return getNumConta();
		}*/
	}
	
	
	//Metodos SET-GET
	public int getNumConta() {
		return numConta;
	}
	
	private int setNumConta(int numConta) {
				  return numConta;
	     }
		
	

	public double getSaldoIni() {
		return saldoIni;
	}

	public double setSaldoIni(double saldoIni) {
		return this.saldoIni=saldoIni;
	}
	
	//Metodos
	
	/*****SAQUE****/
	
public double Saque (double valorSaque) {
	valorSaque= getSaldoIni() - valorSaque - 5.0;	
	return 	this.setSaldoIni(valorSaque);
	//Preciso colocar o metedo set para atualizar esse valor
}

public double Deposito (double valorDeposito) { //Colocar como PRIVATE
	valorDeposito= getSaldoIni()+ valorDeposito;
	return this.setSaldoIni(valorDeposito);
}
	
public String toString() {
	return "Conta: " + numConta 
			+ " = " 
			+ "Saldo:" + saldoIni; 
			
			
}

}
	
	

