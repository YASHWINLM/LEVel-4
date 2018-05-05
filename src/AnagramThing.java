import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnagramThing {
	ArrayList<String> anagrams = new ArrayList<String>();

	public static void main(String[] args) {
		AnagramThing at = new AnagramThing();
		try {
			at.AnagramsFinder();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void AnagramsFinder() throws FileNotFoundException {

		Scanner scan = new Scanner(new File("words.txt"));

		String s = JOptionPane.showInputDialog("Enter a word");
		char[] c = s.toCharArray();
		String q = "";
		while (scan.hasNextLine()) {
			int x = 0;
			String n = scan.nextLine();
			String original = n;
			if (s.length() == n.length()) {
				if (n.equals("resistance")) {
					System.out.println("stop");
				}

				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < n.length(); j++) {
						if (c[i] == n.charAt(j)) {
							n = n.replaceFirst(n.charAt(j) + "", "*");
							x += 1;
							break;

						}
					}
				}

				if (x == s.length()) {
					anagrams.add(original);

				}
			}

		}

		for (int i = 0; i < anagrams.size(); i++) {
			q += anagrams.get(i) + ", ";

		}

		JOptionPane.showMessageDialog(null, q);

	}

}
