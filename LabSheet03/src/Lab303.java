import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//tua pea
		String word;
		int countSpace = 0;
		
		
		System.out.print("Input a sentence : ");
		word = input.nextLine();
		
		while(!word.endsWith(".")) {
			System.out.print("Input a sentence, agian : ");
			word = input.nextLine();
		}
		System.out.println("");
		
		for (int i = 0;i < word.length();i++) {
			char ch = word.charAt(i);
		    if (ch == ' ') {
			 countSpace++;
		    }
		}
		System.out.println("This sentence has "+ countSpace +" spacebar.");
		System.out.println("This sentence has "+ (countSpace+1) +" word.");
		input.close();
	}

}
