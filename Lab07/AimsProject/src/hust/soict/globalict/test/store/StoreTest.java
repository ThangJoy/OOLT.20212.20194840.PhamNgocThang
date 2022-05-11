package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.*;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Store anOrder = new Store();
				DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry","Animation","Roger Allers",87,19.95f);
				anOrder.addDVD(dvd1);
				DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
				anOrder.addDVD(dvd2);
				DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation",18.99f);
				anOrder.addDVD(dvd3);
				DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Half Blood Prince");
				anOrder.addDVD(dvd4);
				DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Cup of Fire");
				anOrder.addDVD(dvd5);
				anOrder.showMenu();
		
			   
	}

}
