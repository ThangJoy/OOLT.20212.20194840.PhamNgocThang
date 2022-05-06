import java.time.LocalDate;
public class DigitalVideoDisc {
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;
		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id=nbDigitalVideoDisc;
	}
	public String title;
	public String category;
	public String director;
	public int length;
	public float cost;
	private LocalDate dateAdded=LocalDate.now();
	private static int nbDigitalVideoDisc=0;
	public int id;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	
	
	public String toString()
	{
		return "DVD - "+this.title+" - "+this.category+" - "+this.director+" - "+this.length+": "+this.cost+"$";
	}
	

}
