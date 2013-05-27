
public class HangmanGame {
	private String word;
	private StringBuffer triedLetters = new StringBuffer("");
	private StringBuffer currentState;
	
	public HangmanGame( String s ) {
		word = s;
		currentState = new StringBuffer( s.length() );
		
		for (int i = 0; i < s.length(); i++) {
			currentState.append("-");
		}
	}
	
	public String getGuessed() {
		return currentState.toString();
	}
	
	public String getWord() {
		return word;
	}
	
	public String getTried() {
		return triedLetters.toString();
	}
	
	public int tryLetter(char c) {
		if (triedLetters.indexOf(c + "") != -1) {
			return 0;
		}
		
		else if ( word.indexOf(c) == -1) {
			triedLetters.append(c);
			return -1;
		}
		else {
			triedLetters.append(c);
			for (int i = 0; i < currentState.length(); i++) {
				if (currentState.charAt(i) == c) {
					currentState.setCharAt(i, c);
				}
			}
			return 1;
		}
		
	}
	
}
