package hust.soict.globalict.test.utils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.DVDUtils;

public class DVDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1= new DigitalVideoDisc("AAAA","aaaa","aaaa",1,5.6f);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("BBBB","bbbb","bbbb",2,5.3f);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("CCCC","cccc","cccc",3,5f);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("DDDD","dddd","dddd",4,7.1f);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("EEEE","eeee","eeee",5,3.3f);
		DigitalVideoDisc[] sorted= {dvd5,dvd2,dvd3,dvd4,dvd1};
		DVDUtils a=new DVDUtils();
		a.sortByTitle(sorted,sorted.length);
		for (int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i].getTitle());
		}

	}

}
