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
	public boolean isMatch(String title)
	{
		title= title.trim();
		title=title.toLowerCase();
		String title1=this.title.toLowerCase();
		/*StriongBuffer buffer = new StringBuffer();
		String a[] = new String[10];
		int i,j=0,k=0;
		for(i=1;i<title.length();i++)
		{
			if ((title.charAt(i)==' ') || (i==title.length()-1))
			{
				a[k]=title.substring(j, i);
				if (i==title.length()-1) a[k]=title.substring(j, i+1);
				k++;
				for(j=i+1;j<title.length();j++)
				{
					if (title.charAt(j)!=' ')
					{
						i=j;
						break;
					}
				}
				
			}
		}
		for(i=0;i<k;i++)
		{
			if(this.title.compareToIgnoreCase(a[i])==0)
			{
				return true;
			}
		}
		return false;*/
		int result= title1.indexOf(title);
		if(result>=0)
		{
		if ((result==0)||(title1.charAt(result-1)==' '))
		{
			if((result+title.length()==title1.length())||(title1.charAt(result+title.length())==' ')) return true;
		}
		}
		return false;
		
		
	}
	public String toString()
	{
		return "Media - "+"ID "+this.id+" "+this.title+" - "+this.category+" - "+" : "+this.cost+"$";
	}

}
