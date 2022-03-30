
import javax.swing.JOptionPane;
public class Test1steq {

	public static void main(String[] args) {
		
		String strNum1, strNum2;
        FirstDegreeEquation eq = new FirstDegreeEquation();

		strNum1 = JOptionPane. showInputDialog(null,
		"Please input the first number: ","Input the first number",
		JOptionPane. INFORMATION_MESSAGE) ;

		
		strNum2 = JOptionPane. showInputDialog(null,
		"Please input the second number: ","Input the second number",
		JOptionPane. INFORMATION_MESSAGE);
   
		eq.a = Double.parseDouble(strNum1);
		eq.b = Double.parseDouble(strNum2);
		JOptionPane. showMessageDialog(null,eq.Resolve(eq.a,eq.b),

				"Result", JOptionPane. INFORMATION_MESSAGE);
		System. exit(0);

		}
		}

