package exercico.V;

import java.util.Scanner;

public class AppV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite um número");
		
		int numero = entrada.nextInt();
	
		if (numero >=  1 ) { 
			System.out.println(" O número digitado é possitivo");
		} else {
			System.out.println(" O número digitado é negativo");
		}
	}

}
