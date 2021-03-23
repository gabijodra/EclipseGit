import java.util.Scanner;

public class EjerciciciosUnidad2 {
	

public static void main(String[] args) {

	//Ejercicio1();
	//Ejercicio2();
	//Ejercicio3();
	//Ejercicio4();
	//Ejercicio5();
	//Ejercicio6();
	//Ejercicio7();
	//Ejercicio8();
	//Ejercicio9();
	//Ejercicio10();
	//Ejercicio11();
	//Ejercicio12();
	//Ejercicio13();
	//Ejercicio14();
	//Ejercicio15();
	//Ejercicio16();
	//Ejercicio17();
	//Ejercicio18();
	//Ejercicio19();
	//Ejercicio20();
	Ejercicio21();
	//Ejercicio22();
	//Ejercicio23();
	//Ejercicio24();
	//Ejercicio25();
	//Ejercicio26();
	//Ejercicio27();
	//Ejercicio28();
	//Ejercicio29();
	//Ejercicio30();
	//Ejercicio31();
	//Ejercicio32();
	//Ejercicio33();
	//Ejercicio34();
	//Ejercicio35();
	//Ejercicio36();
	//Ejercicio37();
	//Ejercicio38();
	//Ejercicio39();
	//Ejercicio40();	
}


static void Ejercicio1() {

	Scanner entrada =new Scanner(System.in);
    int a;
    int b;
    int suma = 0;
    
    System.out.print("Introduzca el primer sumando ");{
    a =entrada.nextInt();
    
    System.out.print("Introduzca el segundo sumando " );
     b = entrada.nextInt();
     
     
    suma = a + b;
    
    System.out.println("La suma de los numeros es " +  suma);
    
    
	}
}


static void Ejercicio2() {
	
    Scanner entrada =new Scanner(System.in);
    
    int a;
    int b;
	int resta = 0;
	    
	System.out.print("Introduzca el minuendo  ");
	    a =entrada.nextInt();
	    
    System.out.print("Introduzca el substraendo  " );
	     b = entrada.nextInt();
	      
	resta = a - b;
	    
    System.out.println("La resta de los numeros es " +  resta);
		
		
	}


static void Ejercicio3() {

	
	Scanner entrada =new Scanner(System.in);

	    int a;
	    int b;
	    int producto = 0;
	    
	    System.out.print("Introduzca el primer factor  ");
	    a =entrada.nextInt();
	    
	    System.out.print("Introduzca el segundo factor  " );
	     b = entrada.nextInt();
	     
	    producto = a * b;
	    
	    System.out.println("El producto de los numeros es " +  producto);
		
}


static void Ejercicio4() {

	
 Scanner entrada =new Scanner(System.in);
 
 	int a;
 	int b;
 	int division = 0;
	    
 	System.out.print("Introduzca el dividendo  ");
	    a =entrada.nextInt();
	    
	System.out.print("Introduzca el divisor  " );
	     b = entrada.nextInt();
	          
	division = a / b;
	    
	System.out.println("La division de los dos numeros es " +  division);
	
}


static void Ejercicio5() {

 Scanner entrada =new Scanner(System.in);

	    double radio;
	    double π;
	    double producto = 0;
	    
	    System.out.print("Introduzca el radio  ");
	    radio =entrada.nextInt();
	    
	     π = 3.1415;
	     
	     
	    producto = radio * 2 * π;
	    
	    System.out.println("El perímetro de la circunferencia es  " +  producto);

}


static void Ejercicio6() {


	 Scanner entrada =new Scanner(System.in);

	    double radio;
	    
	    System.out.print("Introduzca el radio  ");
	    radio =entrada.nextInt();
	   
	    double radioAlCuadrado = radio * radio;
	    double π = 3.1415;
	    double producto = 0;
	    
	    producto = π * radioAlCuadrado;
	    
	    System.out.println("El area de la circunferencia es  " +  producto);
		
}



static void Ejercicio7() {
	
  Scanner entrada =new Scanner(System.in);
	
	int a;
	int b;
	int suma = 0;
		    
		    System.out.print("Introduzca el primer sumando ");
		    a = entrada.nextInt();
		    
		    System.out.print("Introduzca el segundo sumando " );
		     b = entrada.nextInt();
		     
		     
		    suma = a + b;
		    
		    System.out.println("La suma de los numeros es " +  suma);

	        if ( suma % 2 == 0 )
	        {
	            System.out.println( "ES PAR" );
	        }
}



static void Ejercicio8() {
	
	Scanner entrada =new Scanner(System.in);
	
		// y = 3x + 5.
			
	    int x;
	    int producto = 0;
	    
	    System.out.print("Introduzca un valor para x ");
	    x =entrada.nextInt();
	    	     
	    producto = 3 * x + 5;
	    
	    System.out.println("El valor de y es  " +  producto);
			
		    

	}



static void  Ejercicio9() {

	 Scanner entrada =new Scanner(System.in);

		// y = 2x^2 - 6x + 12
		
	    int x;
	    int producto = 0;
	    
	    System.out.print("Introduzca un valor para x ");
	    x =entrada.nextInt();
	    	     
	    producto = (2 * x * x) - (6 * x) + 12;
	    
	    System.out.println("El valor de y es  " +  producto);

}



static void Ejercicio10() {

	Scanner entrada =new Scanner(System.in);
		
		    int a;
		    int b;
		    int suma = 0;
		    
		    System.out.print("Introduzca el primer sumando ");
		    a = entrada.nextInt();
		    
		    System.out.print("Introduzca el segundo sumando " );
		     b = entrada.nextInt();
		     
		     
		    suma = a + b;
		    
		    System.out.println("La suma de los numeros es " +  suma);

			if (suma == 0) {
				System.out.println("El número es neutro o 0 ");
				
				
			} else if (suma < 0) {
				
				System.out.println("El número es negativo");
				
			} else {
				
				System.out.println("El número es positivo");

			}
	}			


static void Ejercicio11() {
	  
	
	 Scanner entrada =new Scanner(System.in);
		
	   int numero;
	   
	   int factorial = 1;
	    
	    System.out.print("Introduzca un numero  ");
	    numero =entrada.nextInt();
	    
	    for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
	    	  
	 System.out.println("El factorial de " + numero + " es " + factorial );

}


static void Ejercicio12() {
	
	 Scanner entrada = new Scanner(System.in);
	
        int contador,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = entrada.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++) {
        	
            if((numero % I) == 0)  {
                contador++;
            }
        }
 
