package point.five;

import java.util.Iterator;
import java.util.Scanner;

public class PruebaCapicua {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
//	5. Crea una aplicación que pida un numero por teclado para después comprobar si el numero
//	 introducido es capicua, es decir, que se lee igual sin importar la dirección. Por ejemplo, si
//	 introducimos 30303 es capicua, si introducimos 30430 no es capicua. Piensa como podés
//	 dar la vuelta al número. Una forma de pasar un número a un array es esta
//	 Character.getNumericValue(cadena.charAt(posicion)).

		String numero = "122";
//	String numero=key.next();
		int[] arrayNumero = new int[numero.length()];

		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = Character.getNumericValue(numero.charAt(i));
			// Manera de obtener un numero escrito en String a numero de valor INT
		}

		// way one
		boolean capicua = true;
		for (int i = 0, a = arrayNumero.length; i < arrayNumero.length && capicua; i++) {
			capicua = arrayNumero[i] == arrayNumero[--a];
			System.out.println(capicua);
		}

		// Varias formas de hacerlo

		// Second form
		int[] arrayCapicua = new int[numero.length()];

		// Con esto doy vuelta el numero
		int ordenInverso = numero.length();
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayCapicua[i] = Character.getNumericValue(numero.charAt(--ordenInverso));
			// Manera de obtener un numero escrito en String a numero de valor INT
		}

		for (int i = 0; i < numero.length(); i++) {
			System.out.println(arrayCapicua[i] == arrayNumero[i]);
		}

		// third form
		int longitud=arrayNumero.length;
		for (int i = 0; i < arrayNumero.length; i++) {
			System.out.println(arrayNumero[i]==arrayNumero[--longitud]);
		}
		
		//Fourth form
		String number="123";
		String palabraInvertida=new StringBuilder(number).reverse().toString();
		
		System.out.println(palabraInvertida);
		for (int i = 0; i < number.length(); i++) {
			System.out.println(number.charAt(i)==palabraInvertida.charAt(i));
		}
		
	}
//		System.out.println(arrayCapicua);
	// Muestra la pocion en memoria
}
