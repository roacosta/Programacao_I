
class Conta{
	int 	numero;
	String 	dono;
	double 	saldo;

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
}
