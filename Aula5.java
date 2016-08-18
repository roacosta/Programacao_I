import java.util.Scanner;

class Aula5{
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		minhaConta.dono = "Priscila";
		minhaConta.saldo = 1000;
		minhaConta.numero = 1;
		int opcao;

		do{
			System.out.println("\n 1 -  Consultar Saldo: ");
			System.out.println("\n 2 -    Efetuar Saque: ");
			System.out.println("\n 3 - Efetuar Depósito: ");
			System.out.println("\n 4 -  Consultar Saldo: ");	

			Scanner entrada = new Scanner (System.in);
			opcao = entrada.nextInt();

		switch( opcao )
		{
		    case 1:
			    System.out.println("\n\n Saldo: " + minhaConta.saldo );
			    break;		    
		    case 2:

		    
		    case 3:
			    comandos caso a opção 3 tenha sido escolhida
			    break;
		    case 4:
			    comandos caso a opção 3 tenha sido escolhida
			    break;
		    
		    default:
			    comandos caso nenhuma das opções anteriores tenha sido escolhida
		}


		}while(opcao != 4);

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		if (minhaConta.saca(20) == false){
			System.out.println("\n saldo insufuciente! \n ");
		}

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		minhaConta.deposita(200);

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		
	}
}
