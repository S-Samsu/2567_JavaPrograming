import java.util.*;

import javax.swing.JOptionPane;
public class Lab303_1 {

	public static void main(String[] args) {
		String word;
		int countSpace = 0;
		
		
		word = JOptionPane.showInputDialog(null,"Input a sentence : ","input",JOptionPane.QUESTION_MESSAGE);
		
		while(!word.endsWith(".")) {
			word = JOptionPane.showInputDialog(null,"Input a sentence, agian : ","input",JOptionPane.QUESTION_MESSAGE);
		}
		System.out.println("");
		
		for (int i = 0;i < word.length();i++) {
			char ch = word.charAt(i);
		    if (ch == ' ') {
			 countSpace++;
		    }
		}
		JOptionPane.showMessageDialog(null,"This sentence has "+ countSpace +" spacebar.\n"+"This sentence has "+ (countSpace+1) +" word.");
	}

}
