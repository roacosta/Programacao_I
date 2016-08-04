class BalancoTrimestral{
	public static void main(String[] args){
		int gastosJaneiro, gastosFevereiro, gastosMarco, gastosTrimestre;
		double MediaMensal;
		boolean gastoControlado;
		
		gastosJaneiro 	= 15000;
		gastosFevereiro = 23000;
		gastosMarco 	= 17000;

		gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		//=== Exercício 1
		System.out.println("Gasto Trimestral: " + gastosTrimestre);

		//=== Exercício 2
		MediaMensal = gastosTrimestre / 3;
		System.out.println("Média Mensal: " + MediaMensal);

		//=== Exercício 3
		gastoControlado = (MediaMensal < 30000);

		if(gastoControlado){
			System.out.println("Verificação: O Gasto está controlado?");
		}
	}
}
