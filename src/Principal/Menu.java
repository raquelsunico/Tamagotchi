package Principal;

import java.util.Scanner;

public class Menu {
	private int opcion;
	private Tamagotchi tamagotchi;
	private Scanner leer;
	
	public Menu() {
		tamagotchi = new Tamagotchi ("Su Mascota");
		leer = new Scanner(System.in);
		
	}

	public void abrirMenu() {
		
		do {
		
			tamagotchi.status();
			System.out.println("1.Alimentar");
			System.out.println("2.Matar de Hambre");
			System.out.println("3.Revivir");
			System.out.println("4.Salir");
			opcion = leer.nextInt();
			
			switch(opcion) {
			case 1:
				tamagotchi.alimentar();
				break;
			case 2:
				tamagotchi.matarDeHambre();
				break;
			case 3:
				tamagotchi.revivir();
				break;
			case 4:
				System.out.println("Gracias");
				break;
					
			}
	   }while(opcion != 4);
   }
}
	

