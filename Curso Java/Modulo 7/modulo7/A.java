package modulo7;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 60;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*if (media >=70) {
			System.out.println("Parab�ns voc� passou de ano: " + media);
		}
		if (media >=40 && media <=69) {
			System.out.println("Est� de recupera��o: " + media);
		}
		
		else {
		
			System.out.println("Aluno foi reprovado: " + media); */
		
		String saidaResultado = media >= 70? "Aluno Aprovado" : (media >=40 && media <=69) ? "Aluno em recupera��o" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
	}

}

