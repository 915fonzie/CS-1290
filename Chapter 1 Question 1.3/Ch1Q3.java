package cs1290;

public class Ch1Q3 {

	public static void main(String[] args) {
		String s = "Mr John Smith";
		System.out.print(replaceSpace(s));

	}
	public static String replaceSpace(String str) {
	    String[] words = str.split(" ");
	    StringBuilder sentence = new StringBuilder(words[0]);

	    for (int i = 1; i < words.length; ++i) {
	        sentence.append("%20");
	        sentence.append(words[i]);
	    }

	    return sentence.toString();
	}

}
