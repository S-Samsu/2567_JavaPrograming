import java.util.Scanner;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int numBefore = Integer.MIN_VALUE;
        int number;

        while (true) {
            System.out.print("Input number : ");
            number = input.nextInt();

            if (number < numBefore) {
                break;
            }
            number = numBefore;
        }
        System.out.println("BYE BYE");
        input.close();

	}

}
