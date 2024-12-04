import javax.swing.JOptionPane;
public class lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputTime = JOptionPane.showInputDialog(null, "Input Time Parkig (minute)","Input",JOptionPane.QUESTION_MESSAGE);
		int time =  Integer.parseInt(inputTime);
		
		int hours = time / 60;
		int minutes = time % 60;
		
		double bill = hours*50+(minutes*0.25);
	
		String massage = "You parking "+hours+" Hour "+minutes+ " Minute.\nAmount to paid is "+bill+" baht.";
		JOptionPane.showMessageDialog(null, massage);
	}

}
