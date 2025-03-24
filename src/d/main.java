package d;

import java.util.ArrayList;

public class main {

	    public static void main(String[] args) {
	    	
	    	
	    	// Crear una espada, una vara y un machete
	    	Equipamiento espada = new Equipamiento("Espada", "Arma");
	    	Equipamiento vara = new Equipamiento("Vara de la Calma", "Arma");
	    	Equipamiento machete = new Equipamiento("Machete", "Arma");
	      

	        // Crear inventarios para cada personaje
	        Inventario inventarioGuerrero = new Inventario();
	        Inventario inventarioMago = new Inventario();
	        Inventario inventarioLadron = new Inventario();

	        // Agregar a los inventarios de cada personaje su arma
	        inventarioGuerrero.agregarEquipamiento(espada);
	        inventarioMago.agregarEquipamiento(vara);
	        inventarioLadron.agregarEquipamiento(machete);
	       
	        // Crear los personajes
	        Guerrero guerrero = new Guerrero("Oriol el destrosamorenes", 10, 150, inventarioGuerrero, false, null);
	        Mago mago = new Mago("Jano el Calm Minder", 15, 100, inventarioMago, 200);
	        Ladron ladron = new Ladron("Black Alex", 8, 90, inventarioLadron, false);

	       
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
