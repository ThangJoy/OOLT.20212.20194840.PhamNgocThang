import javax.swing.JOptionPane;

public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered=0;
public void addDigitalVideoDisc(DigitalVideoDisc disc)
{
	if (qtyOrdered<MAX_NUMBER_ORDERED)
	{
		qtyOrdered++;
		itemsOrdered[qtyOrdered] = disc;
		System.out.println("The disc "+qtyOrdered+" has been added");
	}else
		System.out.println("The cart is almost full");
	
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc)
{
	
}
public void totalCost()
{
	int i=0;
	float cost=0;
	for (i=1;i<=qtyOrdered;i++)
	{ 
		cost+=itemsOrdered[i].getCost();		 
	}
System.out.println("Total Cost is " + cost);
}
}
