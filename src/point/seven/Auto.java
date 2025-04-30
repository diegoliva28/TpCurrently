package point.seven;

public class Auto {

	private int codigo;
	private String marca;
	private String modelo;

	public Auto(int codigo, String marca, String modelo) {
		this.codigo=codigo;
		this.marca=marca;
		this.modelo=modelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Auto [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
}
