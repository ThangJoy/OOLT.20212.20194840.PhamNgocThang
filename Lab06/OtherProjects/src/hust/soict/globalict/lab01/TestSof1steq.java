package hust.soict.globalict.lab01;
		import javax.swing.JOptionPane;
		public class TestSof1steq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemofFirstDegreeEquation eq = new SystemofFirstDegreeEquation();
		String strNum1, strNum2,strNum3,strNum4,strNum5,strNum6;

		strNum1 = JOptionPane. showInputDialog(null,
		        "Please input data for first equation: ","Input the first number",
		        JOptionPane. INFORMATION_MESSAGE) ;
		eq.a = Double.parseDouble(strNum1);
		strNum2 = JOptionPane. showInputDialog(null,
				"Please input data for first equation: ","Input the second number",
				JOptionPane. INFORMATION_MESSAGE) ;
		eq.a1 = Double.parseDouble(strNum2);
		strNum3 = JOptionPane. showInputDialog(null,
				"Please input data for first equation: ","Input the third number",
				JOptionPane. INFORMATION_MESSAGE) ;
		eq.a2 = Double.parseDouble(strNum3);
		strNum4 = JOptionPane. showInputDialog(null,
				"Please input data for second equation: ","Input the first number",
				JOptionPane. INFORMATION_MESSAGE) ;
		eq.b = Double.parseDouble(strNum4);
		strNum5 = JOptionPane. showInputDialog(null,
				"Please input data for second equation: ","Input the second number",
				JOptionPane. INFORMATION_MESSAGE) ;
		eq.b1 = Double.parseDouble(strNum5);
		strNum6 = JOptionPane. showInputDialog(null,
				"Please input data for second equation: ","Input the third number",
				JOptionPane. INFORMATION_MESSAGE) ;
		eq.b2 = Double.parseDouble(strNum6);

		double D=eq.a*eq.b1-eq.b*eq.a1,D1=eq.a2*eq.b1-eq.b2*eq.a1,D2=eq.a*eq.b2-eq.b*eq.a2;


		JOptionPane. showMessageDialog(null,eq.Resolve(D,D1,D2),

				"Result", JOptionPane. INFORMATION_MESSAGE);
		System. exit(0);

	

	}

}
