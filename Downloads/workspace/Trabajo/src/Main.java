import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		String[] tablero = {"_","_","_","_","_","_","_","_","_"};
		int tirada = 0;
		boolean victoria = false;
		char fichaJugador1;
		int modoJuego;
		int jugadasQueFaltan = 9;
		modoJuego = EleccionTipoJugador();
		
		fichaJugador1 = EleccionFicha();
		if (fichaJugador1 == 'o') {tirada = 1;}
		do {	
		
			ShowTablero(tablero);
			
			String ficha = tirada%2 ==0? "x" : "o";
			
			if ((modoJuego == 2 || tirada%2 == 0) && (modoJuego != 3)) {Jugada(ficha, tablero);}
			
			//else {JugadaIA(ficha, tablero);}
			else {JugadaMaquina(ficha, tablero);}
			
			victoria = Comprobacion(tablero);
			
			if (victoria)System.out.println ("¡Enhorabuena, jugador " + ficha + " has ganado!");
			tirada++;
			jugadasQueFaltan--;
			if ((jugadasQueFaltan == 0) && (!victoria)) System.out.println ("Empate, juegue de nuevo");
		
		}
		
		while(!victoria && jugadasQueFaltan != 0);
		ShowTablero(tablero);
	}
	
	
	
	 static int EleccionTipoJugador() {
			
		 int tipoJuego;

		 do{
			 Scanner entrada = new Scanner(System.in);
			 System.out.print("Elija tipo de juego 1 Jugador(1), 2 Jugadores(2) o bien Máquina vs Máquina(3): ");
			 tipoJuego = entrada.nextInt();
			 
			 if (tipoJuego != 1 && tipoJuego != 2 && tipoJuego != 3) {System.out.println("Introduzca un valor válido");}
		 }
		 
		 while(tipoJuego != 1 && tipoJuego != 2  && tipoJuego != 3);
		 if (tipoJuego == 1) {System.out.println("Has elegido modo 1 Jugador");
		 					 		
		 } else if (tipoJuego == 2) {System.out.println("Has elegido modo 2 Jugadores");
		 						
		 }else if (tipoJuego == 3) {System.out.println("Has elegido modo Máquina vs Máquina");
		 }return tipoJuego;
	}
	
	
	
	 static char EleccionFicha() {
		
		 int eleccion;
		 char fichaElegida = ' ';
		 do{
			 Scanner entrada = new Scanner(System.in);
			 System.out.print("Elija ficha x(1) o bien o(2): ");
			 eleccion = entrada.nextInt();
			 
			 if (eleccion != 1 && eleccion != 2) {System.out.println("Eleccion incorrecta");}
		 }
		 
		 while(eleccion != 1 && eleccion != 2);
		 if (eleccion == 1) {System.out.println("Has elegido las fichas x");
		 					 fichaElegida = 'x';
		 					
		 } else if (eleccion == 2) {System.out.println("Has elegido las fichas o");
		 							fichaElegida = 'o';
		 }
		 return fichaElegida;
	}
	

	static void ShowTablero(String[] tablero) {
		System.out.println("              ");
		System.out.println(         tablero[0] + " | " + tablero[1] + " | " + tablero[2]);
		System.out.println(         tablero[3] + " | " + tablero[4] + " | " + tablero[5]);
		System.out.println(         tablero[6] + " | " + tablero[7] + " | " + tablero[8]);
	}
	
	
	
	
	static void Jugada(String ficha, String [] tablero) {
	  int  posicion;
	  do {	
		//System.out.println("Elija una posición que no este ocupada");
		
	    do {
	    	Scanner entrada = new Scanner(System.in);
	    	System.out.println("Donde quieres mover(entre 1 y 9), jugador " + ficha +"?: ");
	    	posicion = entrada.nextInt();
	    	if (posicion > 9) {System.out.println("Posicion no válida");}
	    }	
	
	    while(posicion > 9);
	    
	    posicion--;
	    if (tablero[posicion] == "x" || tablero[posicion] == "o"){
	    	System.out.println("Elija una posición que no este ocupada");
	    }
	  }
	  
	 while(tablero[posicion] == "x" || tablero[posicion] == "o");
	  
	 tablero[posicion] = ficha;
	     
	}
	
	
	
	
	static void JugadaMaquina(String ficha, String [] tablero) {
		  int  posicion;
		  int posicionParaUsuario;
		  do {	
				double aleatorio = Math.random();
				double aleatorioPor9 = aleatorio * 9;
				posicion = (int) aleatorioPor9;
				posicionParaUsuario = posicion + 1;
				System.out.println("La máquina con ficha " + ficha + " ha elegido la casilla " + posicionParaUsuario);
				
			  if (tablero[posicion] == "x" || tablero[posicion] == "o"){
		    	System.out.println("Posición ocupada, la maquina volvera a elegir");
		    }
		  }
		  
		 while(tablero[posicion] == "x" || tablero[posicion] == "o");
		  
		 tablero[posicion] = ficha;
		      
		}
	
	
	
	
	static void JugadaIA (String ficha, String [] tablero) {
		boolean hayQueSalir = false;
		Scanner scanner = new Scanner(System.in);
		
		for (int casilla = 0; casilla < 9; casilla++) {
		  if (hayQueSalir) {break;}
		  if (tablero[casilla] != "_") {
			for (int desplazamiento = -4; desplazamiento < 5; desplazamiento++) {
				System.out.println (casilla + " " + desplazamiento);
				String palabra1 = scanner.nextLine();
				if ((casilla + desplazamiento >= 0 ) && (casilla + desplazamiento <= 8 ) && (desplazamiento !=0)) {
					if (tablero[casilla + desplazamiento] == tablero[casilla]) {
						if ((casilla - desplazamiento >= 0 ) && (casilla - desplazamiento <= 8 )) {
						   if (tablero[casilla - desplazamiento] == "_" ) {
							     tablero[casilla - desplazamiento] = ficha;
							     hayQueSalir = true;
							     break;
						   	}
						 }
					}
				}
			}
		  }
		}
		
		JugadaMaquina(ficha, tablero);
	}	
		
	
	
	
	
	static boolean Comprobacion(String tablero[]) {
	
	if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")) {
		return true;
		
	}else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
			return true;
		
	}else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
		return true ;
	
	}else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
		return true ;
		
	}else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
		return true ;
		
	}else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
		return true ;
		
	}else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {
		return true ;
		
	}else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")) {
		return true ;
	
	}
	return false;
	
	   }
	}

