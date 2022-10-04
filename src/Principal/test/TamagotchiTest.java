package Principal.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Principal.Tamagotchi;
import junit.framework.Assert;

class TamagotchiTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testQueValidaQueLaMascotaPuedeMorirDeHambre() {
		Tamagotchi tamagotchi = new Tamagotchi();
		int vidaEsperada = 0;
		int vidaObtenida = tamagotchi.matarDeHambre();;
		assertEquals(vidaEsperada, vidaObtenida);
				
	}
	
	@Test
	void testQueValidaQuePuedoRevivirALaMascota() {
		Tamagotchi tamagotchi = new Tamagotchi();
		int vidaEsperada = 100;
		int vidaObtenida = tamagotchi.revivir();
		assertEquals(vidaEsperada, vidaObtenida);
				
	}
	
	

}

