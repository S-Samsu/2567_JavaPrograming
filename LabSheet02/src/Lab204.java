import java.util.Scanner;
public class Lab204 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Input value of X: ");
        x = input.nextInt();
        System.out.print("Input value of Y: ");
        y = input.nextInt();
        while (y <= x) {
         System.out.print("Input value of Y, again : ");
            y = input.nextInt();
        }
        System.out.println();
        int sum = x;
        for(int i = x+1;i<=y;i++) {
        	System.out.print(sum + " + " + i + " = " + (sum+i));
        	System.out.println();
        	sum+=i;
        }
       
        input.close();
	}

}
