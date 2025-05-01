package point.eight;

public class Sistema {
	private String nombre;
	private Usuario[] usuariosLogueados;

	public Sistema(String nombre, int cantidadPersonas) {
		this.nombre = nombre;
		this.usuariosLogueados = new Usuario[cantidadPersonas];
	}

	public Sistema(int cantidad) {
		this.nombre = "";
		this.usuariosLogueados = new Usuario[cantidad];
	}

	public boolean registrarUsuario(String nombre, String password) {
		boolean existe = this.existeUsuario(nombre);
		boolean resultado = false;
		if (!existe) {
			resultado = this.agregarUsuario(nombre, password);;
		}

		return resultado;
	}

	public boolean loguearUsuario(String nombre, String password) {
		boolean logueado=false;
		Usuario buscado=buscarUsuario(nombre);
		if(buscado!=null && buscado.getPassword().equals(password)) {
			logueado=true;
		}
		return logueado;
	}

	private Usuario buscarUsuario(String nombre) {
		Usuario buscado=null;
		int i=0;
		while(i<this.usuariosLogueados.length && buscado==null) {
			if(this.usuariosLogueados[i]!=null && this.usuariosLogueados[i].getUserName().equals(nombre)) {
				buscado=this.usuariosLogueados[i];
			}
			i++;
		}
		return buscado;
	}

	private boolean agregarUsuario(String nombre, String password) {
		boolean agregado = false;
		int i = 0;
		while (i < this.usuariosLogueados.length && !agregado) {
			if (this.usuariosLogueados[i] == null) {
				this.usuariosLogueados[i] = new Usuario(nombre, password);
				agregado = true;
			}
			i++;
		}
		return agregado;
	}

	public boolean existeUsuario(String nombre) {
		boolean existe = false;
		boolean test = false;
		int i = 0;
		while (i < this.usuariosLogueados.length && !existe) {
			if (this.usuariosLogueados[i] != null && this.usuariosLogueados[i].getUserName().equals(nombre))
				existe = true;
			i++;
		}
		return existe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario[] getUsuariosLogueados() {
		return usuariosLogueados;
	}

	public void setUsuariosLogueados(Usuario[] usuariosLogueados) {
		this.usuariosLogueados = usuariosLogueados;
	}

}
