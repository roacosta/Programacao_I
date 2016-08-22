import java.util.Scanner;
class Conta{
	int 	numero;
	String 	dono;
	double 	saldo;

	Scanner entrada = new Scanner (System.in);

	boolean	saca(double valor){
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
			
		}else{
			return false;
		}

		
	}
	void	deposita(double valor){
		this.saldo += valor;
	}
	void	criar(){
			Conta minhaConta = new Conta();
			System.out.println("\n\n Informe o numero da conta: ");		
			minhaConta.dono = entrada.nextLine();	
			System.out.println("\n\n Informe o Titular da conta: ");

	}
}
