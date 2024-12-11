import javax.swing.JOptionPane;
public class Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        while (true) {
            
        String inputChooseFlavor = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress Number to choose flavor:","input",JOptionPane.QUESTION_MESSAGE);
        int chooseFlavor = Integer.parseInt(inputChooseFlavor);

        if (chooseFlavor == 1) {
            int chooseVanilla = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
            if (chooseVanilla == 0) {
                JOptionPane.showMessageDialog(null,"You choose Vanilla Flavor \nAnd with Topping\nTotal price = "+(VANILLA+TOPPING)+ " baht.");
            }
            if (chooseVanilla == 1) {
                JOptionPane.showMessageDialog(null,"You choose Vanilla Flavor \nAnd no Topping\nTotal price = "+VANILLA+ " baht.");
            }
            break;
        }
        if (chooseFlavor == 2) {
            int chooseChocolate = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
            if (chooseChocolate == 0) {
                JOptionPane.showMessageDialog(null,"You choose Chocolate Flavor \nAnd with Topping\nTotal price = "+(CHOCOLATE+TOPPING)+ " baht.");
            }
            if (chooseChocolate == 1) {
                JOptionPane.showMessageDialog(null,"You choose Chocolate Flavor \nAnd no Topping\nTotal price = "+CHOCOLATE+ " baht.");
            }
            break;  
        }
        else{
            JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!\nTry agian...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
      }

	}

}
