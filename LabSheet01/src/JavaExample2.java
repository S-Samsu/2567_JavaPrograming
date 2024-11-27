import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit");
		int productUnit = Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+"Input Price per Unit:"));
		double totalPriceOfProduct = productUnit * productPrice;
		double totalWithVat = totalPriceOfProduct+(totalPriceOfProduct*7/100);
		String frmTotalPriceOfProduct = String.format("%,.2f",totalWithVat);
		String frmTotalWithVAT = String.format("%,.2f",totalWithVat);
		JOptionPane.showMessageDialog(null,"Total Price is "+frmTotalPriceOfProduct+" baht"+"\nAdd VAT 7% is "+frmTotalWithVAT+" baht");
	}

}
