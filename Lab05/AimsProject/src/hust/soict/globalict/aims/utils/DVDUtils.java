package hust.soict.globalict.aims.utils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class DVDUtils {
public void compareByCost(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
{
	if(dvd1.getCost()<dvd2.getCost())
		System.out.println( "Disc No."+ dvd1.getId()+" cost less than Disc No."+dvd2.getId());
	if(dvd1.getCost()>dvd2.getCost())
		System.out.println("Disc No."+ dvd1.getId()+" cost more than Disc No."+dvd2.getId());
	if(dvd1.getCost()==dvd2.getCost())
		System.out.println("Disc No."+ dvd1.getId()+" has same price like Disc No."+dvd2.getId());
	
	
}
public void compareByTitle(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
{
	if((dvd1.getTitle().compareTo(dvd2.getTitle())<0))
		System.out.println("Disc No."+ dvd1.getId()+" has smaller title than Disc No."+dvd2.getId());
	if((dvd1.getTitle().compareTo(dvd2.getTitle())>0))
		System.out.println("Disc No."+ dvd1.getId()+" has greater title than Disc No."+dvd2.getId());
	if((dvd1.getTitle().compareTo(dvd2.getTitle())==0))
		System.out.println("Disc No."+ dvd1.getId()+" has same title like Disc No."+dvd2.getId());
	
	
}

public void sortByCost(DigitalVideoDisc[] sorted,int a)
{
	for(int i=0;i<a-1;i++)
	{
		for (int j=i+1;j<a;j++)
		{
			if(sorted[i].getCost()<sorted[j].getCost())
			{
				Wrapper o1=new Wrapper(sorted[i]);
				Wrapper o2=new Wrapper(sorted[j]);
			    swap(o1,o2);
			    sorted[i]=o1.a;
			    sorted[j]=o2.a;
			}
			if(sorted[i].getCost()==sorted[j].getCost())
			{
				if(sorted[i].getTitle().compareTo(sorted[j].getTitle())>0)
				{
					Wrapper o1=new Wrapper(sorted[i]);
					Wrapper o2=new Wrapper(sorted[j]);
				    swap(o1,o2);
				    sorted[i]=o1.a;
				    sorted[j]=o2.a;
				}
			}
		}
	}

}

public void sortByTitle(DigitalVideoDisc[] sorted,int a)
{
	for(int i=0;i<a-1;i++)
	{
		for (int j=i+1;j<a;j++)
		{ int k= sorted[i].getTitle().compareTo(sorted[j].getTitle());
			if(k>0)
			{
				Wrapper o1=new Wrapper(sorted[i]);
				Wrapper o2=new Wrapper(sorted[j]);
			    swap(o1,o2);
			    sorted[i]=o1.a;
			    sorted[j]=o2.a;
			}
			if(k==0)
			{
				if (sorted[i].getCost()<sorted[j].getCost())
				{
					Wrapper o1=new Wrapper(sorted[i]);
					Wrapper o2=new Wrapper(sorted[j]);
				    swap(o1,o2);
				    sorted[i]=o1.a;
				    sorted[j]=o2.a;
				}
			}
		}
	}
	
}
public void sortByLength(DigitalVideoDisc[] sorted)
{
	for(int i=0;i<sorted.length-1;i++)
	{
		for (int j=i+1;j<sorted.length;j++)
		{
			if(sorted[i].getLength()>sorted[j].getLength())
			{
				Wrapper o1=new Wrapper(sorted[i]);
				Wrapper o2=new Wrapper(sorted[j]);
			    swap(o1,o2);
			    sorted[i]=o1.a;
			    sorted[j]=o2.a;
			}
		}
	}

}
public void print(DigitalVideoDisc[] sorted,int a)
{
	for(int i=0;i<a-1;i++)
	{
		for (int j=i+1;j<a;j++)
		{
			if(sorted[i].getTitle().compareTo(sorted[j].getTitle())>0)
			{
				Wrapper o1=new Wrapper(sorted[i]);
				Wrapper o2=new Wrapper(sorted[j]);
			    swap(o1,o2);
			    sorted[i]=o1.a;
			    sorted[j]=o2.a;
			}
			if(sorted[i].getTitle().compareTo(sorted[j].getTitle())==0) 
			{
				if (sorted[i].getCost()>sorted[j].getCost())
				{
					Wrapper o1=new Wrapper(sorted[i]);
					Wrapper o2=new Wrapper(sorted[j]);
				    swap(o1,o2);
				    sorted[i]=o1.a;
				    sorted[j]=o2.a;
				}
				if(sorted[i].getCost()==sorted[j].getCost())
				{
					if(sorted[i].getLength()>sorted[j].getLength())
					{
						Wrapper o1=new Wrapper(sorted[i]);
						Wrapper o2=new Wrapper(sorted[j]);
					    swap(o1,o2);
					    sorted[i]=o1.a;
					    sorted[j]=o2.a;
					}
				}
			}
		}
	}
}
class Wrapper
{
	DigitalVideoDisc a;
	Wrapper(DigitalVideoDisc a)
	{
		this.a=a;
	}
}
public void swap(Wrapper o1,Wrapper o2)
{
	DigitalVideoDisc tmp = o1.a;
	o1.a=o2.a;
	o2.a=tmp;
}

}
