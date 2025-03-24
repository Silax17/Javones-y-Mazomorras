package d;

public class main {

	    public static void main(String[] args) {
	        mago mago = new mago("Gandalf", 10, 100, 50);
	        guerrero guerrero = new guerrero("Aragorn", 12, 150);
	        ladron ladron = new ladron("Bilbo", 8, 80);

	        mago.mostrarInfo();
	        guerrero.mostrarInfo();
	        ladron.mostrarInfo();

	        Equipamiento espada = new Equipamiento("Espada", "Arma");
	        Equipamiento escudo = new Equipamiento("Escudo", "Armadura");
	        mago.agregarEquipamiento(espada);
	        guerrero.agregarEquipamiento(escudo);

	        mago.getInventario().mostrarInventario();
	        guerrero.getInventario().mostrarInventario();

	        mago.lanzarHechizo(20);
	        guerrero.proteger(mago);
	        mago.bajarVida(30);
	        guerrero.bajarVida(30);
	        guerrero.dejarDeProteger();
	        ladron.hacerseInvisible();
	        ladron.robar();
	    }
	}


}
