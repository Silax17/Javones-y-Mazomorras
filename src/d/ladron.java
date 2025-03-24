package d;
public class Ladron extends Persona {
	private boolean invisible;

	public Ladron(String nombre, int nivel, int vida, Inventario inventario, boolean invisible) {
		super(nombre, nivel, vida, inventario);
		this.invisible = invisible;
	}

	public boolean isInvisible() {
		return invisible;
	}

	public void setInvisible(boolean invisible) {
		this.invisible = invisible;
	}
	
	public void robar(boolean invisible) {
		if(this.invisible) {
			System.out.println("No t'ha pillat el Olegario, Felicitats");
		}
		else if(!this.invisible) {
			System.out.println("T'ha pillat el Olegario, Perdedor");
		}
		
		
	}
	public void hacerseInvisible() {
		this.invisible=!this.invisible;
	}
	public boolean estaInvisible() {
		return this.invisible;
	}
	
}
	

	
