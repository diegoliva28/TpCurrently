package point.seven;

import java.util.Scanner;

public class PruebaConcesionaria {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		Concesionaria concesionaria=new Concesionaria(5);
		
		
		concesionaria.addAuto(new Auto(1, "1", "OLA"));
		EnumConcesionaria opcion;
		do {
			opcion=opcionObtenida(key);
			
			switch(opcion) {
			case INGRESAR_VEHICULO:
				insertarAuto(key, concesionaria);
				break;
			case MOSTRAR_LISTADO:
				System.out.println(concesionaria.getListadoDeAutos());
				break;
			case MOSTRAR_DETALLE_VEHICULO:
				System.out.println("Ingrese el codigo del auto");
				int codigo=key.nextInt();
				if(concesionaria.SeEncuentraEsteCodigo(codigo)) {
					Auto buscado=concesionaria.traerVehiculo(codigo);
					System.out.println(buscado.toString());
					
				}else {
					System.out.println("No se encuentra");
				}
				break;
			case SALIR:
				break;
			}
		}while(opcion!=EnumConcesionaria.SALIR);
	}

	private static void insertarAuto(Scanner key, Concesionaria concesionaria) {
		System.out.println("Ingrese el codigo del auto");
		int codigo=key.nextInt();
		if(concesionaria.hayEspacio() && !concesionaria.SeEncuentraEsteCodigo(codigo)) {
			System.out.println("Ingrese la marca");
			String marca=key.next();
			System.out.println("Ingrese el modelo");
			String modelo=key.next();
			Auto nuevo=new Auto(codigo,marca,modelo);
			concesionaria.addAuto(nuevo);
		}else {
			System.out.println("No es posible ingresar el coche");
		}
	}

	private static EnumConcesionaria opcionObtenida(Scanner key) {
		EnumConcesionaria opcion=null;
		int opcionValida=0;
		do {
			showMenu();
			opcionValida=key.nextInt();
			if(opcionValida<=EnumConcesionaria.values().length) {
				opcion=EnumConcesionaria.values()[--opcionValida];
			}
			
		}while(opcion==null);
//		}while(opcionValida>EnumConcesionaria.values().length);
		
		return opcion;
	}

	private static void showMenu() {
		for (int i = 0; i < EnumConcesionaria.values().length; i++) {
			System.out.println(i+1+" - "+EnumConcesionaria.values()[i]);
		}
	}

}
