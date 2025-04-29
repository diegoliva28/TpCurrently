package point.five;

import java.util.Iterator;
import java.util.Scanner;

public class PruebaCapicua {

	public static void main(String[] args) {
	Scanner key=new Scanner(System.in);
			
	String numero="3231";
//	String numero=key.next();
	int [] arrayNumero= new int[numero.length()];

	for (int i = 0; i < arrayNumero.length; i++) {
		arrayNumero[i]=Character.getNumericValue(numero.charAt(i));
		//Manera de obtener un numero escrito en String a numero de valor INT
	}

	boolean capicua=true;
	for (int i = 0,a=arrayNumero.length; i < arrayNumero.length && capicua; i++) {
		capicua=arrayNumero[i]==arrayNumero[--a];
		System.out.println(capicua);
	}
	
	
	}

}
