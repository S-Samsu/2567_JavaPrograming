import java.util.Scanner;

public class Lab306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = scan.nextLine().toLowerCase();

	        if (sentence.contains("nichi")) {
	            System.out.println("Nichi is a sentence");
	        } else {
	            System.out.println(sentence);
	        }

	        scan.close();
	}

}