        if(contador <= 2) {
        	
            System.out.println("El numero es primo");
            
        }else{
        	
            System.out.println("El numero no es primo");
        }
}

 static void Ejercicio13() {
	
	 Scanner entrada = new Scanner(System.in);
        
        int a,b;
 
        System.out.print("Ingresa un numero: ");
        a = entrada.nextInt();
        
        System.out.print("Ingresa otro numero: ");
        b = entrada.nextInt();
          
        	if (a % b == 0) {
				System.out.println(b + " es divisor de " + a);
				
				
			} else if (b % a == 0) {
				
				System.out.println(a + "  es divisor de " + b);
				
			} else {
				
				System.out.println("No son divisores entre sí");

			}
        }


 static void Ejercicio14() {
	
	Scanner entrada =new Scanner(System.in);
		 
	int a,i, suma = 0;
		  
	System.out.print("Ingresa un numero: ");
	a = entrada.nextInt();
	        
	   for (i = 1; i < a; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
	       
	     if (a % i == 0) {
	                suma = suma + i;   // si es divisor se suma
	                
	                      } if (suma == a) {           // si el numero es igual a la suma de sus divisores es perfecto                
	                    	  System.out.println("Perfecto");
	            
	                      } else {
	                    	  System.out.println("No es perfecto");


	}
  }
 }

	        
 static void Ejercicio15() {
	
 Scanner entrada =new Scanner(System.in);
	
		int a;
		
	    System.out.print("Ingresa un numero: ");
        a = entrada.nextInt();
        
        
        if (a == 1){
        System.out.print("Lunes");
        	  
        } if (a == 2){
        System.out.print("Martes");
            	  
        } if (a == 3){
        System.out.print("Miércoles");
                	  
        } if (a == 4){
        System.out.print("Jueves");
                    	  
        } if (a == 5){
        System.out.print("Viernes");
                        	  
        } if (a == 6){
        System.out.print("Sábado");
                            	  
        } if (a == 7){
        System.out.print("Domingo");
        
        } else if (a > 7)  {
        System.out.println("Número no válido");
        
       }
}
 
 static void Ejercicio16() {
	
    //	16. Implementa un método que imprima por pantalla los números del 1 al 100.
		
		  System.out.println("Numeros del 1 al 100: ");   
		  
	      int i=1;
	      
	      while(i<=100) {
	      System.out.println(i);                                                                         
	       i++;
	    }
	}



