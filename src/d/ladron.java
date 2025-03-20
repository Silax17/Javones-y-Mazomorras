package d;

public class ladron extends Persona {
	private boolean invisible;

	public ladron(String nombre, int nivel, int vida, Inventario inventario, boolean invisible) {

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
		
		
	}
	
	
	

	
	

}
