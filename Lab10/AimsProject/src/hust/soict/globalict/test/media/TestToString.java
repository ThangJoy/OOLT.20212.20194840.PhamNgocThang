package hust.soict.globalict.test.media;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;

public class TestToString {

	public TestToString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Media> mediae = new ArrayList<Media>();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		mediae.add(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		mediae.add(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation",18.99f);
		mediae.add(dvd3);
		CompactDisc cd1= new CompactDisc("IBM Symphony","25",10);
		Track track1 = new Track("Hello",5);
		Track track2 = new Track("Hello1",8);
		track1.equals(dvd1);
	    cd1.addTrack(track1);
	    cd1.addTrack(track2);
	    mediae.add(cd1);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Warm Up","Animation","Q",3,3f);
		mediae.add(dvd4);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Scale","Animation","Q",4,3f);
		mediae.add(dvd5);
		DigitalVideoDisc dvd6= new DigitalVideoDisc("Introduction","Animation","Q",6,3f);
		mediae.add(dvd6);
Book book3 = new Book ("Harry 1","Noval",87f);
		
		mediae.add(book3);
Book book4 = new Book ("Harry 0","Noval",87f);
		
		mediae.add(book4);
		for(Media m:mediae)
		{
			System.out.println(m.toString());
		}
		}

}
