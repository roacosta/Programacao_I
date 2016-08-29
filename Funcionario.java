public class Funcionario{
	String nome, departamento, rg;
	Double salario;
	boolean estaNaEmpresa;
	Data dataDeEntrada;

	public Funcionario(String n, String dep, String rgF, double valor ){
		this.nome = n;
		this.departamento = dep;
		this.rg = rgF;
		this.salario = valor;
		this.estaNaEmpresa = true;
				

	}

	public void mostra(){
		System.out.println("\tNome: " 			+ this.nome);
		System.out.println("\tDepartamento: " 	+ this.departamento);
		System.out.println("\tRG: " 			+ this.rg);
		System.out.println("\tData Admissão: " 	+ this.dataDeEntrada.formatada());
		System.out.println("\tSalario: " 		+ this.salario);
		System.out.println("\tGanho Anual: " 	+ this.CalculaGanhoAnual());
		System.out.println("\tEstá na Empresa: "+ (estaNaEmpresa? "Sim":"Não"));
	}

	public void demite(){
		this.estaNaEmpresa = false;
	}
	public double CalculaGanhoAnual(){
		return this.salario * 12;
	}

	public void bonifica(double aumento){
		this.salario += aumento;
	}
}

