package cs1290;
import java.util.*;

public class Ch1Q2 {

	public static void main(String[] args) {
		String s1 = "abc"; //feel free to change strings to test
		String s2 = "cba";
		
		System.out.println(permutation(s1, s2));

	}
	
	public static boolean permutation(String s1, String s2) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		if(s1.length() != s2. length()) {
			return false;
		}
		
		for(int i= 0; i < s1.length(); i++) {
			
			int count1 = map.getOrDefault(s1.charAt(i), 0);
			int count2 = map.getOrDefault(s2.charAt(i), 0);
			
			if(s1.charAt(i) != s2.charAt(i)) {
			map.put(s1.charAt(i), count1 + 1);
			map.put(s2.charAt(i), count2 - 1);
			}
		}
		
		for(Character c: map.keySet()) {
			if(map.get(c) != 0) {
				return false;
			}
		}
		
		return true;
	}

}
