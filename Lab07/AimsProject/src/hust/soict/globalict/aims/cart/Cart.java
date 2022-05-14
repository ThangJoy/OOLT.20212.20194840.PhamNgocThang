package hust.soict.globalict.aims.cart;
import javax.swing.JOptionPane;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.utils.DVDUtils;


import java.util.ArrayList;
import java.util.List;
import java.lang.Math.*;
public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private  ArrayList<Media> itemsOrdered = new ArrayList<Media>();
private  ArrayList<DigitalVideoDisc> itemsOrderedDvd = new ArrayList<DigitalVideoDisc>();
private  ArrayList<Book> itemsOrderedBook= new ArrayList<Book>();
private  ArrayList<CompactDisc> itemsOrderedCd= new ArrayList<CompactDisc>();
int h=0;

public DigitalVideoDisc[] getDvd()
{
	DigitalVideoDisc[] a = new DigitalVideoDisc[itemsOrderedDvd.size()];
	itemsOrderedDvd.toArray(a);
	return a;
}
public Book[] getBook()
{
	Book[] a = new Book[itemsOrderedBook.size()];
	itemsOrderedBook.toArray(a);
	return a;
}
public CompactDisc[] getCd()
{
	CompactDisc[] a = new CompactDisc[itemsOrderedCd.size()];
	itemsOrderedCd.toArray(a);
	return a;
}
public Media[] getMedia()
{
	Media[] a = new Media[itemsOrdered.size()];
	itemsOrdered.toArray(a);
	return a;
}
public ArrayList<Media> getMedia1()
{
	return itemsOrdered;
}
public ArrayList<CompactDisc> getCd1()
{
	return itemsOrderedCd;
}
public ArrayList<DigitalVideoDisc> getDvd1()
{
	return itemsOrderedDvd;
}
public void addMedia(DigitalVideoDisc disc)
{
	int k=0;
	for(int i=0;i<itemsOrderedDvd.size();i++)
	{
		/*if(itemsOrderedDvd.get(i).getTitle().compareToIgnoreCase(disc.getTitle())==0)
		{
		if(itemsOrderedDvd.get(i).getCategory().compareToIgnoreCase(disc.getCategory())==0)
		{
		if(itemsOrderedDvd.get(i).getDirector()==disc.getDirector())
		{
		if(itemsOrderedDvd.get(i).getLength()==disc.getLength())
		{
			
		if(itemsOrderedDvd.get(i).getCost()==disc.getCost())
		{
			
            k=1;
			break;
		}}}}}*/
		if(itemsOrderedDvd.get(i).getId()==disc.getId())
		{
			k=1;
			break;
		}
	}
	if(k==1) 
	{
	JOptionPane.showMessageDialog(null,"The disc is already been added to cart before","Please try again",JOptionPane.ERROR_MESSAGE);
	//disc.setNbMedia(disc.getId()-1);
	}
	if(k==0) 
	{
		if (itemsOrdered.size()<MAX_NUMBER_ORDERED)
		{
			itemsOrdered.add(itemsOrdered.size(), disc);
			itemsOrderedDvd.add(itemsOrderedDvd.size(),disc);
			
			

			
			JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been added successfully");
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The disc Id." +disc.getId()+ " was not add to Cart","The Cart is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
	
}
	
public void addMedia(Book book)
{
	int k=0;
	for(int i=0;i<itemsOrderedBook.size();i++)
	{
		/*if(itemsOrderedBook.get(i).getTitle().compareToIgnoreCase(book.getTitle())==0)
		{
		if(itemsOrderedBook.get(i).getCategory().compareToIgnoreCase(book.getCategory())==0)
		{
		if(itemsOrderedBook.get(i).getCost()==book.getCost())
		{
		if(itemsOrderedBook.get(i).getAuthors()==book.getAuthors())
		
		{
			
            k=1;
			break;
		}}}}*/
		if(itemsOrderedBook.get(i).getId()==book.getId())
		{
			k=1;
			break;
		}
	 }
	
	if(k==1) 
	{
	JOptionPane.showMessageDialog(null,"The book is already been added to cart before","Please try again",JOptionPane.ERROR_MESSAGE);
	//book.setNbMedia(book.getId()-1);
	}
	if(k==0) 
	{
		if (itemsOrdered.size()<MAX_NUMBER_ORDERED)
		{
			
			itemsOrdered.add(itemsOrdered.size(),book);
			itemsOrderedBook.add(itemsOrderedBook.size(),book);
			
			JOptionPane. showMessageDialog(null,"The book Id."+ book.getId()+ " has been added successfully");
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The book Id." +book.getId()+ " was not add to Cart","The Cart is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
	
}
public void addMedia(CompactDisc cd)
{
	int k=0;
	for(int i=0;i<itemsOrderedCd.size();i++)
	{
		if(itemsOrderedCd.get(i).getId()==cd.getId())
		{
			k=1;
			break;
		}
		
			
	}
	if(k==1) 
	{
	JOptionPane.showMessageDialog(null,"The Cd is already been added to cart before","Please try again",JOptionPane.ERROR_MESSAGE);
	//book.setNbMedia(book.getId()-1);
	}
	if(k==0) 
	{
		
		if (itemsOrdered.size()<MAX_NUMBER_ORDERED)
		{
			
			itemsOrdered.add(itemsOrdered.size(),cd);
			itemsOrderedCd.add(itemsOrderedBook.size(),cd);
			
			JOptionPane. showMessageDialog(null,"The cd Id."+ cd.getId()+ " has been added successfully");
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The cd Id." +cd.getId()+ " was not add to Cart","The Cart is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
}
public void addTrack(Track track,CompactDisc cd)
{
	cd.addTrack(track);
}
public void removeTrack(Track track,CompactDisc cd)
{
	cd.removeTrack(track);
}
/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)
{
	    int i;
	    if (qtyOrdered+5<=MAX_NUMBER_ORDERED-1) // We can add a list of 5 DVDs at once
	    {
	    	for(i=0;i<5;i++)
	    	{
	    		addDigitalVideoDisc(dvdlist[i]);
	    	}
	    }
}
/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)//a is just for classify with the above,can be arbitrary
{
    int size = dvdlist.length;
    int i;
    if (qtyOrdered+size<=MAX_NUMBER_ORDERED-1) 
    {
    	for(i=0;i<size;i++)
    	{
    		addDigitalVideoDisc(dvdlist[i]);
    	}
    }
    qtyOrdered+=size;
}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
{
	addDigitalVideoDisc(dvd1);
	addDigitalVideoDisc(dvd2);
	qtyOrdered+=2;
}*/

public void removeMedia(DigitalVideoDisc disc)
{
	if(itemsOrderedDvd.size()==0)
	{
		JOptionPane. showMessageDialog(null,"There's no Dvd in Cart","Oops",JOptionPane.ERROR_MESSAGE);
	}
	else
	{
	int i,j,k=0;
	for (i=0;i<itemsOrderedDvd.size();i++)
	{
		if(itemsOrderedDvd.get(i)==disc)
		{
			k=1;
			itemsOrderedDvd.remove(i);
			for(j=0;j<itemsOrdered.size();j++)
			{
				if (itemsOrdered.get(j)==disc) 
			 { 
					itemsOrdered.remove(j);
				    break;
			 }
			}
		    break;
		}
		
	}
	
	if (k==1)
	{

	JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing DVD doesn't appeared in Cart");
	}
	}
}
public void removeMedia(Book book)
{
	if(itemsOrderedBook.size()==0)
	{
		JOptionPane. showMessageDialog(null,"There's no book in Cart","Oops",JOptionPane.ERROR_MESSAGE);
	}
	else
	{
	int i,j,k=0;
	for (i=0;i<itemsOrderedBook.size();i++)
	{
		if(itemsOrderedBook.get(i)==book)
		{
			k=1;
			itemsOrderedBook.remove(i);
			for(j=0;j<itemsOrdered.size();j++)
			{
				if (itemsOrdered.get(j)==book) 
					{
					itemsOrdered.remove(j);
				    break;
					}
			}
		    break;
		}
	}
	if (k==1)
	{
	JOptionPane. showMessageDialog(null,"The book Id."+ book.getId()+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing book doesn't appeared in Cart");
	}
	}
}
public void removeMedia(CompactDisc cd)
{
	if(itemsOrderedCd.size()==0)
	{
		JOptionPane. showMessageDialog(null,"There's no cd in Cart","Oops",JOptionPane.ERROR_MESSAGE);
	}
	else
	{
	int i,j,k=0;
	for (i=0;i<itemsOrderedCd.size();i++)
	{
		if(itemsOrderedCd.get(i)==cd)
		{
			k=1;
			itemsOrderedCd.remove(i);
			for(j=0;j<itemsOrdered.size();j++)
			{
				if (itemsOrdered.get(j)==cd) 
					{
					itemsOrdered.remove(j);
				    break;
					}
			}
		    break;
		}
	}
	if (k==1)
	{
	JOptionPane. showMessageDialog(null,"The cd Id."+ cd.getId()+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing cd doesn't appeared in Cart");
	}
	}
}
public void removeMedia(Media disc)
{
	if(itemsOrdered.size()==0)
	{
		JOptionPane. showMessageDialog(null,"The Cart 's empty","Oops",JOptionPane.ERROR_MESSAGE);
	}
	else
	{
	int i,j,k=0;
	for (i=0;i<itemsOrdered.size();i++)
	{
		if(itemsOrderedDvd.get(i).getId()==disc.getId())
		{
			k=1;
			itemsOrdered.remove(i);
			for(j=0;j<itemsOrderedDvd.size();j++)
			{
				if (itemsOrderedDvd.get(j).getId()==disc.getId()) 
			 { 
					itemsOrderedDvd.remove(j);
				    break;
			 }
			}
			for(j=0;j<itemsOrderedBook.size();j++)
			{
				if (itemsOrderedBook.get(j).getId()==disc.getId()) 
			 { 
					itemsOrderedBook.remove(j);
				    break;
			 }
			}
			for(j=0;j<itemsOrderedCd.size();j++)
			{
				if (itemsOrderedCd.get(j).getId()==disc.getId()) 
			 { 
					itemsOrderedCd.remove(j);
				    break;
			 }
			}
		    break;
		}
		
	}
	
	if (k==1)
	{

	JOptionPane. showMessageDialog(null,"The media Id."+ disc.getId()+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing media doesn't appeared in Cart");
	}
	}
}
public int getnbOrder()
{
	return itemsOrdered.size();
}
/*public void removeDigitalVideoDisc(int id)
{
	int i,j,k=0;
	for (i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i].getId()==id)
		{
			k=1;
		    break;
		}
	}
	if (k==1)
	{
		
	for(j=i;j<qtyOrdered;j++)
	{
		itemsOrdered[j]=itemsOrdered[j+1];
	}
	qtyOrdered--;
	JOptionPane. showMessageDialog(null,"The disc Id."+ id+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing DVD doesn't appeared in Cart");
	}
}*/

public float totalCost(Media a)
{
	int i=0;
	float cost=0;
	for (i=0;i<itemsOrdered.size();i++)
	{ 
		if(a.getId()!=itemsOrdered.get(i).getId())
		cost+=itemsOrdered.get(i).getCost();
	}
return cost;
}
public Media getALuckyItem()
{
	double x= Math.random()*(itemsOrdered.size());
	int gift=(int)x;
	return itemsOrdered.get(gift);
}

public void sortByTitle()
{
	Media[] a = new Media[itemsOrdered.size()];
	itemsOrdered.toArray(a);
	
	for(int i=0;i<a.length-1;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if(a[i].getTitle().compareTo(a[j].getTitle())>0)
			{
				Wrapper o1=new Wrapper(a[i]);
				Wrapper o2=new Wrapper(a[j]);
			    swap(o1,o2);
			  a[i]=o1.a;
			   a[j]=o2.a;
			}
			if(a[i].getTitle().compareTo(a[j].getTitle())==0)
			if(a[i].getCost()<a[j].getCost())
			{
				
				{
					Wrapper o1=new Wrapper(a[i]);
					Wrapper o2=new Wrapper(a[j]);
				    swap(o1,o2);
				    a[i]=o1.a;
					   a[j]=o2.a;
				}
			}
		}
	}
	
	
}
public void sortByCost()
{
	Media[] a = new Media[itemsOrdered.size()];
	itemsOrdered.toArray(a);
	
	for(int i=0;i<a.length-1;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if(a[i].getCost()>a[j].getCost())
			{
				Wrapper o1=new Wrapper(a[i]);
				Wrapper o2=new Wrapper(a[j]);
			    swap(o1,o2);
			    a[i]=o1.a;
				   a[j]=o2.a;
			}
			
			if(a[i].getCost()==a[j].getCost())
			if(a[i].getTitle().compareTo(a[j].getTitle())<0)
			{
				
				{
					Wrapper o1=new Wrapper(a[i]);
					Wrapper o2=new Wrapper(a[j]);
				    swap(o1,o2);
				    a[i]=o1.a;
					   a[j]=o2.a;
				}
			}
		}
	}
	

	
	
}
/*public void search(DigitalVideoDisc disc)
{
	
		h=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i]==disc)
		{
			h=1;
			JOptionPane. showMessageDialog(null,disc,"The disc number is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc" ,"The disc is not found",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
public void search(DigitalVideoDisc[] sorted)
{
	for(int j=0;j<sorted.length;j++)
	{
		h=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i]==sorted[j])
		{
			h=1;
			JOptionPane. showMessageDialog(null,sorted[j],"The disc Id "+itemsOrdered[i].getId()+" is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc number " +(j+1),"The disc is not found",JOptionPane.ERROR_MESSAGE);
	}
	
	}
}
public void search(int a)
{
	
		h=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i].getId()==a)
		{
			h=1;
			JOptionPane. showMessageDialog(null,itemsOrdered[i],"The disc number is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc" ,"The disc is not found",JOptionPane.ERROR_MESSAGE);
	}
	
}
public void search(int[] sorted)
{
	for(int j=0;j<sorted.length;j++)
	{
		h=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i].getId()==sorted[j])
		{
			h=1;
			JOptionPane. showMessageDialog(null,sorted[j],"The disc Id "+sorted[j]+" is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc Id " +sorted[j],"The disc is not found",JOptionPane.ERROR_MESSAGE);
	}
	
	}
}
public void filterByTitle(String title)
{
	int k=0;
	DigitalVideoDisc nbMatch[]=new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i].isMatch(title))
		{
			nbMatch[k]=itemsOrdered[i];
			k++;
		}
	}
	if(k==1)
	{
		JOptionPane. showMessageDialog(null,nbMatch,"The disc is found",JOptionPane.INFORMATION_MESSAGE);
	}
	if(k>1)
	{
		JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching discs",JOptionPane.INFORMATION_MESSAGE);
	}
	if(k==0) 
	{
		JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the disc you want ","The disc is not foun",JOptionPane.ERROR_MESSAGE);
	}
}
public void filterById(int a)
{
	int k=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if (itemsOrdered[i].getId()==a)
		{
			k=1;
			JOptionPane. showMessageDialog(null,itemsOrdered[i],"The disc is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		if(k==0) JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the disc you want ","The disc is not foun",JOptionPane.ERROR_MESSAGE);
		
	}
}
*/
/*
public void print()
{
	
	for(int i=0;i<itemsOrdered.size()-1;i++)
	{
		for (int j=i+1;j<itemsOrdered.size();j++)
		{
			if(itemsOrdered.get(i).getTitle().compareTo(itemsOrdered.get(j).getTitle())>0)
			{
				Wrapper o1=new Wrapper(itemsOrdered.get(i));
				Wrapper o2=new Wrapper(itemsOrdered.get(j));
			    swap(o1,o2);
			   itemsOrdered.add(i,o1.a);
			   itemsOrdered.add(j,o2.a);
			}
			if(itemsOrdered.get(i).getTitle().compareTo(itemsOrdered.get(j).getTitle())==0)
			if(itemsOrdered.get(i).getCost()<itemsOrdered.get(j).getCost())
			{
				
				{
					Wrapper o1=new Wrapper(itemsOrdered.get(i));
					Wrapper o2=new Wrapper(itemsOrdered.get(j));
				    swap(o1,o2);
				    itemsOrdered.add(i,o1.a);
					itemsOrdered.add(j,o2.a);
				}
			}
		}
	}
	
}
*/

public void test()
{
	System.out.println(itemsOrdered.get(1) instanceof DigitalVideoDisc);
}
class Wrapper
{
	Media a;
	Wrapper(Media a)
	{
		this.a=a;
	}
}
public void swap(Wrapper o1,Wrapper o2)
{
	Media tmp = o1.a;
	o1.a=o2.a;
	o2.a=tmp;
}

}