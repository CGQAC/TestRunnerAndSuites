package GroupID.ArtifactID;

/**
 * Hello world!
 *
 */
public class BlackJack 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO BLACKJACK" );
    }
    public int play(int player, int dealer) {
    	if (player > 31 || dealer > 31 || player < 2 || dealer < 2) {
    		return -1;
    	}
    	if (player > 21 && dealer > 21) {
    		return 0;
    	}
    	if (player > 21) {
    		return dealer;
    	}
    	if (dealer > 21) {
    		return player;
    	}
    	if (player > dealer) {
    		return player;
    	} else {
    		return dealer;
    	}
    }
}
