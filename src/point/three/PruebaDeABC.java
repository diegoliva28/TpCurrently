package point.three;

import java.util.Scanner;

public class PruebaDeABC {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		char[] abece=listaDeAbecedario();
		String cadena="";
		int opcion=0;
		
		do {
			System.out.println("Elegi un numero 0 y 25");
			opcion=key.nextInt();
			if(opcion<abece.length && opcion!=-1) {
				System.out.println(abece[opcion]);
				cadena+=abece[opcion];
			}
		}while(opcion!=-1);
		
		System.out.println(cadena);
	}

	private static char[] listaDeAbecedario() {
		int a=65;
		int b=91;
		
		char [] abece=new char[b-a] ;
		for (int i = 0; i < abece.length; i++) {
			abece[i]=(char)a;
			a++;
		}
		return abece;
	}
}
