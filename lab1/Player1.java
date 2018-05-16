package lab1;

import java.util.Scanner;

public class Player1 {
	String phrase, update;
	static char[] phraseArray;
	boolean check = true;
	Scanner input = new Scanner(System.in);

	public static void Phrase(char[] arr){ // changes the value of phraseArray from null to the array arr
		phraseArray = arr;
	}

	public Player1(){

		update = "";

		for(int j = 0; j <phraseArray.length; j++){ // this converts the word or phrase into dashes
			char character = phraseArray[j];
			if(character == ' '){
				update += character;
			}
			else{
				update += '_';
			}
		}
	}

	public String toString(){
		return update;
	}

	public boolean update(char c){
		char[] visibleArray = new char[phraseArray.length]; //in this method we use two arrays, one that has
		String s = "";										// the characters and the other that has just dashes.
		boolean contains = false;       					// in the array with characters, if it contains a character inputted by player 2,
		// it updates the other array which in turn also changes a dash or dashes into characters
		for(int i = 0; i < phraseArray.length; i++){
			visibleArray[i] = update.charAt(i);
		}

		for(int j = 0; j < phraseArray.length; j++){
			if(phraseArray[j] == c){
				visibleArray[j] = c;
				contains = true;
			}
		}
		for(int x = 0; x < phraseArray.length; x++){
			s += visibleArray[x];
		}
		update = s;
		return contains;
	}
	public boolean isSolved(){
		String word = String.valueOf(phraseArray); //this is to turn an array of char into a string

		return word.equalsIgnoreCase(update); // returns true if the word or phrase is the same now
	}
}
