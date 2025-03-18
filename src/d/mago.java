package d;

public class mago extends Persona {
	private int mana;

	public mago(String nombre, int nivel, int vida, Inventario inventario, int mana) {
		super(nombre, nivel, vida, inventario);
		this.mana = mana;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public static void lanzarHechizo(int mana) {
		
	}
	
	public static void recargarMana(int mana){
		
	}
	
}
