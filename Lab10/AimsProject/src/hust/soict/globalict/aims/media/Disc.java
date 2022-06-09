package hust.soict.globalict.aims.media;

public class Disc extends Media {

	public Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category,String director, float cost) {
		super(title, category, cost);
		this.director=director;
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category,String director,int length ,float cost) {
		super(title, category, cost);
		this.director=director;
		this.length=length;
		// TODO Auto-generated constructor stub
	}
	public Disc() {
		// TODO Auto-generated constructor stub
	}
protected String director;
protected int length;
public String getDirector() {
	return director;
}

public void setTitle(String title) {
	this.title = title;
}
public void setCategory(String category) {
	this.category = category;
}
public void setCost(float cost) {
	this.cost = cost;
}
public void setDirector(String director) {
	this.director = director;
}
public static void setNbMedia(int nbMedia) {
	Media.nbMedia = nbMedia;
}
public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}
}
