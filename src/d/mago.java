package d;

import java.util.Scanner;

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

	public void lanzarHechizo(int mana) {
		if(this.mana < mana) {
		System.out.println("No se puede lanzar hechizo");
		}else {
		System.out.println("Hechizo lanzado");
		this.mana= this.mana - mana;
		}
		}

		public void recargarMana(int mana){
		Scanner scan = new Scanner(System.in);
		System.out.println("Cuanto mana quieres recargar?: ");
		mana = scan.nextInt();

		this.mana = this.mana + mana;
		}
	
}
