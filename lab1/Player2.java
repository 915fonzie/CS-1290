package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Player2 {

	ArrayList<String> inputPlayer2 = new ArrayList<String>(); // Since I don't know the size of the array, the best option was to use ArrayList
	boolean chosen;

	public void inputChosen(String key){ // this method is to add the character inputted to the array inputPlayer2
		inputPlayer2.add(key);            
	}
	public boolean Repeat(String key){  // this method is to check the inputted character with the characters in the
		chosen = inputPlayer2.contains(key); // array inputPlayer2 and sees if they have repeated
		return chosen;
	}
	public char getLetter(){
		Scanner input = new Scanner(System.in);

		char x;
		boolean chosen;
		String tmp;

		do{
			System.out.println("Guess a Letter Player 2\n");
			String x1 = input.next();
			if(x1.length() > 1){
				System.out.println("Only one Letter at a time!!!"); //check to make only one character is inputted
				System.out.println("try again\n");
				System.out.println("Guess Letter Player 2\n");
				char y = input.next().charAt(0);
				x = y;
			}
			else{
				x = x1.charAt(0);
			}
			tmp = "" + x;          // in this process 
			chosen = Repeat(tmp);
			if(!chosen){
				inputChosen(tmp);
			}
			else{
				System.out.println("You've already used that letter!! Please enter another letter that hasn't been chosen");
			}

		}
		while(chosen);
		return x;
	}

}