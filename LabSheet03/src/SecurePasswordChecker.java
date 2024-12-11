import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		while (true) {
			System.out.println("Enter you password (Type 'exit' to quit): ");
			String password = input.next();
		if(password.equalsIgnoreCase("exit")) {
			System.out.println("Program terminated.");
			break;
		}
		
		String error = "";
		if(password.length()<8) {
			error += "- Password must be at least 8 character long.\n";
		}
		
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean haseDigit = false;
		
		for (int i = 0 ; i <= password.length() ; i++ ) {
			char ch = password.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				hasUpperCase = true;
			}
			if(ch >= 'a' && ch <= 'z') {
				hasLowerCase = true;
			}
			else if(ch >= '0' && ch <= '9') {
				haseDigit = true;
			}			
		}
		if(!hasUpperCase) {
			error += "- Password must contant at least one Upper letter (A-Z)\n";
		}
		if(!hasLowerCase) {
			error += "- Password must contant at least one Lower letter (a-z)\n";
		}
		if(!haseDigit) {
			error += "- Password must contant at least one Digit (0-9)\n";
		}
		
		if(error.isEmpty()) {
			System.out.println("Your password is secure.");
		}
		else {
			System.out.println("Pasword validation error.");
			System.out.println(error);
		}
		input.close();
	   }
	}

}
