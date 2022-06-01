package hust.soict.globalict.aims;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;

public class Aims {

	public static void main(String[] args) {
		
	
		Store myStore = new Store();
		MemoryDaemon md = new MemoryDaemon();
		Thread tr= new Thread(md);
		tr.setDaemon(true);
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
		String[] author = {"A","B","C"};
		List<String> authors= new ArrayList<String>(Arrays.asList(author));
		Book book2 = new Book ("Harry","Noval",88f,authors," I can can the can, but the can cannot can me");
		//System.out.println(book2.contentLength());
		myStore.addMedia(book2);
Book book3 = new Book ("Harry 1","Noval",87f,"i can");
		
		myStore.addMedia(book3);
Book book4 = new Book ("Harry 0","Noval",87f);
		
		myStore.addMedia(book4);
		Collection<Media> collection = new ArrayList<Media>();
		DigitalVideoDisc dvd6= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		collection.add(dvd6);
		
		
		
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Aladin","Animation",18.99f);
		collection.add(dvd8);
		
		CompactDisc cd1= new CompactDisc("IBM Symphony","25",10);
		Track track1 = new Track("Hello",5);
		Track track2 = new Track("Hello1",8);
	    cd1.addTrack(track1);
	    cd1.addTrack(track2);
	    
	
		//collection.add(cd1);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Warm Up","Animation","Q",3,3f);
		//collection.add(dvd4);
	
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Scale","Animation","Q",4,3f);
		//collection.add(dvd5);
		
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Introduction","Animation","Q",6,3f);
		//collection.add(dvd6);
		 myStore.addMedia(dvd6);
		 
		 myStore.addMedia(dvd8);
		
	    myStore.addMedia(cd1);
		myStore.showMenu();
		tr.start();
		
		
		

	}

}