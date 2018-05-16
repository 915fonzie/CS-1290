package lab1;

public class Graphic {
	public static void Graphic(int chances){
		char  a = 92; 
		if(chances == 6){
			System.out.println("     ________"); // each if statement represents the progress of how many chances are left
			System.out.println("     |      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 5){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 4){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("     |      |");
			System.out.println("     |      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 3){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("    "+a+"|      |");
			System.out.println("     |      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 2){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("    "+a+"|/     |");
			System.out.println("     |      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 1){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("    "+a+"|/     |");
			System.out.println("     |      |");
			System.out.println("    /       |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
		if(chances == 0){
			System.out.println("     ________");
			System.out.println("     |      |");
			System.out.println("     O      |");
			System.out.println("    "+a+"|/     |");
			System.out.println("     |      |");
			System.out.println("    / "+a+"     |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("     -----------");
		}
	}

}
