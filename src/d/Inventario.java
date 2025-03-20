package d;

import java.util.ArrayList;

public class Inventario {
	ArrayList<Equipamiento> equipamiento = new ArrayList<Equipamiento>();
	
	public Inventario(ArrayList<Equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}


	public ArrayList<Equipamiento> getEquipamiento() {
		return equipamiento;
	}


	public void setEquipamiento(ArrayList<Equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}


	public void agregarEquipamiento(ArrayList<Equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}
	
	public void mostrarInventario() {
		for(int i = 0; i < equipamiento.size(); i++) {
			System.out.println(equipamiento.get(i));
		}
	}

}