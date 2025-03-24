package d;

import java.util.ArrayList;

public class main {

	    public static void main(String[] args) {
	    	
	    	
	    	// Crear una espada y un escudo
	    	Equipamiento espada = new Equipamiento("Espada", "Arma");
	        Equipamiento escudo = new Equipamiento("Escudo", "Defensa");

	        // Crear un inventario vacio
	        Inventario inventario = new Inventario();

	        // Agregar a los inventarios de todos los personajes una espada y un escudo
	        inventario.agregarEquipamiento(espada);
	        inventario.agregarEquipamiento(escudo);
	       
	        // Crear los personajes
	        Guerrero guerrero = new Guerrero("Arthur", 10, 150, inventario, false, null);
	        Mago mago = new Mago("Gandalf", 15, 100, inventario, 200);
	        Ladron ladron = new Ladron("Robin", 8, 90, inventario, false);

	       
	        System.out.println("Información del Guerrero");
	        guerrero.mostrarInfo();
	        
	        System.out.println("Información del Mago");
	        mago.mostrarInfo();
	        
	        System.out.println("Información del Ladron");
	        ladron.mostrarInfo();
	        
	      
	        guerrero.proteger(mago); // Probar funciones
	        
	       
	        guerrero.bajarVida(50);  
	        
	        
	        guerrero.dejardeProteger();
	        
	      
	        mago.lanzarHechizo(50);
	        
	        
	        ladron.robar(true);  
	        
	       
	        ladron.hacerseInvisible();
	        ladron.robar(false); 
	        
	        
	        System.out.println("Inventario del Guerrero");
	        System.out.println(guerrero.getInventario().mostrarInventario());
	        
	        System.out.println("Inventario del Mago");
	        System.out.println(mago.getInventario().mostrarInventario());
	        
	        System.out.println("Inventario del Ladron");
	        System.out.println(ladron.getInventario().mostrarInventario());
	    }
	}
