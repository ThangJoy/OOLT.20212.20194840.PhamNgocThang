package hust.soict.globalict.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;

public class TestMediaCompareTo {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated constructor stub
		float total=0;
		Collection<Media> collection = new ArrayList<Media>();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		collection.add(dvd1);
		dvd1.play();
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		collection.add(dvd2);
		dvd2.play();
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation",18.99f);
		collection.add(dvd3);
		dvd3.play();
		CompactDisc cd1= new CompactDisc("IBM Symphony","25",10);
		Track track1 = new Track("Hello",5);
		Track track2 = new Track("Hello1",8);
	    cd1.addTrack(track1);
	    cd1.addTrack(track2);
	    JOptionPane.showMessageDialog(null,"The total length of the CD to add is: "+cd1.getLength());
		cd1.play();
		//collection.add(cd1);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Warm Up","Animation","Q",3,3f);
		//collection.add(dvd4);
		dvd4.play();
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Scale","Animation","Q",4,3f);
		//collection.add(dvd5);
		dvd5.play();
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Introduction","Animation","Q",6,3f);
		//collection.add(dvd6);
		dvd6.play();
		
		Iterator<Media> iterator = collection.iterator();
		while (iterator.hasNext())
		{
		total+=iterator.next().getCost();
		}
		System.out.println("Total Cost is: "+total+"\n----------------------------------------------\nThe DVDs currently in the order are:");
		iterator = collection.iterator();
		while (iterator.hasNext())
		{
			Media a= iterator.next();
			if(a instanceof DigitalVideoDisc)
			{
		     System.out.println(a.getTitle());
			}
		}
		
		System.out.println("\n----------------------------------------------\nThe DVDs in sorted order are:");
		Collections.sort((List<Media>)collection);
		iterator = collection.iterator();
		while (iterator.hasNext())
		{
			Media a= iterator.next();
			if(a instanceof DigitalVideoDisc)
			{
		     System.out.println(a.getTitle());
			}
		}
		System.out.println("----------------------------------------------");
		
		
	}

}
