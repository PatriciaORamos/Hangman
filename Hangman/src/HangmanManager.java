

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This class manager game.
 * @author Patricia Ramos
 *
 */
public class HangmanManager {

	public static void run() {
		
		Scanner key = new Scanner(System.in);
		Random random = new Random();
		Body body = new Body();
		int sizeBody =  body.getHangman().size();
		WordsGeneration wg = new WordsGeneration();
		
		ArrayList<Word> listWords = new ArrayList<Word>();
		listWords = wg.getListWord();		
		int sizeList = listWords.size();		
		
		boolean play = true;
		while(play) {			
			boolean isCompleted = true;
			int x = 0;		
			int index = random.nextInt(sizeList+1);		
			
			Word word = listWords.get(index);
			String wordGame = word.getWord();
			int sizeWord = wordGame.length();
			
			
			//create array of String with size equal word size
			String[] lettersGuessOk = new String[sizeWord];
			
			System.out.println("\nClue is: " + word.getClue());
			//The user should be presented with something that shows them how many letters are in the word.
			System.out.println("Number of the letters is: "+ sizeWord);
			
			//add each letter of the word in a list
			ArrayList<String> lettersWord = new ArrayList<String>();			
			for(int i=0; i<sizeWord; i++) {
				char charWord = word.getWord().charAt(i);
				lettersWord.add(String.valueOf(charWord));
				System.out.print("___ ");
			}
			
			
			isCompleted = validateLetter(key, body, sizeWord, lettersGuessOk, lettersWord, sizeBody, isCompleted, x);
			
			if(!isCompleted) {			
				System.out.println(body.getHangman().get(sizeBody - 1));
				System.out.println("YOU DIE");
			}
			System.out.println("The word is: "+ word.getWord());
		}
		key.close();
	}

	private static boolean validateLetter(Scanner key, Body body, int sizeWord, String[] lettersGuessOk,
			ArrayList<String> lettersWord, int sizeBody, boolean isCompleted, int x) {
		
		ArrayList<String> letterGuessed = new ArrayList<>();
		
		//They should have a limited number of wrong guesses allowed before they lose 
		while(x < sizeBody) {
			boolean fail = true;
			System.out.println("\n\nInput a letter, please");
			String letter = key.nextLine();	
			
			//Duplicate guesses should be dismissed
			if(letterGuessed.contains(letter)) {
				continue;
			} else {
				letterGuessed.add(letter);
			}
			
			for(int i= 0; i<lettersWord.size(); i++) {			
				if(letter.equalsIgnoreCase(lettersWord.get(i))) {
					lettersGuessOk[i]=letter;			
					fail = false;
				} 				
			}
			
			//If they guess correctly, the letter should then show up in the appropriate place.
			for(int i= 0; i<sizeWord; i++) {
				if(lettersGuessOk[i] == null) {
					System.out.print("___ ");
				} else {
					System.out.print(" " + lettersGuessOk[i] + " ");	
				}
			}
			
			isCompleted = true;
			for(int i= 0; i<sizeWord; i++) {
				if(lettersGuessOk[i] == null) {
					isCompleted = false;
				} 
			}
			
			//if user find all letter of the word, is finalized loop
			if(isCompleted) {
				System.out.println("\n--- END ---");
				x = sizeBody;
			}
			
			//a picture
			if(fail) {
				System.out.println(body.getHangman().get(x));
				x = x + 1;			
			}
			
		}
		return isCompleted;
	}

}
