package point.six;

import java.util.Scanner;

public class PruebaAhorcado {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		Player p1=new Player("Diego","gurren");
		Player p2=new Player("Tesla","alejandra");
		Ahorcado game= new Ahorcado(p1,p2);
		
		
		EnumAhorcado opcionElegida=obtenerOpcion(key);
		do {
			
		}while(!game.seTerminoLaPartida());
		
	}

	private static void showMenu() {
		for (int i = 0; i < EnumAhorcado.values().length; i++) {
			System.out.println(i+1+ " - "+ EnumAhorcado.values()[i]);
		}
	}

	private static EnumAhorcado obtenerOpcion(Scanner key) {
		int opcion=0;
		EnumAhorcado opcionElegida=null;
		do {
			System.out.println("Elegi una opcion");
			showMenu();
			opcion=key.nextInt();
			if(opcion<=EnumAhorcado.values().length) {
				opcionElegida=EnumAhorcado.values()[--opcion];
			}
			
		}while(opcion>EnumAhorcado.values().length);
		
		return opcionElegida;
	}
}
