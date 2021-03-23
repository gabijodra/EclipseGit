package ejercicios;

import java.util.Scanner;

import java.util.Timer;

import java.util.TimerTask;

public class Metodos {

	public static void main(String[] args) {
		
		//devuelveStringsContatenados()
		// devuelveCaracterdependiendoDelNumero()
		//devuelveEnteroCorraspondiente()
		
		
	}
		static void devuelveStringsContatenados() {
			
			Scanner scanner =new Scanner(System.in);
		
				
			System.out.println("Introduzca su primera cadena: ");
			String entrada1=scanner.nextLine();
			
			
			System.out.println("Introduzca su segunda cadena: ");
			String entrada2=scanner.nextLine();
			
			System.out.println("Su texto es: " + entrada1 + entrada2);
			
		}
		
		
static char devuelveCaracterdependiendoDelNumero(int numero) {
	
	char caracter=(char) numero;
	return caracter;

}



static int devuelveEnteroCorraspondiente(char caracter) {
	
	int numero=(int) caracter;
	return numero;
	
}


static void pideNumeroYDevuelveMultiplosDe3() {

	Scanner scanner= new Scanner(System.in);

	System.out.print("Introduce un número para calcular sus multiplos de 3 hasta el mismo= ");
	int numero=scanner.nextInt();

	if(numero<3) {
		
		System.out.println("No tiene multiplos de 3.");
	} else {
		
		for (int i = 3; i <=numero; i+=3) {

			System.out.println("Impresión de Multiplos= "+i);
		}
	}
	}
}

