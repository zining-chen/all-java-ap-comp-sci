
public class LipogramAnalyzer {

	private  StringBuffer input;
	
	public LipogramAnalyzer(String text) {
		input = new StringBuffer (text.toLowerCase() );
	}
	
	public String mark(char letter) {
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < temp.length(); i ++) {
			if (temp.charAt(i)==letter) {
				temp.setCharAt(i, '#');
			}
		}
		
		return temp.toString();
	}
	
	public String allWordsWith (char letter) {
		StringBuffer words = new StringBuffer("");
		
		String s = " " + input.toString() + " ";
		
		for (int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == letter) { //found a letter :P
				String word = s.substring( s.lastIndexOf(" ", i) + 1, s.indexOf(" ", i) );
				if (words.indexOf(word) == -1) {  //has not been found yet
					words.append(word + '\n');
				}
			}
		}
	// System.out.println(words.toString());
	return words.toString();
	}

}
