package strings;

public class BackspaceCompare {

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s ,t));

	}
	
	public static boolean backspaceCompare(String s, String t) {
		return build(s).equals(build(t));
	}
	
	public static String build(String str) {
		// create StringBuilder
		StringBuilder sb = new StringBuilder();
		
		// use for each loop
		for (char ch : str.toCharArray()) {
			// check if char has not #
			if (ch != '#') {
				sb.append(ch);
			} else if(sb.length() > 0) {
				// then delete backspace
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		return sb.toString();
	}

}
