import javax.swing.JOptionPane;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Object[] options = {"option1", "option2", "option3"};
		        Object selectionObject = JOptionPane.showInputDialog(null, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		        String selectionString = selectionObject.toString();
		       System.out.println(selectionString);
		    
		}
	}


