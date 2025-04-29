package point.six;

public class Ahorcado {
//	private Player [] players=new Player [2];
	private Player p1;
	private Player p2;
	private final int JUGADORQUEINICIALAPARTIDA;
	private int turno;
	private Player ganador;
	
	public Ahorcado(Player p1, Player p2) {
		this.p1=p1;
		this.p2=p2;
		this.JUGADORQUEINICIALAPARTIDA=iniciarElJugador();
		this.turno=this.JUGADORQUEINICIALAPARTIDA;
		this.ganador=null;
	}

	public int iniciarElJugador() {
//		int random=(int) (Math.random()*2);
		Double number=(Math.random()*2);
		int random=number.intValue()+1;
		return random;
	}

	public int turnoDelSiguienteJugador() {
		if(this.turno>2){
			this.turno=1;
		}
		
		return this.turno++;
	}
	
	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}

	public int getJUGADORQUEINICIALAPARTIDA() {
		return JUGADORQUEINICIALAPARTIDA;
	}

	public String mostrarPalabraAdversario(int idAdversario) {
		String palabraOculta="";
		if(idAdversario==p1.getId()) {
			palabraOculta=p1.mostrarPalabraOculta();
		}else
		if(idAdversario==p2.getId()) {
			palabraOculta=p2.mostrarPalabraOculta();			
		}
		return palabraOculta;
	}

	public void insertarLetra(char intento, int id_oponente) {
		if(id_oponente==p1.getId()) {
			char[] palabraJugador=p1.getPalabraOculta();
			boolean seEncontro=false;
			
			for (int i = 0; i < palabraJugador.length; i++) {
				if(p1.getPalabra().charAt(i) ==intento) {
					palabraJugador[i]=intento;
					seEncontro=true;
				}			
			}
			
			if(seEncontro) {
				p1.setPalabraOculta(palabraJugador);
			}else {
				p1.loseLife();
			}			
		}
		if(id_oponente==p2.getId()) {
			char[] palabraJugador=p2.getPalabraOculta();
			boolean seEncontro=false;
			
			for (int i = 0; i < palabraJugador.length; i++) {
				if(p2.getPalabra().charAt(i) ==intento) {
					palabraJugador[i]=intento;
					seEncontro=true;
				}			
			}
			
			if(seEncontro) {
				p2.setPalabraOculta(palabraJugador);
			}else {
				p2.loseLife();
			}			
		}
	}

	public boolean seTerminoLaPartida() {
		boolean seTermino=false;
		if(p1.getLifes()==0) {
			seTermino=true;
			this.ganador=p2;
		}
		if(p2.getLifes()==0) {
			seTermino=true;
			this.ganador=p1;
		}
		
		return seTermino;
	}

	
}
