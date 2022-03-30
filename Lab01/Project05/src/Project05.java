import javax.swing.JOptionPane;

public class Project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;

		strNum1 = JOptionPane. showInputDialog(null,
		"Please input the first number: ","Input the first number",
		JOptionPane. INFORMATION_MESSAGE) ;

		
		strNum2 = JOptionPane. showInputDialog(null,
		"Please input the second number: ","Input the second number",
		JOptionPane. INFORMATION_MESSAGE);
   
		double a = Double.parseDouble(strNum1);
		double b = Double.parseDouble(strNum2);
		JOptionPane. showMessageDialog(null,"Sum="+(float)(a+b)+"\n"+"Difference="+(float)(a-b)+"\n"+"Product="+(float)(a*b)+"\n"+"Quotient="+(float)(a/b),

				"Result", JOptionPane. INFORMATION_MESSAGE);
		System. exit(0);

	}

}