package modulo7;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >=50) {
			if (media >=70) {
				if (media >=90) {
					System.out.println("Aluno está aprovado direto - Parabéns");
				}
				else 
				System.out.println("Aluno está aprovado direto");
			}else {
				System.out.println("Aluno está em recuperação");
				
			}
		}else {
			System.out.println("Aluno Reprovado direto");
		
	}
		
}

}

