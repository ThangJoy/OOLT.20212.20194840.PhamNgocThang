package hust.soict.globalict.aims.cart;
import javax.swing.JOptionPane;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.DVDUtils;

public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private  DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered=0;int h=0;
public void addDigitalVideoDisc(DigitalVideoDisc disc)
{
	int k=0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemsOrdered[i].getTitle().compareToIgnoreCase(disc.getTitle())==0)
		{
			
		if(itemsOrdered[i].getCategory().compareToIgnoreCase(disc.getCategory())==0)
		{
		if(itemsOrdered[i].getDirector().compareToIgnoreCase(disc.getDirector())==0)
		{
			
		if(itemsOrdered[i].getLength()==disc.getLength())
		{
			
		if(itemsOrdered[i].getCost()==disc.getCost())
		{
			
            k=1;
			break;
		}}}}}
	 }
	if(k==1) 
	{
	JOptionPane.showMessageDialog(null,"The disc is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
	disc.setNbDigitalVideoDisc(disc.getId()-1);
	}
	if(k==0) 
	{
		if (qtyOrdered<MAX_NUMBER_ORDERED)
		{
			
			itemsOrdered[qtyOrdered] = disc;
			
			JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been added successfully");
			qtyOrdered++;
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The disc Id." +disc.getId()+ " was not add to Cart","The Cart is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
	
	
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
}*/
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)//a is just for classify with the above,can be arbitrary
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
	JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been successfully removed");
	} else
	{
		JOptionPane. showMessageDialog(null,"The removing DVD doesn't appeared in Cart");
	}
}
public void removeDigitalVideoDisc(int id)
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
public void sortByCost()
{
	DVDUtils a = new DVDUtils();
	a.sortByCost(itemsOrdered,qtyOrdered);
	JOptionPane.showMessageDialog(null, itemsOrdered,"Here is you cart after sorted by Cost",JOptionPane.INFORMATION_MESSAGE);
	
}
public void sortByTitle()
{
	DVDUtils a = new DVDUtils();
	a.sortByTitle(itemsOrdered,qtyOrdered);
	JOptionPane.showMessageDialog(null, itemsOrdered,"Here is you cart after sorted by Title",JOptionPane.INFORMATION_MESSAGE);
	
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
public int getQtyOrdered() {
	return qtyOrdered;
}
public DigitalVideoDisc[] getItemsOrdered() {
	return itemsOrdered;
}
public DigitalVideoDisc getItemsOrdered(int i) {
	return itemsOrdered[i];
}

}
