import java.util.Scanner;


class Festa{
	public static void main(String[] args){
		int idade = 0;
		boolean amigoDoDono;
		String amigoDoDonoResposta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a idade: ");
		idade = entrada.nextInt();

		if (idade >= 18){
			System.out.printf(" A pessoa pode entrar na festa: ");
		}else{
			System.out.printf(" A pessoa não pode entrar na festa, é amigo do Dono? ");
			amigoDoDonoResposta = entrada.next();

			amigoDoDono = (amigoDoDonoResposta.equals("s"));


			if (amigoDoDono){
				System.out.printf("Entre \n\n");
			}else{
				System.out.printf("Vaaaza \n\n");
			}
		}
	}
}
