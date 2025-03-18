package d;

public class guerrero extends Persona {
	
	private boolean protegiendo; 
	private Persona compañeroProtegido;
	
	
	public guerrero(String nombre, int nivel, int vida, Inventari inventario, boolean protegiendo, Persona compañeroProtegido) {
		super(nombre, nivel, vida, inventario);
		this.protegiendo = protegiendo;
		this.compañeroProtegido = compañeroProtegido;
		
	}


	public boolean isProtegiendo() {
		return protegiendo;
	}


	public void setProtegiendo(boolean protegiendo) {
		this.protegiendo = protegiendo;
	}


	public Persona getCompañeroProtegido() {
		return compañeroProtegido;
	}


	public void setCompañeroProtegido(Persona compañeroProtegido) {
		this.compañeroProtegido = compañeroProtegido;
	}
	
	
	
	

}
