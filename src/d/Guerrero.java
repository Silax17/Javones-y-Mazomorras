package d;

public class Guerrero extends Persona {
	
	private boolean protegiendo; 
	private Persona compañeroProtegido;
	
	
	public Guerrero(String nombre, int nivel, int vida, Inventario inventario, boolean protegiendo, Persona compañeroProtegido) {
		super(nombre, nivel, vida, inventario);
		this.protegiendo = false;
		this.compañeroProtegido = null;
		
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
	
	
	// METODES //
	
	public void proteger (Persona compañero) {
		
		if (this.protegiendo) {
			System.out.println("El compañero NO puede estar protegido! ");
			
		} else if(!this.protegiendo) {
				this.compañeroProtegido = compañero;
				this.protegiendo=true;
				System.out.println(getNombre() + " ha protegido a este compañero: " + compañero.getNombre());
		}
	}	
	
	public void dejardeProteger () {
		
		if (this.protegiendo) {
			System.out.println(getNombre() + " le ha quitado la protección a este compañero: " + this.compañeroProtegido.getNombre());
			
			this.protegiendo = false; 
			this.compañeroProtegido = null; // si el company no estar sent protegit s'assigna com a null aquell company que estava protegit //
			
		} else {
			System.out.println(this.getNombre() + " no está protegiendo a nadie!  ");
		}
		
	}
	
	@Override // persona ja conté el metode bajarVida, en aquest cas la classe guerrero conté un metode de bajarVida diferent a Persona // 
	
	public void bajarVida (int vida) {
		
		if (this.protegiendo) {
			vida = vida / 2; 
		}
		
		super.bajarVida (vida); // es crida el bajarVida de Persona per restarli el guerrero la vida al personatge // 
		
	}
	
	public Persona estaProtegiendo() { // el personatge indica que esta sent protegit 
		
		return this.compañeroProtegido;
		
	}
	
	
	
	
	
	
	
	

}
