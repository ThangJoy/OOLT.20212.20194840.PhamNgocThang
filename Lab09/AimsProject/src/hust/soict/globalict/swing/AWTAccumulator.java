package hust.soict.globalict.swing;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {

	
	private TextField tfInput;
	private TextField tfOutput;
	private int sum=0;//Accumulate sum, init to 0
	//Constructor to setup the GUI components and event handlers
	public AWTAccumulator()
	{
		setLayout(new GridLayout(2,2));
		add(new Label("Enter an Integer: "));
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		add(new Label("The Accumulate Sum is: "));
		tfOutput=new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		setTitle("AWT accumulator");
		setSize(350,120);
		setVisible(true);
		
		
		
		
	}
	public static void main (String[] args)
	{
		new AWTAccumulator();
		
	}
	private class TFInputListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			int numberIn = Integer.parseInt(tfInput.getText());
			sum+=numberIn;
			tfOutput.setText("");
			tfOutput.setText(sum+"");
		}
	}
	
	

}
