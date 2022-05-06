package hust.soict.globalict.lab01;
		import javax.swing.JOptionPane;
	
		public class Test2ndeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondDegreeEquation eq = new SecondDegreeEquation();
		String strNum1, strNum2,strNum3;
		double a=0,a1,a2;boolean kt=true;

		while(kt)
		{
		strNum1 = JOptionPane. showInputDialog(null,
		        "Please input data for equation: ","Input the first number",
		        JOptionPane. INFORMATION_MESSAGE) ;
		a = Double.parseDouble(strNum1);
		if (a!=0) break;
		}
		strNum2 = JOptionPane. showInputDialog(null,
				"Please input data for equation: ","Input the second number",
				JOptionPane. INFORMATION_MESSAGE) ;
		a1 = Double.parseDouble(strNum2);
		strNum3 = JOptionPane. showInputDialog(null,
				"Please input data for equation: ","Input the third number",
				JOptionPane. INFORMATION_MESSAGE) ;
		a2 = Double.parseDouble(strNum3);
		
		double D=a1*a1-4*a*a2;


		JOptionPane. showMessageDialog(null,eq.Resolve(D,a,a1,a2),

				"Result", JOptionPane. INFORMATION_MESSAGE);
		System. exit(0);

	

	}

}
