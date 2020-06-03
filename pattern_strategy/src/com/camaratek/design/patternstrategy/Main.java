package com.camaratek.design.patternstrategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Context context = new Context();
		boolean fin = false;
		while(!fin)
		{
			System.out.println("Donnez le nom de la classe: ");
			Scanner sc = new Scanner(System.in);
			Class cl = Class.forName(sc.nextLine());
			Object o = cl.newInstance();
			System.out.println( "Etape 1 de l'algorithme" );
			context.setStrategy((IStrategy) o);
			context.process();
			System.out.println( "Etape final de l'algorithme" );
		}
		
		
		
	}

}
