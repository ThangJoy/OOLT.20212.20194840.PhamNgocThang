package hust.soict.globalict.aims.media;

import java.time.LocalDate;

public class Media {


public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

public Media(String title) {
		super();
		this.title = title;
	}

public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
protected int id;
protected String title;
protected String category;
protected float cost;
protected static int nbMedia=0;
protected LocalDate dateAdded=LocalDate.now();
	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
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

	public static int getNbMedia() {
		return nbMedia;
	}

	public static void setNbMedia(int nbMedia) {
		Media.nbMedia = nbMedia;
	}

}
