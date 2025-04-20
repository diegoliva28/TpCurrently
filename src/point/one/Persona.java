package point.one;


//1. Implementá la clase Persona siguiendo lo descripto en el diagrama del documento 
//“Anexo.pdf”. 

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.viva=true;
		this.edad=0;
	}
	
	public Persona(String nombre, String genero, long dni, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad=edad;
	}

	public void alimentar(double kilos) {
		this.peso=this.peso+kilos;
	}
	
	public void crecer(double metros) {
		this.altura=this.altura+metros;
	}
	
	public void cumplirAnos() {
		this.edad= ++this.edad;
	}
	
	public void morir() {
		this.viva=false;
	}
	
	public double pesar() {
		return this.peso;
	}
	
	public double medir() {
		return this.altura;
	}
	public int anios() {
		return this.edad;
	}
	

}
