import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		
		int[] number = new int[5];
		
		for(int i=0; i<number.length;i++) {
		String input = JOptionPane.showInputDialog(null, "Input Number "+(i+1)+":");
		number[i] = Integer.parseInt(input);
		}
		showEven(number);
		showOdd(number);
	}
	public static void showEven(int[] nums ) {
		String result = "";
		for(int i=0; i<nums.length;i++) {
			if(nums[i] % 2 == 0) {
				result+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number :\n"+result);
	}
	public static void showOdd(int[] nums ) {
		String result = "";
		for(int i=0; i<nums.length;i++) {
			if(nums[i] % 2 != 0) {
				result+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number :\n"+result);
	}
}
