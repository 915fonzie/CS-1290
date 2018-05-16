package lab1;
import java.util.*;

public class Hangman {
	static Scanner in = new Scanner(System.in);
	static char[] phraseArray;
	static char again = 'y';
	static String again1 = "yes";
	static int chances = 6;
	boolean check = true;
	String visible;


	public static void main(String[] args){ // this is where everything is called 
		Hangman main = new Hangman();
		while(again == 'y' || again1 == "yes"){// this is for repeating the game
			main.Input();

			Player1 update = new Player1();
			Player2 input = new Player2();
			while(chances > 0 && !update.isSolved()){ // this is to repeat as much as it should for player 2
				Graphic.Graphic(chances); // calls the method graphic from class graphic to print the game in ASCII characters
				System.out.println("You have " + chances + " chances left\n"); //prints out how many chances are left
				System.out.println(update); //calls the constructor Player1()
				char c = input.getLetter(); // calls the method getLetter() from Player2()
				if(!update.update(c)){
					chances -= 1;
				}
			}
			if(update.isSolved()){
				for(int i = 0; i < phraseArray.length; i++){ // this is to print the final word or phrase if solved
					System.out.print(phraseArray[i]);

				}
				System.out.println();
				System.out.println("Congratulations!! You won!!!");
			}
			else{
				System.out.println("Sorry... You had too many incorrect guesses");
			}
			System.out.println("Would you like to do it again?\n " + // asks to either put the character y or n but, just in case I set it up to take both y and n as well as yes and no.
					"<y/n>");												// set it up to take both y and n as well as yes and no.
			again1 = in.nextLine();
			again = again1.charAt(0);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
					+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // could not reset the console so I added enough 
			chances = 6;
		}																	 // blank lines so you wouldn't see the previous game

	}
	public void Input(){ // this method is so that it only runs once per game which is why it is separated from the rest

		System.out.println("Welcome to hangman!");
		System.out.println("Player 1, please enter a phrase to start: \n");
		String phrase = in.nextLine();

		phraseArray = new char[phrase.length()];
		phraseArray = phrase.toCharArray();

		int i = 0;
		while(i < phraseArray.length){
			check = Character.isLetter(phraseArray[i]); // checks to see if any of the inputs is not a character and becomes true or false
			i++;
		}

		if(check == false){
			System.out.println("Can only be Letters and Spaces!!"); // this is only run if player 1 
			System.out.println("try again \n");						// mistakenly puts in # or symbols
			System.out.println("Player 1, please enter a phrase to start: \n");
			String phrase2 = in.nextLine();
			phrase = phrase2;
			return;
		}

		if(phrase.length() < 5 || phrase.length() > 30){												// this only runs when player 1 puts 
			System.out.println("phrase must be a minimum of 5 letters and a maximum of 30 letters \n"); // too little or too many letters and spaces
			System.out.println("try again \n");
			System.out.println("Player 1, please enter a phrase to start: \n");
			String phrase1 = in.nextLine();
			phrase = phrase1;
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // this is so that player 2 won't see what player 1 inputted without scrolling up

		Player1.Phrase(phraseArray); // this is so that in the class Player1 the variable phraseArray in that class won't stay as null
	}

}
