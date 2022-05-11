package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.*;

public class Aims {

	public static void main(String[] args) {
		
	
		Store myStore = new Store();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		myStore.addMedia(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd3);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Half Blood Prince","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd4);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Cup of Fire","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd5);
		Book book1 = new Book ("Harry","Noval",87f);
		myStore.addMedia(book1);
		Book book2 = new Book ("Harry","Noval",87f," I can can the can, but the can cannot can me");
		//System.out.println(book2.contentLength());
		myStore.addMedia(book2);
		myStore.showMenu();
		

	}

}
