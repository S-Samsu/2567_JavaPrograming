import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนดobjในการกำหนดข้อมูล
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//รับและแสดงผลรับข้อมูลสินค้า
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		//รับและแสดงผลรับข้อมูลสินค้า
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		float totalPriceOfProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceOfProduct)+"Baht");
		//คำนวณภาษีีเพิ่ม7เปอร์
		float totalWithVat = totalPriceOfProduct+(totalPriceOfProduct*7/100);
		System.out.println("Add VAT 7% is "+frm.format(totalWithVat)+"baht");
		System.out.println();
		
		String frmTotalWithVAT = String.format("%,.2f",totalWithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7%% is "+frmTotalWithVAT+"baht");
		System.out.println();
		System.out.println("Output using String.format");
		System.out.printf("Add VAT 7%% is %.,2f",totalWithVat);
		
		
		input.close();
	}

}
