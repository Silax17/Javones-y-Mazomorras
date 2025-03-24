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
	
	public String mostrarInventario() {
		String inventario = "";
		for(int i = 0; i < equipamiento.size(); i++) {
			inventario += equipamiento.get(i).getNombre() + " ";
		}
		return inventario;
	}

}