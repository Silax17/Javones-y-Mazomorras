package d;

public abstract class  Persona {
	private String nombre;
	private int nivel;
	private int vida;
	private Inventario inventario;

	public Persona(String nombre, int nivel, int vida, Inventari inventario) {
		
		this.nombre = nombre;
		this.nivel = nivel;
		this.vida = vida;
		this.inventari = inventario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	

}
