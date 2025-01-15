import java.util.Scanner;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter product Name : ");
		String pdName = scan.nextLine();
		System.out.print("Enter price : ");
		double pdPriceBF = scan.nextDouble();
		System.out.print("Enter VAT : ");
		double pdPriceAT = scan.nextDouble();
		
		product.setProductDetails(pdName, pdPriceBF, pdPriceAT);
		System.out.println();
		product.displayProductDetails();
		
		scan.close();
		
	}

}
