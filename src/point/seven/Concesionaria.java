package point.seven;

import java.util.Arrays;

public class Concesionaria {
	
	private Auto[] autos;
	
	public Concesionaria(int cantidadDeAutos) {
		this.autos=new Auto[cantidadDeAutos];
	}

	public boolean hayEspacio() {
		boolean hayEspacio=false;
		int i=0;
		
		while(i<this.autos.length && !hayEspacio) {
			if(this.autos[i]==null) {
				hayEspacio=true;
			}
			i++;
		}
		
		return hayEspacio;
	}
	
	public Auto traerVehiculo(int codigo) {
		Auto seEncuentra=null;
		int i=0;
		
		while(i<this.autos.length && seEncuentra==null) {
			if(this.autos[i].getCodigo()==codigo) {
				seEncuentra=this.autos[i];
			}
			i++;
		}
		return seEncuentra;
	}

	public boolean SeEncuentraEsteCodigo(int codigo) {
		boolean seEncuentra=false;
		int i=0;
		
		while(i<this.autos.length && !seEncuentra) {
			if(this.autos[i]!=null && this.autos[i].getCodigo()==codigo) {
				seEncuentra=true;
			}
			i++;
		}
		return seEncuentra;
	}

	public void addAuto(Auto nuevo) {
		boolean hayEspacio=false;
		int i=0;
		
		while(i<this.autos.length && !hayEspacio) {
			if(this.autos[i]==null) {
				this.autos[i]=nuevo;
				hayEspacio=true;
			}
			i++;
		}
		
	}

	public String getListadoDeAutos() {
		String listado="";
//		\n
		for (int i = 0; i < autos.length; i++) {
			if(autos[i]!=null) {
				listado+= i+1 +" - "+autos[i].toString()+"\n";
			}
		}	
		return listado;
	}
	@Override
	public String toString() {
		return "Concesionaria [autos=" + Arrays.toString(autos) + "]";
	}

	

	
	
}
