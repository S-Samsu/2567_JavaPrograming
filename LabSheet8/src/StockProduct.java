import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		for (int i=0;i<=4;i++) {
		productList[i] = new Product();
		System.out.print("Input product ID : ");
		productList[i].setId(input.nextLine());		    	
		System.out.print("Input product Unit : ");
		int unit = input.nextInt();
		input.nextLine();
		     while(unit<=0) {
		    	System.out.print("Input product Unit : ");
			    unit = input.nextInt();
			    input.nextLine();
			    productList[i].setUnit(unit);
		    }
		}
	}
}
