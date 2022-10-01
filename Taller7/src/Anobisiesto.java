import java.util.Scanner;

public class Anobisiesto {
	
	public static void main(String[] args) {
		
		long ano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un año: ");
		
		ano = sc.nextLong();
		
		boolean resultado = esBisiesto(ano);
		
		if (resultado) {
			System.out.println("Si es bisiesto");
		}
		else {
			System.out.println("No es Bisiesto");
		}
		for (ano = 1900; ano < 3000; ano++) {
			
			if (esBisiesto(ano)) {
				System.out.printf("%d,",ano);
			}
		}
	}
	
	public static boolean esBisiesto (long ano) {
		
		return ano % 4 == 0 && (ano % 100 != 0 ||ano % 400 == 0);
	}

}
