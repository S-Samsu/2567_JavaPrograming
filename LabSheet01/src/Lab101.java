import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input Product Name	  : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit      : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per Unit    : ");
		double pricePerUnit = input.nextDouble();
		
		System.out.println("--------------------------");
		double totalPrice = pricePerUnit * productUnit;
		System.out.println("Total Price is \t"+frm.format(totalPrice)+" baht.");
		
		System.out.println("--------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		System.out.println("--------------------------");
		double discountDown = totalPrice * (discount/100.0f);
		double totalWithDis = totalPrice-discountDown;
		System.out.println("Discount from "+ discount +"%\t"+frm.format(discountDown)+" baht.");
		System.out.println("Amount to be paid \t"+frm.format(totalWithDis)+" baht.");
		
		

	}

}
