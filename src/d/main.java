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
	        Guerrero guerrero = new Guerrero("Oriol el destrosamorenes", 10, 150, inventario, false, null);
	        Mago mago = new Mago("Jano el Calm Minder", 15, 100, inventario, 200);
	        Ladron ladron = new Ladron("Black Alex", 8, 90, inventario, false);

	       
	        System.out.println("Información del Guerrero");
	        guerrero.mostrarInfo();
	        
	        System.out.println(" ");
	        System.out.println("Información del Mago");
	        mago.mostrarInfo();
	        
	        System.out.println(" ");
	        System.out.println("Información del Ladron");
	        ladron.mostrarInfo();
	        
	        System.out.println(" ");
	        guerrero.proteger(mago); // Probar funciones
	        System.out.println(" ");
	       
	        guerrero.bajarVida(50);  
	        System.out.println(" ");
	        
	        guerrero.dejardeProteger();
	        System.out.println(" ");
	      
	        mago.lanzarHechizo(50);
	        System.out.println(" ");
	        
	        ladron.robar(true);  
	        
	        System.out.println(" ");
	        ladron.hacerseInvisible();
	        System.out.println(" ");
	        ladron.robar(false); 
	        
	        System.out.println(" ");
	        System.out.println("Inventario del Guerrero");
	        System.out.println(guerrero.getInventario().mostrarInventario());
	        System.out.println(" ");
	        System.out.println("Inventario del Mago");
	        System.out.println(mago.getInventario().mostrarInventario());
	        System.out.println(" ");
	        System.out.println("Inventario del Ladron");
	        System.out.println(ladron.getInventario().mostrarInventario());
	    }
	}
