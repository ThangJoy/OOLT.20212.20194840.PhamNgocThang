package hust.soict.globalict.aims.media;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CompactDisc extends Disc implements Playable,Cloneable {

	public CompactDisc(String title, String category) {
		super(title, category);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title) {
		super(title);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, String category,String artist, float cost) {
		super(title, category, cost);
		this.artist=artist;
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, String category,String artist, ArrayList<Track> tracks, float cost) {
		super(title, category, cost);
		this.artist=artist;
		this.tracks=tracks;
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
    
	public CompactDisc() {
		nbMedia++;
		this.id=nbMedia;
		// TODO Auto-generated constructor stub
	}
	private int nbTrack=0;
private String artist;
private ArrayList<Track> tracks = new ArrayList<Track>();
public void addTrack(Track track)
{
	int k=0;
	for(int i=0;i<tracks.size();i++)
	{
		if(track.getLength()==tracks.get(i).getLength())
		{
			if (track.getTitle().compareToIgnoreCase(tracks.get(i).getTitle())==0)
					
					{
				      k=1;
				      break;
					}
		}
	}
	if(k==1) JOptionPane.showMessageDialog(null,"This track is already exist","Oops",JOptionPane.ERROR_MESSAGE);
	if(k==0)
	{
		tracks.add(tracks.size(),track);
		this.nbTrack++;
		JOptionPane.showMessageDialog(null,"The track is successfully added","Done",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
public void removeTrack(Track track)
{
	int k=0;
	for(int i=0;i<tracks.size();i++)
	{
		if(track.getLength()==tracks.get(i).getLength())
		{
			if (track.getTitle().compareToIgnoreCase(tracks.get(i).getTitle())==0)
					
					{
				      k=1;
				      tracks.remove(i);
				      JOptionPane.showMessageDialog(null,"The track is successfully been removed","Done",JOptionPane.INFORMATION_MESSAGE);
				      break;
					}
		}
	}
	if(k==0)
	{
		JOptionPane.showMessageDialog(null,"The track is not appeared in added Track","Oops",JOptionPane.ERROR_MESSAGE);
	}
	
}
public int getLength()
{
	int k=0;
	for(int i=0;i<tracks.size();i++)
	{
		k+=tracks.get(i).getLength();
	}
	return k;
}
public void play()
{
	JOptionPane.showMessageDialog(null,"Playing CD: "+this.title+"\n"+"CD length: "+this.getLength(),"CD",JOptionPane.INFORMATION_MESSAGE);;
	for(int i=0;i<tracks.size();i++)
	{
		tracks.get(i).play();
	}
}
public void play(Track track)
{
	for (int i=0;i<tracks.size();i++)
	{
		if(tracks.get(i).getLength()==track.getLength())
		{
			if(tracks.get(i).getTitle().compareToIgnoreCase(track.getTitle())==0)
			{
				tracks.get(i).play();
				break;
			}
		}
	}
}

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

public ArrayList<Track> getTracks() {
	return tracks;
}

public void setTracks(ArrayList<Track> tracks) {
	this.tracks = tracks;
}
public String toString()
{
	StringBuffer a=new StringBuffer();
	for(int i=0;i<this.tracks.size();i++)
	{
		a.append(this.tracks.get(i).getTitle());
		a.append(' ');
		a.append(this.tracks.get(i).getLength());
		a.append(',');
	}
	a.deleteCharAt(a.length()-1);
	return "CD    - "+"ID "+this.id+" "+this.title+" - "+this.category+" - "+this.artist+"-"+a.toString()+"\n"+
" - "+this.getLength()+" : "+this.cost+"$";
	
}

public int getNbTrack() {
	return nbTrack;
}
public CompactDisc copy()
{
	try {
		return (CompactDisc)this.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
public void setNbTrack(int nbTrack) {
	this.nbTrack = nbTrack;
}
}
