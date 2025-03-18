package d;

import java.util.ArrayList;

public class inventario {
	ArrayList<equipamiento> equipamiento = new ArrayList<equipamiento>();
	
	public inventario(ArrayList<equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}


	public ArrayList<equipamiento> getEquipamiento() {
		return equipamiento;
	}


	public void setEquipamiento(ArrayList<equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}


	public void agregarEquipamiento(ArrayList<equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}
	
	public void mostrarInventario() {
		for(int i = 0; i < equipamiento.size(); i++) {
			System.out.println(equipamiento.get(i));
		}
	}

}