package hust.soict.globalict.aims.store;
import javax.swing.JOptionPane;
import javax.swing.JList;
import java.util.Scanner;
import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.cart.*; 
import hust.soict.globalict.test.utils.*;


public class Store {
	public static final int MAXIMUM = 100;
	private static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAXIMUM];
	private static int nbItems=0;
	static Cart anOrder= new Cart();
	public static void addDVD(DigitalVideoDisc disc)
	{
		if (nbItems<itemsInStore.length)
		{
			
			itemsInStore[nbItems] = disc;
			
			JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been added successfully");
			nbItems++;
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The disc Id." +disc.getId()+ " was not add to Cart","The Store is full",JOptionPane.INFORMATION_MESSAGE);

	    } 
	}
	public static void removeDVD(DigitalVideoDisc disc)
	{
		int i,j,k=0;
		for (i=0;i<nbItems;i++)
		{
			if(itemsInStore[i]==disc)
			{
				k=1;
			    break;
			}
		}
		if (k==1)
		{
			
		for(j=i;j<nbItems;j++)
		{
			itemsInStore[j]=itemsInStore[j+1];
		}
		nbItems--;
		JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been successfully removed");
		} else
		{
			JOptionPane. showMessageDialog(null,"The removing DVD doesn't appeared in Cart");
		}
	}
	public static void searchByTitle(String title)
	{
		int k=0;
		DigitalVideoDisc nbMatch[]=new DigitalVideoDisc[MAXIMUM];
		for(int i=0;i<nbItems;i++)
		{
			if(itemsInStore[i].isMatch(title))
			{
				nbMatch[k]=itemsInStore[i];
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
	public static void showMenu()
	{ 
		int l=0;
		/*System.out.println("AIMS: ");  
	    System.out.println("--------------------------------"); 
	    System.out.println("1. View store"); 
	    System.out.println("2. Update store"); 
	    System.out.println("3. See current cart"); 
	    System.out.println("0. Exit"); 
	    System.out.println("--------------------------------"); 
	    System.out.println("Please choose a number: 0-1-2-3");*/
		while(true) 
		{
		 String[] display = new String[] {"--------------------------------","1. View store","2. Update store","3. See current cart","0. Exit","--------------------------------","Please choose a number: 0-1-2-3"};
		    String[] options = new String[] {"0", "1", "2", "3"};
		    int response = JOptionPane.showOptionDialog(null,display,"AIMS",
		      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
		        null, options,null);
		 switch(response)
		 {
		 case 1:
			 storeMenu();
			 break;
		 case 0:
			 l=1;
			 break;
		 case 2:
		    {
		    	String[] option = {"0.Add","1.Remove"};
				String[] option1 = {"0","1"};
				int choose = JOptionPane.showOptionDialog(null,option,"Your choice",
					      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
					        null, option1,null);
				
		    	switch(choose)
		    	{
		    	case 0:
		    	{
		            String s=new String();
		    		DigitalVideoDisc disc= new DigitalVideoDisc();
		    		s=JOptionPane.showInputDialog("Please enter the title of the disc");
		    		disc.setTitle(s);
		    		s=JOptionPane.showInputDialog("Please enter the category of the disc");
		    		disc.setCategory(s);
		    		s=JOptionPane.showInputDialog("Please enter the director of the disc");
		    		disc.setDirector(s);
		    		int a;
		    		a=Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of the disc"));
		    		disc.setLength(a);
		    		float b;
		    		b=Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost of the disc"));
		    		disc.setCost(b);
		    		int k=0;
		    		for(int i=0;i<nbItems;i++)
		    		{
		    			if(itemsInStore[i].getTitle().compareToIgnoreCase(disc.getTitle())==0)
		    			{
		    			
		    			if(itemsInStore[i].getCategory().compareToIgnoreCase(disc.getCategory())==0)
		    			{
		    			
		    			if(itemsInStore[i].getDirector().compareToIgnoreCase(disc.getDirector())==0)
		    			{
		    			if(itemsInStore[i].getLength()==disc.getLength())
		    			{
		    				
		    			if(itemsInStore[i].getCost()==disc.getCost())
		    			{
		    				
		                    k=1;
		    				break;
		    			}}}}}
		    		 }
		    		if(k==0) addDVD(disc);
		    		if(k==1) 
		    			{
		    			JOptionPane.showMessageDialog(null,"The disc is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
		    			disc.setNbDigitalVideoDisc(disc.getId()-1);
		    			}
		    		
		    	}
		    	break;
		    	case 1:
		    	{
		    		JOptionPane. showMessageDialog(null,itemsInStore,"Here's the list of discs",JOptionPane.INFORMATION_MESSAGE);
					JList<DigitalVideoDisc> jlist = new JList<DigitalVideoDisc>(itemsInStore);
					JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple discs you wanna remove",JOptionPane.PLAIN_MESSAGE);
					int[] value = jlist.getSelectedIndices();
							for (int i=0;i<value.length;i++)
							{
								removeDVD(itemsInStore[i]);
							}
		    	}
		    	break;
		    	default:break;
		    	}
		    }
		    break;
		 case 3:
		 {
			 cartMenu();
		 }
		 break;
	
		default:
			 break;
		 }
		 if(l==1) break;
		}
		    
	    /*Scanner sc= new Scanner(System.in);
	    int i=sc.nextInt();
	    switch(i)
	    {
	    case 1:
	    	storeMenu();
	    	int j=sc.nextInt();
	    	switch(j)
	    	{
	    	case 1:
	    	}
	    }*/
	   

	}
	public static void storeMenu() 
	{ 
	   /* System.out.println("Options: ");
	    System.out.println("--------------------------------"); 
	    System.out.println("1. See a DVD’s details"); 
	    System.out.println("2. Add a DVD to cart"); 
	    System.out.println("3. See current cart"); 
	    System.out.println("0. Back"); 
	    System.out.println("--------------------------------"); 
	    System.out.println("Please choose a number: 0-1-2-3");*/
		while(true)
		{
			int l=0;
		String[] display = new String[] {"--------------------------------","1. See a DVD’s details","2. Add a DVD to cart","3. See current cart","0. Back","--------------------------------","Please choose a number: 0-1-2-3"};
	    String[] options = new String[] {"0", "1", "2", "3"};
	    int response = JOptionPane.showOptionDialog(null,display,"Options",
	      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	        null, options,null);
	    switch(response)
	    {
	    case 0:
	    	l=1;
	    	break;
	    case 1:
	    {
	    	String title;
	    	title=JOptionPane.showInputDialog("Please enter the title of the disc");
	    	searchByTitle(title);
	    }
	    	break;
	    case 2:
	    {
	    	JOptionPane. showMessageDialog(null,itemsInStore,"Here is the list of DVDs in Store",JOptionPane.INFORMATION_MESSAGE);
	    	String title=JOptionPane.showInputDialog("Please enter the title of the disc you wannna add");
	    	int k=0;
			DigitalVideoDisc nbMatch[]=new DigitalVideoDisc[MAXIMUM];
			for(int i=0;i<nbItems;i++)
			{
				if(itemsInStore[i].isMatch(title))
				{
					nbMatch[k]=itemsInStore[i];
					k++;
				}
			}
			if(k==1)
			{
				anOrder.addDigitalVideoDisc(nbMatch[0]);
				JOptionPane. showMessageDialog(null,anOrder.getQtyOrdered(),"The number of DVDs in the current cart",JOptionPane.INFORMATION_MESSAGE);
			}
			if(k>1)
			{
				JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching discs",JOptionPane.INFORMATION_MESSAGE);
				String[] option = {"0.Add by myself","1.Add all"};
				String[] option1 = {"0","1"};
				int choose = JOptionPane.showOptionDialog(null,option,"Your choise",
					      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
					        null, option1,null);
				switch(choose)
				{
				case 1:
				{
					for(int i=0;i<k;i++)
					{
						
						anOrder.addDigitalVideoDisc(nbMatch[i]);
					}
					JOptionPane. showMessageDialog(null,anOrder.getQtyOrdered(),"The number of DVDs in the current cart",JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				case 0:
				{
					JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching discs",JOptionPane.INFORMATION_MESSAGE);
					JList<DigitalVideoDisc> jlist = new JList<DigitalVideoDisc>(nbMatch);
					JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple discs you wanna add",JOptionPane.PLAIN_MESSAGE);
					int[] value = jlist.getSelectedIndices();
							for (int i=0;i<value.length;i++)
							{
								anOrder.addDigitalVideoDisc(nbMatch[i]);
							}
					JOptionPane. showMessageDialog(null,anOrder.getQtyOrdered(),"The number of DVDs in the current cart",JOptionPane.INFORMATION_MESSAGE);
							
				}
				break;
				default:break;
				}
			}
			if(k==0) 
			{
				JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the disc you want ","The disc is not foun",JOptionPane.ERROR_MESSAGE);
			}
	    	
	    }
	    break;
	    case 3: 
	    {
	    	cartMenu();
	    }
	    break;
	    default:break;
	    
	    	
	}
	    if(l==1) break;
 }
}
	public static void cartMenu() 
	{ 
	/*System.out.println("Options: ");
	System.out.println("--------------------------------");
	System.out.println("1. Filter DVDs in cart"); 
	System.out.println("2. Sort DVDs in cart"); 
	System.out.println("3. Remove DVD from cart"); 
	System.out.println("4. Place order"); 
	System.out.println("0. Back"); 
	System.out.println("--------------------------------"); 
	System.out.println("Please choose a number: 0-1-2-3-4");*/
		while(true)
		{
			int l=0;
		String[] display = new String[] {"--------------------------------","1. Filter DVDs in cart","2. Sort DVDs in cart","3. Remove DVD from cart","4. Place order","0. Back","--------------------------------","Please choose a number: 0-1-2-3-4"};
	    String[] options = new String[] {"0", "1", "2", "3","4"};
	    int response = JOptionPane.showOptionDialog(null,display,"Options:",
	      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	        null, options,null);	
	    switch(response)
	    {
	    case 0:
	    {
	    	l=1;
	    }
	    break;
	    case 1:
	    {
	    	String[] filter= {"0.Filter by Id","1.Filter by title"};
	    	String[] option= {"0","1"};
	    	int response1 = JOptionPane.showOptionDialog(null,filter,"Options:",
	    		      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	    		        null, option,null);	
	    	switch(response1)
	    	{
	    	case 0:
	    	{
	    		int a;
	    		a=Integer.parseInt(JOptionPane.showInputDialog("Please enter the id of the disc"));
	    		anOrder.filterById(a);
	    	}
	    	break;
	    	case 1:
	    	{
	    		String title;
		    	title=JOptionPane.showInputDialog("Please enter the title of the disc");
		    	anOrder.filterByTitle(title);
	    	}
	    	break;
	    	default:break;
	    	}
	    }
	    break;
	    case 2:
	    {
	    	String[] sort= {"0.Sort by title","1.Sort by cost"};
	    	String[] option= {"0","1"};
	    	int response1 = JOptionPane.showOptionDialog(null,sort,"Options:",
	    		      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	    		        null, option,null);	
	    	switch(response1)
	    	{
	    	case 0:
	    	{
	    		anOrder.sortByTitle();
	    	}
	    	break;
	    	case 1:
	    	{
	    		anOrder.sortByCost();
	    	}
	    	break;
	    	default:break;
	    	}
	    	
	    }
	    break;
	    case 3:
	    {
	    	JOptionPane.showMessageDialog(null, anOrder.getItemsOrdered(),"Here is the list of dvd currently in cart",JOptionPane.INFORMATION_MESSAGE);
	    	JList<DigitalVideoDisc> jlist = new JList<DigitalVideoDisc>(anOrder.getItemsOrdered());
			JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple discs you wanna remove",JOptionPane.PLAIN_MESSAGE);
			int[] value = jlist.getSelectedIndices();
					for (int i=0;i<value.length;i++)
					{
						anOrder.removeDigitalVideoDisc(anOrder.getItemsOrdered(i));
					}
	    	
	    }
	    break;
	    case 4:
	    {
	    	JOptionPane.showMessageDialog(null, "An order is created","Thank you",JOptionPane.INFORMATION_MESSAGE);
	    	anOrder = new Cart();
	    }
	    break;
	    default:break;
	    }
	if (l==1) break;
	}
}
static class Wrapper
	{
		DigitalVideoDisc a;
		Wrapper(DigitalVideoDisc a)
		{
			this.a=a;
		}
	}
public static void swap(Wrapper o1,Wrapper o2)
	{
		DigitalVideoDisc tmp = o1.a;
		o1.a=o2.a;
		o2.a=tmp;
	}
}
