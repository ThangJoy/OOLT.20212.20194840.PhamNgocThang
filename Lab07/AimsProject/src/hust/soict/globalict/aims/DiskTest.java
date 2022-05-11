package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart test = new Cart();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry Potter and the Half Blood Prince");
		 //System.out.println(dvd1.getId());
		//System.out.println(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Harry Potter and the Cup of Fire");
		// System.out.println(dvd2.getId());
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin");
		// System.out.println(dvd3.getId());
	   // System.out.printf("Total Cost is %.2f\n",anOrder.totalCost());
	    DigitalVideoDisc dvdlist[]= {dvd1,dvd2,dvd3};
	   test.addDigitalVideoDisc(dvdlist);
	    //test.sortByCost(dvdlist);
	    //test.sortByTitle(dvdlist);
	   //test.removeDigitalVideoDisc(dvd3);
	   test.filterByTitle("Harry Potter ");
		

	}

}
