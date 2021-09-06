

/**
 * 
 * @author Patricia Ramos
 *
 */
public class Word {
	
	private String word;
	private String clue;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getClue() {
		return clue;
	}
	public void setClue(String clue) {
		this.clue = clue;
	}

	public Word(String word, String clue) {
		super();
		this.word = word;
		this.clue = clue;
	}
	
	
}
