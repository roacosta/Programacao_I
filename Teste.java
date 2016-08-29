public class Teste{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario("Rodrigo","Programação","65.698.329-9",1000.00);
		
		f1.dataDeEntrada = new Data(29,8,2016);
		
		f1.mostra();

	}
}
