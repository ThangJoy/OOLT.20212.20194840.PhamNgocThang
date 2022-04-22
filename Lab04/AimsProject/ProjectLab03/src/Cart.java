import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered=0;int h=0;
public void addDigitalVideoDisc(DigitalVideoDisc disc)
{
	if (qtyOrdered<MAX_NUMBER_ORDERED-1)
	{
		
		System.out.println(qtyOrdered);
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
    int size = dvdlist.length;
    System.out.println(size);
    int i;
    if (qtyOrdered+size<=MAX_NUMBER_ORDERED-1) 
    {
    	for(i=0;i<=size;i++)
    	{
    		addDigitalVideoDisc(dvdlist[i]);
    	}
    }

}public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
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
	for (i=0;i<=qtyOrdered;i++)
	{ 
		cost+=itemsOrdered[i].getCost();
	}
return cost;
}
}
