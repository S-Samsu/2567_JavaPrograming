import javax.swing.*;
public class Lab302_1 {

	public static void main(String[] args) {
        String inputEmail;
		
        boolean invalid = false;

        
		while (true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail : ").toLowerCase();
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			      inputEmail = JOptionPane.showInputDialog("Input your e-mail,agian: ");
			}
		
		
		invalid = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");		
		if(invalid) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+ inputEmail);
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			continue;
		}		
	   }
	}
}