static void Ejercicio17() {

	   //	17. Implementa un método que, dado un número, imprima por pantalla su tabla de multiplicar.
		
		 Scanner entrada =new Scanner(System.in);
		 
			int n;
			
	        System.out.print("Introduce un número entero: ");                                                         
	        n = entrada.nextInt();
	        
	        System.out.println("Tabla del " + n);
	        for(int i = 1; i<=10; i++){
	        	
	        System.out.println(n + " * " + i + " = " + n*i);        
	        
	        }
		}



static void Ejercicio18() {
	  
	Scanner scanner = new Scanner(System.in);
	int numero;
	do{
		System.out.print("Introduce un numero entero >0 ");
	    numero = scanner.nextInt();
	           
	  }while(numero<=0);
	   System.out.println("Suma desde 1 hasta " + numero + " = " + suma1N(numero));

	   }
 
	    //método recursivo para calcular la suma desde 1 hasta N
 
	     static double suma1N(int n){
	        if(n == 1) 
	          return 1;
	        else
	          return n + suma1N(n-1);
	    }	



static void Ejercicio19() {
	
	Scanner scanner = new Scanner(System.in);
	int numero;
	do{
		System.out.print("Introduce un numero entero >0 ");
	    numero = scanner.nextInt();
	           
	  }while(numero<=0);
	   System.out.println("Suma desde 1 hasta " + numero + " = " + producto1N(numero));

	  }

	public static double producto1N(int n){        
		if(n == 1)  //caso base
	       return 1;
	     else
	    return n * producto1N(n-1);
		
	  }	

	
	

static void Ejercicio20() {
		
	int sumaPositivos = 0;
		 
	    Scanner sc=new Scanner(System.in);
	        int n;
	        do {
	            System.out.println("Ingresa un numero; cuando quieras terminar escribe 0");
	            n= sc.nextInt();
	            
	                if(n > 0 && n!= 0){
	                    System.out.println("El numero "+n+" es positivo");
	                    sumaPositivos = sumaPositivos + n;
	                }else{
	                    System.out.println("El numero "+n+" es negativo");
	                }
	            }
	        while(n != 0);

	        System.out.println("la suma de los numeros positivos introducidos es "+sumaPositivos);
	}



static void Ejercicio21() {
        
	  
	int sumaPositivos = 0;
	 
    Scanner sc=new Scanner(System.in);
        int n;
        int numnumeros = 0;
        do {
            System.out.println("Ingresa un numero; cuando quieras terminar escribe 0");
            n= sc.nextInt();
            
                if(n > 0 && n!= 0){
                    System.out.println("El numero "+n+" es positivo");
                    sumaPositivos = sumaPositivos + n;
                }else{
                    System.out.println("El numero "+n+" es negativo");
                }
            }
        while(n != 0);

        System.out.println("la suma de los numeros positivos introducidos es "+sumaPositivos);
}


static void Ejercicio23() { 
	
	Scanner scanner = new Scanner(System.in);
	int numero;
	
		System.out.print("Introduce una nota del 0 al 10 ");
	    numero = scanner.nextInt();
	    
	    if ((numero < 0) || (numero > 10 )) { 
	    	System.out.println("Introduzca una nota del 0 al 10");
	    
	    }if ((numero == 0) || (numero == 1 ) || (numero == 2 )) { 
	    	System.out.println("Muy deficiente");
	    	
	    }if ((numero == 3) || (numero == 4 ))  { 
		    System.out.println("Insuficiente"); 
		    
	    }if (numero == 5) { 
			System.out.println("Suficiente");
			
	    }if (numero == 6) { 
		    System.out.println("Bien");
		    
	    }if ((numero == 7) || (numero == 8)) { 
		    System.out.println("Notable");
		    
	    }if (numero == 9) { 
			System.out.println("Sobresaliente");
		
	    }if(numero == 10) { System.out.println("¿Quieres que este alumno tenga matrículo de honor?(si(1) o no(2)");
	        numero = scanner.nextInt();  
	        if (numero == 1) System.out.println("Sobresaliente++");
	        if (numero == 2) System.out.println("Sobresaliente");
	    }  
	}
}
	























































































