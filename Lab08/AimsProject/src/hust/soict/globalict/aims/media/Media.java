package hust.soict.globalict.aims.media;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class Media implements Comparable<Media>{


public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		dateAdded=LocalDate.now();
	}

public Media(String title) {
		super();
		this.title = title;
		dateAdded=LocalDate.now();
	}

public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		dateAdded=LocalDate.now();
	}
protected int id;
protected String title;
protected String category;
protected float cost;
protected static int nbMedia=0;
protected LocalDate dateAdded;
	public Media() {
		// TODO Auto-generated constructor stub
		dateAdded=LocalDate.now();
	}
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public int getId() {
		return id;
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
	
	
	public static int getNbMedia() {
		return nbMedia;
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
public boolean equals(Media obj)
{
	if(this.id==obj.getId())
	{
		return true;
	}
	return false;
}
public int compareTo(Media obj)
{
	if (this.title.compareToIgnoreCase(obj.getTitle())>0) return 1;
	
	if (this.title.compareToIgnoreCase(obj.getTitle())==0)
	{
		if (this.category.compareToIgnoreCase(obj.getCategory())>0) return 1;
		if (this.category.compareToIgnoreCase(obj.getCategory())<0) return -1;
		return 0;
	}
	return -1;
	
	
}

}