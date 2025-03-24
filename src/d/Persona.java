package d;

public abstract class  Persona {
	private String nombre;
	private int nivel;
	private int vida;
	private Inventario inventario;

	public Persona(String nombre, int nivel, int vida, Inventario inventario) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.vida = vida;
		this.inventario =inventario;
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
	
	// METODES //
	
	public void mostrarInfo() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Nivel: " + this.nivel);		
		System.out.println("Vida: " + this.vida);
		System.out.println("Inventario: " + getInventario().mostrarInventario());
		
	}
	
	public void bajarVida (int vida) {		
		this.vida -= vida;
		
		if (vida < 0) {
			this.vida = 0; 
		}
		
		System.out.println(this.nombre + " esta es su vida actual: " + this.vida);
		
	}
	
	
	public void agregarEquipamiento (Equipamiento equipamiento) {
		this.inventario.agregarEquipamiento(equipamiento);
		
	}

}
