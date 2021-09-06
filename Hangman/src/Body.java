import java.util.ArrayList;

/**
 * Create array with image of the game
 * @author Patricia Ramos
 *
 */
public class Body {
	
	ArrayList<String> getHangman(){
		ArrayList<String> body = new ArrayList<>();
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |             ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |      |      ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |      |/     ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |     \\|/    ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |     \\|/    ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |     \\|/    "
				+ "\n=     |      |      ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |     \\|/    "
				+ "\n=     |      |      "
				+ "\n=     |     /       ");
		body.add( "\n===================="
				+ "\n=     --------      "
				+ "\n=     |      |      "
				+ "\n=     |      O      "
				+ "\n=     |     \\|/    "
				+ "\n=     |      |      "
				+ "\n=     |     / \\    ");
		
		
		return body;
	}
	
	
}
