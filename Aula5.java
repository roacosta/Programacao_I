import java.util.Scanner;

class Aula5{
	public static void main(String[] args){
		
		double valor = 0;		
		int opcao;

		Conta minhaConta = new Conta();
		

		do{
			System.out.println("\n 1 -       Nova Conta ");
			System.out.println("\n 2 -  Consultar Saldo ");
			System.out.println("\n 3 -    Efetuar Saque ");
			System.out.println("\n 4 - Efetuar Depósito ");
			System.out.println("\n 5 -             Sair ");	

			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();

			switch( opcao )
			{
				case 1:
					minhaConta.criar(minhaConta);
				case 2:
					System.out.println("\n\n Saldo: " + minhaConta.saldo );
					break;		    
				case 3:
					System.out.println("\n\n Informe o valor do saque: ");
					valor = entrada.nextDouble();
					if (minhaConta.saca(valor) == false){
						System.out.println("\n saldo insufuciente! \n ");
					}
					break;		    
				case 4:
					System.out.println("\n\n Informe o valor do depósito: ");
					valor = entrada.nextDouble();
					minhaConta.deposita(valor);
					break;	
				case 5:
					break;
				
				default:
			}


		}while(opcao != 5);
		
	}
}
