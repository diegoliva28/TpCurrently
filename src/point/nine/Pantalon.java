
package point.nine;

public class Pantalon {
	private EnumMarca marca;
	private int talle;
	private String color;
	private double precio;
	public Pantalon(EnumMarca marca, int talle, String color, double precio) {
		super();
		this.marca = marca;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
	}
	public EnumMarca getMarca() {
		return marca;
	}
	public void setMarca(EnumMarca marca) {
		this.marca = marca;
	}
	public int getTalle() {
		return talle;
	}
	public void setTalle(int talle) {
		this.talle = talle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Pantalon [marca=" + marca + ", talle=" + talle + ", color=" + color + ", precio=" + precio + "]";
	}
}
