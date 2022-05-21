package hust.soict.globalict.aims.media;

import javax.swing.JOptionPane;

public class Track implements Playable,Comparable<Track>{

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public Track(int length) {
		super();
		this.length = length;
	}
	public Track(String title) {
		super();
		this.title = title;
	}
	public Track() {
		// TODO Auto-generated constructor stub
	}
private String title;
private int length;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public void play()
{
	JOptionPane.showMessageDialog(null, "Playing CD: "+this.getTitle()+"\n"+"CD length: "+this.getLength(),"CompactDisc",JOptionPane.INFORMATION_MESSAGE);
}
public String toString()
{
	return "TRACK - "+"Title: "+this.title+" Length: "+this.length;
}
public boolean equals(Track obj)
{
	if(this.title.compareToIgnoreCase(obj.getTitle())==0)
	{
		if(this.length==obj.getLength())
		{
			return true;
		}
	}
	return false;
}
public int compareTo(Track obj)
{
	if (this.title.compareToIgnoreCase(obj.getTitle())>0) return 1;
	
	if (this.title.compareToIgnoreCase(obj.getTitle())==0)
	{
		if(this.length<obj.getLength()) return -1;
		if(this.length>obj.getLength()) return 1;
		return 0;
	}
	return -1;
	
	
}
}
