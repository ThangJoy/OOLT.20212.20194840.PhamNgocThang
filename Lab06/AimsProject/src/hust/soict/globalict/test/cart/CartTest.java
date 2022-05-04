package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.DVDUtils;

public class CartTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		 //System.out.println(dvd1.getId());
		//System.out.println(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		// System.out.println(dvd2.getId());
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation",18.99f);
		// System.out.println(dvd3.getId());
	   // System.out.printf("Total Cost is %.2f\n",anOrder.totalCost());
	    DigitalVideoDisc dvdlist[]= {dvd1,dvd2,dvd3};
	    anOrder.addDigitalVideoDisc(dvdlist);
	    //anOrder.sortByCost(dvdlist);
	    //anOrder.sortByTitle(dvdlist);
	   anOrder.removeDigitalVideoDisc(dvd3);
	    anOrder.search(dvdlist);
	   // anOrder.print();
}
}
