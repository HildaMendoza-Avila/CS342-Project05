import java.io.Serializable;
import java.util.ArrayList;

public class GameInfo implements Serializable {
	
	int p_id, p_score, s_score, winner_id; // playerID, playerScore, serverScore, winnerID
	String game_state;                     // the TicTacToe board, 
	int difficulty;                        // ranges from 1-3
	ArrayList <Integer> topThree;          // top three SCORES of the game
	int games_played;                      // the number of games played so far
	boolean play_again;
	boolean p_turn, s_turn;                // player's turn & client's turn
	private static final long serialVersionUID = 1L;
	
	public GameInfo(int p) {
		p_id = p;
		p_score = 0;
		s_score = 0;
		winner_id = -1;
		game_state = "";
		difficulty = -1;
		games_played = 0;
		play_again = false;	
		p_turn = true;  // player going first?
		s_turn = false;
	}

}
