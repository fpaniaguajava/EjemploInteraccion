package com.fernandopaniagua.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OldWay {

	public static void main(String[] args) throws Exception  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce tu nombre:");
		String nombre = reader.readLine();
		System.out.println("Tu nombres es " + nombre);
		reader.close();
		
		
		System.out.println(3+2+nombre);//5Fernando
		System.out.println(nombre+3+2);//Fernando32
		System.out.println(nombre+(3+2));//Fernando5
	}

}
