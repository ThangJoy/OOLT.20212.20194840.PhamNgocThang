package hust.soict.globalict.aims.exception;

import javax.swing.JOptionPane;

public class PlayerException extends Exception{

	private String s;
	public PlayerException() {
		// TODO Auto-generated constructor stub
	}
	public PlayerException(String s)
	{
		this.s=s;
		throw new IllegalArgumentException(s);
	}
	

}
