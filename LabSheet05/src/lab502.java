import java.util.Scanner;
public class lab502 {

	public static void main(String[] args) {
		int[] number = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            number[i] = scanner.nextInt();
        }
        int sum = sumOfPos(number);
        System.out.println("\nSummation of positive number is  " + sum);

        scanner.close();
    }

    public static int sumOfPos(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
	}

}
