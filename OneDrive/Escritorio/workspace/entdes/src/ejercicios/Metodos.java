package ejercicios;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
	}
		static void devuelveStringsContatenados() {
			
			Scanner scanner =new Scanner(System.in);
		
				
			System.out.println("Introduzca su primera cadena: ");
			String entrada1=scanner.nextLine();
			
			
			System.out.println("Introduzca su segunda cadena: ");
			String entrada2=scanner.nextLine();
			
			System.out.println("Su texto es: " + entrada1 + entrada2);
			
		}

	}

