package d;

import java.util.ArrayList;

public class Inventari {
	ArrayList<Equipament> equipament = new ArrayList<Equipament>();
	
	public Inventari(ArrayList<Equipament> equipament) {
		this.equipament = equipament;
	}

	public ArrayList<Equipament> getEquipament() {
		return equipament;
	}

	public void setEquipament(ArrayList<Equipament> equipament) {
		this.equipament = equipament;
	}

	public void agregarEquipamiento(ArrayList<Equipament> equipament) {
		this.equipament = equipament;
	}
	
	public void mostrarInventario() {
		for(int i = 0; i < equipament.size(); i++) {
			System.out.println(equipament.get(i));
		}
	}

}