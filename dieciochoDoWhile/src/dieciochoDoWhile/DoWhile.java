package dieciochoDoWhile;

import java.util.Scanner;

public class DoWhile {
	
	private int numero;
	
	public void ciclo() {
		
	Scanner scanner = new Scanner(System.in);
	
	

	do {
		System.out.println("Ingrese un numero. Si desea parar digite un numero mayor a -5 : ");
		numero = scanner.nextInt();
		
		} while (numero > -5);
	

	}
	

	}

	
	


