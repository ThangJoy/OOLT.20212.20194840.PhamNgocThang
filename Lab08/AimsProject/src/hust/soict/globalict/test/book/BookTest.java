package hust.soict.globalict.test.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.media.Book;

public class BookTest {

	public BookTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				//System.out.println(book2.contentLength());
		String[] author = {"A","B","C"};
		List<String> authors= new ArrayList<String>(Arrays.asList(author));
		Book book2 = new Book ("Harry","Noval",88f,authors," I can can the can, but the can cannot can me");
		JOptionPane.showMessageDialog(null, book2);

	
	}

}
