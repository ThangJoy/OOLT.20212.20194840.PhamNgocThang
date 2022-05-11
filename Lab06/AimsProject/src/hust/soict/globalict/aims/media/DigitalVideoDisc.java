package hust.soict.globalict.aims.media;
import java.time.LocalDate;
public class DigitalVideoDisc extends Media {
	
	public DigitalVideoDisc() {
		
		super();
		nbMedia++;
		this.id=nbMedia;
	
	}
	public DigitalVideoDisc(String title) {
		super(title);
		nbMedia++;
		this.id=nbMedia;
		
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
		this.director = director;
		nbMedia++;
		this.id=nbMedia;
		
		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		nbMedia++;
		this.id=nbMedia;

	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
		nbMedia++;
		this.id=nbMedia;
	}
	public String director;
	public int length;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
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
		return "DVD - "+"ID "+this.id+" "+this.title+" - "+this.category+" - "+this.director+" - "+this.length+": "+this.cost+"$";
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

}
