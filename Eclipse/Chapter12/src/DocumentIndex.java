import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() { //if no size parameter is parsed to it
		super(); // call the super's constructor
	}

	public DocumentIndex(int n) { //if the size is declared
		super(n); // call the super's constructor, but force into size n
	}

	public void addWord(String word, int num) {
		word = word.toUpperCase();
		
		// System.out.println("Word: " + word + " Line Number Equals: " + num);
		
		
		for (IndexEntry e : this) { // for each loop. each indexEntry (called e) inside of this class (DocumentIndex class)
			if (e.getWord().equals(word)) {
				e.add(num);
				return;
			}
		}

		IndexEntry e = new IndexEntry(word);
		e.add(num);

		if (this.size() == 0) {
			this.add(e);
			return;
		}
		else {
			for (int i = 0; i < this.size(); i++) {
				if( this.get(i).getWord().compareTo(word) > 0 ) {
					this.add(i, e);
					return;
				}

			}
		}
	}

	public void addAllWords(String str, int num) {
		String[] strings;
		strings = str.split("\\W+");
		
		for (String s : strings) {
			if ( !s.equals("") ) 
				addWord(s, num);
		}
	}
	
}
