

import java.util.ArrayList;

/**
 * create a bank of secret words (at least 20) for the user to try to guess, one
 * letter at a time. 
 * @author Patricia Ramos
 *
 */
public class WordsGeneration {

	public ArrayList<Word> getListWord(){
		ArrayList<Word> listWord = new ArrayList<Word>();
		listWord.add(new Word("Rabbit","animal"));
		listWord.add(new Word("Chicken","animal"));
		listWord.add(new Word("Sheep","animal"));
		listWord.add(new Word("Penguin","animal"));
		listWord.add(new Word("Flamingo","animal"));
		listWord.add(new Word("Kangaroo","animal"));
		listWord.add(new Word("Hippopotamu","animal"));
		listWord.add(new Word("Turkey","animal"));
		listWord.add(new Word("Monkey","animal"));
		listWord.add(new Word("Elephant","animal"));
		listWord.add(new Word("Giraffe","animal"));
		listWord.add(new Word("Coyote","animal"));
		listWord.add(new Word("Squirrel","animal"));
		listWord.add(new Word("Koala","animal"));
		listWord.add(new Word("Goat","animal"));
		listWord.add(new Word("Dolphin","animal"));
		listWord.add(new Word("Frog","animal"));
		listWord.add(new Word("Camel","animal"));
		listWord.add(new Word("Lion","animal"));
		listWord.add(new Word("Leopard","animal"));		
		listWord.add(new Word("Desk","classroom objects"));
		listWord.add(new Word("Chair","classroom objects"));
		listWord.add(new Word("Book","classroom objects"));
		listWord.add(new Word("Backpack","classroom objects"));
		listWord.add(new Word("Calculator","classroom objects"));
		listWord.add(new Word("Pencil","classroom objects"));
		listWord.add(new Word("Scissor","classroom objects"));
		listWord.add(new Word("Eraser","classroom objects"));
		listWord.add(new Word("Glue","classroom objects"));
		listWord.add(new Word("Pen","classroom objects"));
		return listWord;
	}
}
