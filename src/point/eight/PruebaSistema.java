package point.eight;

import java.util.Scanner;

public class PruebaSistema {

	public static void main(String[] args) {

		Scanner key=new Scanner(System.in);
		EnumSistema opcion;
//		Sistema system=new Sistema(5);
		Sistema system=new Sistema(3);
		do {
			opcion=opcionElegida(key);		
			
			switch (opcion) {
			case INGRESAR_NOMBRE_SISTEMA:
				System.out.println("Ingrese nombre al sistema");
				String name=key.next();
				system.setNombre(name);
				System.out.println("El sistema tiene nombre "+!(system.getNombre().equals("")));
				break;
			case AGREGAR_USUARIO:		
				System.out.println("Ingrese el nombre de usuario");
				String username=key.next();				
				System.out.println("ingrese password");
				String password=key.next();
				
				System.out.println("Se pudo agregar usuario: "+system.registrarUsuario(username, password));
				
				break;
			case LOGUEAR_USUARIO:		
				System.out.println("Ingrese el nombre de usuario");
				String nombreUsuario=key.next();				
				System.out.println("ingrese password");
				String contrasenia=key.next();
				
				System.out.println("Se pudo loguear usuario: "+system.loguearUsuario(nombreUsuario, contrasenia));
				
				
				break;
			case SALIR:				
				break;
			}
		}while(opcion!=EnumSistema.SALIR);
		
		
	}

	private static EnumSistema opcionElegida(Scanner key) {
		EnumSistema opcion=null;
		
		do {
			showMenu();
			char elegida=key.next().charAt(0);
			switch (elegida) {
			case 'a':
				opcion=EnumSistema.INGRESAR_NOMBRE_SISTEMA;
				break;
			case 'b':
				opcion=EnumSistema.AGREGAR_USUARIO;
				break;
			case 'c':
				opcion=EnumSistema.LOGUEAR_USUARIO;
				break;
			case 'd':
				opcion=EnumSistema.SALIR;
				break;
			default:
				System.out.println("Elegiste una opcion invalida");
				break;
			}
		}while(opcion==null);
		return opcion;
	}

	private static void showMenu() {
		char inicio='a';
		for (int i = 0; i < EnumSistema.values().length; i++) {
			System.out.println(inicio+ " - "+ EnumSistema.values()[i]);
			inicio++;
		}
	}

}
