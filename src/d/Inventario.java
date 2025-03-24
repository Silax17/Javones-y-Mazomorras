package d;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Equipamiento> equipamiento;
	
	public Inventario() {
		this.equipamiento = new ArrayList<Equipamiento>();
	}


	public ArrayList<Equipamiento> getEquipamiento() {
		return equipamiento;
	}


	public void setEquipamiento(ArrayList<Equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}


	public void agregarEquipamiento(Equipamiento equipamiento) {
		this.equipamiento.add(equipamiento);
	}
	
	public void mostrarInventario() {
		for(int i = 0; i < equipamiento.size(); i++) {
			System.out.println(equipamiento.get(i));
		}
	}

}