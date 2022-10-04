package Principal;

import java.util.Iterator;

public class Tamagotchi {
	private String nombre;
	private int vida;
	
	//constructores
	public Tamagotchi() {
		nombre = "Tamagotchi";
		vida = 100;
				
	}
	
	public Tamagotchi(String nombre) {
		this.nombre = nombre;
		vida = 100;
	}
		
	//métodos
	public void alimentar() {
		if(vida >= 0 && vida < 100) {
			vida += 10;
			
		}
	}
	
	public int matarDeHambre() {
		if(tieneVida()) {
			vida -= 100;	
		}
		return vida; 
	}
	
	public int revivir() {
		return vida = 100;
	}
	
	public void status() {
		String estado;
		
		if (tieneVida()) {
			estado = "tiene vida en un ";
		}else {
			estado = "ha muerto, revívalo!!";
	}
		System.out.println(nombre + " " + estado + "" + vida +"%");
		System.out.println("Escoja una opción:");
	
}
	
	public boolean tieneVida() {
		
		return vida > 0; 
		
		}

	}
