package hust.soict.globalict.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int option=JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "You 've choosen: "+(option==JOptionPane.YES_OPTION?"I do":"I don't"));
        System.exit(0);
	}

}
