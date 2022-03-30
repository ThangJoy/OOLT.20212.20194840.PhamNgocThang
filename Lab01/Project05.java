import javax.swing.JOptionPane;

public class Project05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1,strNum2;
		strNum1=JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
    
        System.out.println(num1/num2);
        System.exit(0);

	}

}
