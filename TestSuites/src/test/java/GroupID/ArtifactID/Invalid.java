package GroupID.ArtifactID;

import static org.junit.Assert.*;

import org.junit.Test;

public class Invalid {
	BlackJack blackJack = new BlackJack();

	@Test
	public void invalidEntries001() {
		assertEquals("Player and Dealer Invalid Above (TC6)", -1, blackJack.play(32,32));
	}
	@Test
	public void invalidEntries002() {
		assertEquals("Player and Dealer Invalid Below (TC6)", -1, blackJack.play(1,1));
	}

	
	@Test
	public void invalidEntries003() {
		assertEquals("Dealer Invalid Above (TC6)", -1, blackJack.play(10,32));
	}
	@Test
	public void invalidEntries004() {
		assertEquals("Dealer Invalid Below (TC6)", -1, blackJack.play(10,1));
	}

	
	@Test
	public void invalidEntries005() {
		assertEquals("Player Invalid Above (TC6)", -1, blackJack.play(32,10));
	}
	@Test
	public void invalidEntries006() {
		assertEquals("Player Invalid Below (TC6)", -1, blackJack.play(1,10));
	}
}
