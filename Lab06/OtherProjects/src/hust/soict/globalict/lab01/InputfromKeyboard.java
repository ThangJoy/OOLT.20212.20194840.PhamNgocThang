package hust.soict.globalict.lab01;
import java.util.Scanner;
public class InputfromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge= keyboard.nextInt();
		System.out.println("How tall are you?");
		Double dHigh= keyboard.nextDouble();
        System.out.println("Mrs/Ms. "+ strName+", "+iAge+ " years old." +"Yours height is "+ dHigh+".");		

	}

}
