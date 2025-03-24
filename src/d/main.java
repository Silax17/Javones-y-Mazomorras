package d;

import java.util.ArrayList;

public class main {

	    public static void main(String[] args) {
	    	
	    	Equipamiento espada = new Equipamiento("Espada", "Arma");
	        Equipamiento escudo = new Equipamiento("Escudo", "Defensa");

	        // Crear el inventario vacío
	        Inventario inventario = new Inventario();

	        // Agregar los equipamientos al inventario usando el método agregarEquipamiento
	        inventario.agregarEquipamiento(espada);
	        inventario.agregarEquipamiento(escudo);
	       
	        Guerrero guerrero = new Guerrero("Arthur", 10, 150, inventario, false, null);
	        Mago mago = new Mago("Gandalf", 15, 100, inventario, 200);
	        Ladron ladron = new Ladron("Robin", 8, 90, inventario, false);

	       
	        System.out.println("---- Información del Guerrero ----");
	        guerrero.mostrarInfo();
	        
	        System.out.println("\n---- Información del Mago ----");
	        mago.mostrarInfo();
	        
	        System.out.println("\n---- Información del Ladron ----");
	        ladron.mostrarInfo();
	        
	      
	        guerrero.proteger(mago);
	        
	       
	        guerrero.bajarVida(50);  
	        
	        
	        guerrero.dejardeProteger();
	        
	      
	        mago.lanzarHechizo(50);
	        
	        
	        ladron.robar(true);  
	        
	       
	        ladron.hacerseInvisible();
	        ladron.robar(false); 
	        
	        
	        System.out.println("\n---- Inventario del Guerrero ----");
	        guerrero.getInventario().mostrarInventario();
	        
	        System.out.println("\n---- Inventario del Mago ----");
	        mago.getInventario().mostrarInventario();
	        
	        System.out.println("\n---- Inventario del Ladron ----");
	        ladron.getInventario().mostrarInventario();
	    }
	}
