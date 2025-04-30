package point.six;

import java.util.Scanner;

public class PruebaAhorcado {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Player p1 = new Player("Diego", "dai");
		Player p2 = new Player("Tesla", "alejandra");
		Ahorcado game = new Ahorcado(p1, p2);
		
		int turno=game.getJUGADORQUEINICIALAPARTIDA();
		int idAdversario=0;
		
		do {
			idAdversario=game.obtenerAdversario(turno);
			String palabraOculta=game.mostrarPalabraAdversario(idAdversario);
			System.out.println(palabraOculta);
			EnumAhorcado opcionElegida = obtenerOpcion(key);

			switch (opcionElegida) {
			case INGRESAR_LETRA: 
				System.out.println("Ingresa una letra");
				char intento=key.next().charAt(0);
				game.insertarLetra(intento, turno);
				break;
			case ARRIESGAR: 
				System.out.println("Ingresa una palabra");
				String palabra=key.next();
				game.arriegar(palabra, turno);				
				break;
			}
			game.verificarGanador(idAdversario);
			turno=game.turnoDelSiguienteJugador();
		} while (!game.seTerminoLaPartida());

	}

	private static void showMenu() {
		for (int i = 0; i < EnumAhorcado.values().length; i++) {
			System.out.println(i + 1 + " - " + EnumAhorcado.values()[i]);
		}
	}

	private static EnumAhorcado obtenerOpcion(Scanner key) {
		int opcion = 0;
		EnumAhorcado opcionElegida = null;
		do {
			System.out.println("Elegi una opcion");
			showMenu();
			opcion = key.nextInt();
			if (opcion <= EnumAhorcado.values().length) {
				opcionElegida = EnumAhorcado.values()[--opcion];
			}

		} while (opcion > EnumAhorcado.values().length);

		return opcionElegida;
	}
}
