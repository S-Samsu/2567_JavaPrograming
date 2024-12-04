import javax.swing.JOptionPane;
public class lab105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cdId = JOptionPane.showInputDialog(null,"This program calculates the total cost of a CD order\nPlease enter the ID of the CD","input",JOptionPane.QUESTION_MESSAGE);
	    String cdTitle = JOptionPane.showInputDialog(null,"Please enter the title of the CD","input",JOptionPane.QUESTION_MESSAGE);
	    
	    String strPrice = JOptionPane.showInputDialog(null,"Please enter the price of the CD in U.S. doller");
	    double price = Double.parseDouble(strPrice);

	    String strQuantity = JOptionPane.showInputDialog(null,"Please enter the price of the CD in U.S. doller");
	    int Quantity = Integer.parseInt(strQuantity);

	    double subtotal = price*Quantity;
	    double total = subtotal+(subtotal*6.25/100);

	    String message = "Summary of the transaction:\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD unit Price : $"+price+"\nCD Quantity: "+Quantity+"\n\nSubtotal: $"+subtotal+"\nTax rate: 6.25%\nTotal: $"+total+"\n\nEnd of Program";
	    JOptionPane.showMessageDialog(null, message);
	}

}
