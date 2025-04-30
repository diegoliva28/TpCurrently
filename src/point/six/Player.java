package point.six;

public class Player {

	private String name;
	private String palabra;
	private int id;
	private static int i=1;
	// Variable de control de ID
	private char[] palabraOculta;
	private int lifes;

	public Player(String nombre, String palabraElegida) {
		this.id=i++;
		this.name=nombre;
		this.palabra=palabraElegida;
		this.palabraOculta=getOcultarPalabra(palabraElegida);
		this.lifes=1;
	}

	private char[] getOcultarPalabra(String palabraElegida) {
		char [] palabraOculta= new char [palabraElegida.length()];
		for (int i = 0; i < palabraElegida.length(); i++) {
			palabraOculta[i]='-';
		}
		return palabraOculta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String mostrarPalabraOculta() {
		String palabra="";
		
		for (int i = 0; i < palabraOculta.length; i++) {
			palabra+=palabraOculta[i];
		}
		return palabra;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Player.i = i;
	}

	public char[] getPalabraOculta() {
		return palabraOculta;
	}

	public void setPalabraOculta(char[] palabraOculta) {
		this.palabraOculta = palabraOculta;
	}

	public void loseLife() {
		this.lifes--;
	}

	public int getLifes() {
		return lifes;
	}

	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
}
