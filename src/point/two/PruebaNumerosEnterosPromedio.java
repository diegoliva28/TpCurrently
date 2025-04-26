package point.two;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaNumerosEnterosPromedio {

	public static void main(String[] args) {
//		Scanner key=new Scanner(System.in);
		System.out.println("Ingrese por teclado el tamaño del array");
		int longitud=new Scanner(System.in).nextInt();
		
		int [] array=new int[longitud];
		int total=0;
		
		for (int i = 0; i < array.length; i++) {
			Double number=Math.random()*10;
			array[i]=number.intValue();
			total+=array[i];
		}
		
//		int x=Arrays.stream(array).sum();
//		System.out.println(x);
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+" - "+array[i]);
		}
		
		System.out.println("Promedio "+total/array.length);
		
	}
}
