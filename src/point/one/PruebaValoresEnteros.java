package point.one;

import java.util.Scanner;

public class PruebaValoresEnteros {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		//Array
		int [] numerosEnteros=new int[3];
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Ingresa el valor");
			numerosEnteros[i]=key.nextInt();
		}
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println(i+" - "+numerosEnteros[i]);
		}
	}
}
