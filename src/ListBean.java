import java.util.*;

public class ListBean {
	private ArrayList<String> words;

	public ListBean() {
		words = new ArrayList<String>();
	}

	public void setWords(ArrayList<String> w) { words = w; }
	public ArrayList<String> getWords() { return words; }

	public void setWord(String word, int i) {
		words.set(i, word);
	}
	public String getWord(int i) {
		return words.get(i);
	}

	public static void main(String [] a) {
		ListBean list = new ListBean();
		list.setWord("hello", 0);
	}
}
