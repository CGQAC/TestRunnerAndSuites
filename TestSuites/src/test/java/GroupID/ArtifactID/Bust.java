package GroupID.ArtifactID;

import static org.junit.Assert.*;

import org.junit.Test;

public class Bust {
	BlackJack blackJack = new BlackJack();

	@Test
	public void playerBust() {
		assertEquals("Player Bust (TC3)", 10, blackJack.play(25,10));
	}
	@Test
	public void dealerBust() { 
		assertEquals("Dealer Bust (TC2)", 10, blackJack.play(10,25));
	}
	@Test
	public void bothBust() {
		assertEquals("Both are Bust (TC1)", 0, blackJack.play(25,25));
	}
}
