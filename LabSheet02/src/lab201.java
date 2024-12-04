import javax.swing.*;
import java.text.DecimalFormat;
public class lab201 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int isMember;
		
		//page 1
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		double totalPrice =  BUFFET * numberOfCustomer;
		
		//page 2
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."+"Do you have a member card?");
		}while(isMember == JOptionPane.CANCEL_OPTION);
		
		//page yes
		if(isMember == JOptionPane.YES_NO_OPTION) {
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+priceAfterDiscount+" baht.");
		}
		
		//page no
		else if (isMember == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+totalPrice+" baht.");
		}					
	}

}
