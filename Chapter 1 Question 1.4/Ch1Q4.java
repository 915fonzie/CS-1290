package cs1290;
import java.util.*;

public class Ch1Q4 {

	public static void main(String[] args) {
		String s = "tact coa";
		System.out.println(palindromeCheck(s));
	}
	
	public static boolean palindromeCheck(String s) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int checker = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			int count = map.getOrDefault(s.charAt(i), 0);
			
			if(s.charAt(i) != ' ') {
				map.put(s.charAt(i), count + 1);
			}
		
		}
		for(Character c: map.keySet()) {
			if(map.get(c) == 1) {
				checker ++;
			}
			if(checker >= 2) {
				return false;
			}
		}
		
		return true;
	}

}
