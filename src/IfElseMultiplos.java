import java.util.Scanner;

public class IfElseMultiplos {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int A = tec.nextInt();
		int B = tec.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}

		tec.close();

	}
}
