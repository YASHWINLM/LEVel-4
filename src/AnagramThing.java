import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnagramThing {
	ArrayList <String>anagrams= new ArrayList<String>();
	public static void main(String[] args) {
		AnagramThing at= new AnagramThing();
		try {
			at.AnagramsFinder();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AnagramsFinder() throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("words.txt"));
		
		String s =JOptionPane.showInputDialog("Enter a word");
		char[] c= s.toCharArray();
		
		
		while(scan.hasNextLine()) {
			String n=scan.nextLine();
		
			int x=0;
			for (int i = 0; i < c.length; i++) {
			
				if (n.equals("car")) {
					System.out.println("yay");
				}
				if (n.contains(Character.toString(c[i]))) {
					System.out.println("yay1");
					x+=1;
				}
			}
			String q="";
			if(x==s.length()) {
				System.out.println("yay2");
				anagrams.add(n);
				
			}
			else {
				q+="none";
				
			}
			
			
			for (int i = 0; i < anagrams.size(); i++) {
				q+=anagrams.get(i)+", ";
				
				
			}
			JOptionPane.showMessageDialog(null, q);
			
			
			
			
			
			
		}
		
		
	}
	
}
