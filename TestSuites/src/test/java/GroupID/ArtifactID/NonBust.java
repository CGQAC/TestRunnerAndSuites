package GroupID.ArtifactID;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonBust {
	BlackJack blackJack = new BlackJack();

	@Test
	public void playerWins() {
		assertEquals("Player Wins (TC4)", 21, blackJack.play(21,10));
	}
	@Test
	public void dealerWins() {
		assertEquals("Dealer Wins (TC5)", 21, blackJack.play(10,21));
	}
}
