package d;

public class Equipamiento {
	private String nombre;
	private String tipo;
	
	public Equipamiento(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	  @Override
	    public String toString() {
	        return "Equipamiento: " + nombre + " (Tipo: " + tipo + ")";
	    }

}