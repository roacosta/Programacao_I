
class OutroPrograma{
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		minhaConta.dono = "Priscila";
		minhaConta.saldo = 1000;
		minhaConta.numero = 1;
		int erro;

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		if (minhaConta.saca(20) == false){
			System.out.println("\n saldo insufuciente! \n ");
		}

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		minhaConta.deposita(200);

		System.out.println("\n Numero: " + minhaConta.numero + "\n   Dono: " + minhaConta.dono + "\n  Saldo: " + minhaConta.saldo );

		
	}
}
