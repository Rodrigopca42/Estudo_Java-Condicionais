import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int x;
		
		x = tec.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		tec.close();
		
	}

}
