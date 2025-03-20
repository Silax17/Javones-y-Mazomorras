package d;

public class guerrero extends Persona {
	
	private boolean protegiendo; 
	private Persona compañeroProtegido;
	
	
	public guerrero(String nombre, int nivel, int vida, Inventario inventario, boolean protegiendo, Persona compañeroProtegido) {
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
	
	
	public void proteger (Persona compañero) {
		
		if (this.protegiendo) {
			System.out.println("El compañero NO puede estar protegido! ");
			
		} else if(!this.protegiendo) {
				this.compañeroProtegido = compañero;
				System.out.println(getNombre() + "ha protegido a este compañero: " + compañero.getNombre());
		}
	}	
	
	public void dejardeProteger () {
		
		if (this.protegiendo) {
			System.out.println(getNombre() + "le ha quitado la protección a este compañero: " + this.compañeroProtegido.getNombre());
			
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
		
	}
	
	
	
	
	
	
	
	

}
