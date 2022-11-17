package com.fernandopaniagua.ejemplo;

import java.io.Console;
import java.util.Scanner;

public class NewWay {

	public static void main(String[] args) throws Exception  {
		//Consola
		Console consola = System.console();
		if (consola==null) {
			System.err.println("No dispone de Console. Ejecuta desde fuera de Eclipse.");
			System.exit(-1);
		}
		String nombre = consola.readLine("Introduce tu email:");
		//readPassword devuelve un char[] por seguridad
		char[] password = consola.readPassword("Introduce tu contraseña:");
		
		System.out.printf("Tu email es %s y la contraseña es %s\n", nombre, String.valueOf(password));
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		sc.next();//String
		sc.nextInt();//Entero
		sc.close();
				
	}

}
