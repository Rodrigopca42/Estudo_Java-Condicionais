import java.util.Scanner;

public class IfElseTempoDoJogo {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int horaInicial = tec.nextInt();
		int horaFinal = tec.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		tec.close();
	}

}
