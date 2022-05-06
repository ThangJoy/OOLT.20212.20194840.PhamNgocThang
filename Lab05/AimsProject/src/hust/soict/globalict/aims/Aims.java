package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.*;

public class Aims {

	public static void main(String[] args) {
		
	
		Store myStore = new Store();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry","Animation","Roger Allers",87,19.95f);
		myStore.addDVD(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		myStore.addDVD(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation",18.99f);
		myStore.addDVD(dvd3);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Half Blood Prince");
		myStore.addDVD(dvd4);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Cup of Fire");
		myStore.addDVD(dvd5);
		myStore.showMenu();
		

	}

}
