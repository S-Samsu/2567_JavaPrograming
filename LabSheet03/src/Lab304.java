import java.util.Scanner;

public class Lab304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullName = input.nextLine();

        int space = fullName.indexOf(" ");

        if (space == -1) {
            System.out.println("Incorrect Name");
        }
        else{
            String firstName = fullName.substring(0, space);
            String lastName = fullName.substring(space + 1);

            System.out.println("First Name: " + firstName.toUpperCase());
            System.out.println("Last Name: " + lastName.toLowerCase());
        }

        input.close();
	}

}
