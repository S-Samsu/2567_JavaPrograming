import javax.swing.JOptionPane;
public class lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

	    String name = JOptionPane.showInputDialog(null,"Enter employee name","input",JOptionPane.QUESTION_MESSAGE);
	    
	    String strHourWork = JOptionPane.showInputDialog(null,"Enter total hours for this employee");
	    double hrWork = Integer.parseInt(strHourWork);

	    double grossEarning = hrWork*7.5;
	    double tax = grossEarning*0.15;
	    double netEarning = grossEarning-tax;

	    String message = "Employee name: "+name+"\nHour worked: "+hrWork+"\nHourly wage: $ 7.5\nGross earning: $ "+grossEarning+"\nTax rate: 0.15\nTax: $ "+tax+"\nNet earning: $ "+netEarning;
	    JOptionPane.showMessageDialog(null, message);
	}

}
