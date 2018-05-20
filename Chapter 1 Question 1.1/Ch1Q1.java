package cs1290;
import java.util.*;

public class Ch1Q1 {

	public static void main(String[] args) {
		
		String unique = "boolean";
		uniqueCharacterCheck(unique);

	}
	
	public static boolean uniqueCharacterCheck(String s) {
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))) {
				System.out.println("not unique");
				return false;
			}
			set.add(s.charAt(i));
		}
		System.out.println("unique");
		return true;
		
	}

}
