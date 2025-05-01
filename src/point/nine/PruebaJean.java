package point.nine;

public class PruebaJean {

	public static void main(String[] args) {

		Pantalon uno = new Pantalon(EnumMarca.ARMANI, 3, "celeste", 10);
		Pantalon dos = new Pantalon(EnumMarca.LEVIS, 1, "rojo", 20);
		Pantalon tres = new Pantalon(EnumMarca.TASCANI, 2, "amarrillo", 40);

		Pantalon[] pantalones = new Pantalon[3];

//		System.out.println(EnumMarca.ARMANI.toString().compareTo(EnumMarca.TASCANI.toString()));
//		System.out.println(EnumMarca.TASCANI.toString().compareTo(EnumMarca.ARMANI.toString()));
//		COMPARETO
//		Devuelve un
//		-1 si es menor al elemento comparado
//		0 si es igual
//		1 si es mayor al elemento

//		// Agregar pantalones
		ingresarPantalon(uno, pantalones);
		ingresarPantalon(dos, pantalones);
		ingresarPantalon(tres, pantalones);
		ordenarPorMarca2(pantalones);
		mostrarDetallePantalones(pantalones);
//		
////		incremento(pantalones);
////		mostrarDetallePantalones(pantalones);
//		
//		ordenarPorTalle(pantalones);
//		mostrarDetallePantalones(pantalones);
//		ordenarPorColor(pantalones);
//		mostrarDetallePantalones(pantalones);
	}

	private static void ordenarPorColor(Pantalon[] pantalones) {
		for (int i = 0; i < pantalones.length; i++) {
			for (int j = 0; j < pantalones.length - 1; j++) {
				int comparacion = pantalones[j].getColor().compareTo(pantalones[j + 1].getColor());
//				if(comparacion<0) // De Z a A
				if (comparacion > 0) // De A a Z
				{
					Pantalon temp = pantalones[j];
					pantalones[j] = pantalones[j + 1];
					pantalones[j + 1] = temp;
				}
			}
		}
	}

	private static void ordenarPorMarca(Pantalon[] pantalones) {
		for (int i = 0; i < pantalones.length; i++) {
			for (int j = 0; j < pantalones.length-1; j++) {
				if(pantalones[j]!=null && pantalones[j+1]!=null) {
					int comparacion=pantalones[j].getMarca().toString().compareTo(pantalones[j+1].getMarca().toString());
//				if(comparacion<0) // De Z a A
					if(comparacion>0) // De A a Z
					{
					Pantalon temp=pantalones[j];
					pantalones[j]=pantalones[j+1];
					pantalones[j+1]=temp;
				}
		}
			}

	}}
	private static void ordenarPorMarca2(Pantalon[] pantalones) {
		for (int i = 0; i < pantalones.length; i++) {
			for (int j = 0; j < pantalones.length-1; j++) {
				if(pantalones[j]!=null && pantalones[j+1]!=null) {
					int comparacion=pantalones[j].getMarca().compareTo(pantalones[j+1].getMarca());
//				if(comparacion<0) // De Z a A
					if(comparacion<0) // De A a Z
					{
						Pantalon temp=pantalones[j];
						pantalones[j]=pantalones[j+1];
						pantalones[j+1]=temp;
					}
				}
			}
			
		}}

	private static void ordenarPorTalle(Pantalon[] pantalones) {
		for (int i = 0; i < pantalones.length; i++) {
			for (int j = 0; j < pantalones.length-1; j++) {
				if(pantalones[j].getTalle()>pantalones[j+1].getTalle()) { //DE MENOR A MAYOR
//					if(pantalones[j].getTalle()<pantalones[j+1].getTalle()) { //DE MAYOR A MENOR
					Pantalon temp=pantalones[j];
					pantalones[j]=pantalones[j+1];
					pantalones[j+1]=temp;
				}
			}
		}
	}

	private static void incremento(Pantalon[] pantalones) {
		double incremento=1.20;
		
		for (int i = 0; i < pantalones.length; i++) {
			if(pantalones[i]!=null) {
				double aumento=pantalones[i].getPrecio()*incremento;
				pantalones[i].setPrecio(aumento);
			}
		}
	}

	private static void mostrarDetallePantalones(Pantalon[] pantalones) {
		for (int i = 0; i < pantalones.length; i++) {
			if(pantalones[i]!=null) {
				System.out.println(pantalones[i].toString());
			}
		}
	}

	private static boolean ingresarPantalon(Pantalon agregado, Pantalon[] pantalones) {
		int i=0;
		boolean seAgrego=false;
		boolean yaEstaRegistrado=existeElPantalon(pantalones,agregado);
		while(i<pantalones.length && !seAgrego && !yaEstaRegistrado) {
				if(pantalones[i]==null) {
					pantalones[i]= agregado;
					seAgrego=true;
				}
			i++;
		}
		return seAgrego;
	}

	private static boolean existeElPantalon(Pantalon[] pantalones, Pantalon buscado) {
		int i=0;
		boolean existeElPantalon=false;
		while(i<pantalones.length && !existeElPantalon) {
			if(pantalones[i]!=null && 
					pantalones[i].getMarca().equals(buscado.getMarca()) && 
							pantalones[i].getTalle()==buscado.getTalle()){
				existeElPantalon=true;				
			}
			i++;
		}
		return existeElPantalon;
	}

}
