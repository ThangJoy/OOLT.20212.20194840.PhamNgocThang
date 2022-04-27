package hust.soict.globalict.aims.cart;
import javax.swing.JOptionPane;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.test.utils.DVDUtils;

import java.util.ArrayList;
public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered=0;int h=0;
public void addDigitalVideoDisc(DigitalVideoDisc disc)
{
	if (qtyOrdered<MAX_NUMBER_ORDERED-1)
	{
		
		itemsOrdered[qtyOrdered] = disc;
		
		JOptionPane. showMessageDialog(null,"The disc No."+ (qtyOrdered+1)+ " has been added successfully");
		qtyOrdered++;
		 
	}else
	{
		 h++;
		 JOptionPane. showMessageDialog(null,"The disc No." +(qtyOrdered+h+1)+ " was not add to Cart","The Cart is full",JOptionPane.INFORMATION_MESSAGE);

    } 
}
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)
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
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist,int a)//a is just for classify with the above,can be arbitrary
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

}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
{
	addDigitalVideoDisc(dvd1);
	addDigitalVideoDisc(dvd2);
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc)
{
	int i,j,k=0;
	for (i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i]==disc)
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
	JOptionPane. showMessageDialog(null,"The disc No."+ (i+1)+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing DVD doesn't appeared in Cart");
	}
}
public float totalCost()
{
	int i=0;
	float cost=0;
	for (i=0;i<qtyOrdered;i++)
	{ 
		cost+=itemsOrdered[i].getCost();
	}
return cost;
}
public void sortByCost(DigitalVideoDisc[] sorted)
{
	DVDUtils a = new DVDUtils();
	a.sortByCost(sorted);
	for (int i=0;i<sorted.length;i++)
	{
		System.out.println("Disc No."+sorted[i].getId()+":"+sorted[i].getCost());
	}
	
}
public void sortByTitle(DigitalVideoDisc[] sorted)
{
	DVDUtils a = new DVDUtils();
	a.sortByTitle(sorted);
	for (int i=0;i<sorted.length;i++)
	{
		System.out.println("Disc No."+sorted[i].getId()+":"+sorted[i].getTitle());
	}
	
}
public void search(DigitalVideoDisc disc)
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
			JOptionPane. showMessageDialog(null,sorted[j],"The disc number "+(j+1)+" is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc number " +(j+1),"The disc is not found",JOptionPane.INFORMATION_MESSAGE);

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
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc" ,"The disc is not found",JOptionPane.INFORMATION_MESSAGE);

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
			JOptionPane. showMessageDialog(null,sorted[j],"The disc number "+sorted[j]+" is found",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	if(h==0)
	{
		JOptionPane. showMessageDialog(null,"Sorry,we couldn't find the disc number " +sorted[j],"The disc is not found",JOptionPane.INFORMATION_MESSAGE);

	}
	
	}
}
public void print()
{
	DVDUtils a = new DVDUtils();
	a.print(itemsOrdered,qtyOrdered);
	System.out.printf("***********************CART***********************\n\nOrdered Items:\n");
	for(int i=0;i<qtyOrdered;i++)
	{
		System.out.println(i+1+". "+itemsOrdered[i]);
	}
	System.out.printf("Total cost: %.2f\n**************************************************",totalCost());
}
}
