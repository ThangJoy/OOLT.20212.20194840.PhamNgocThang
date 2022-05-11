package hust.soict.globalict.aims.store;
import javax.swing.JOptionPane;
import javax.swing.JList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.cart.*; 
import hust.soict.globalict.test.utils.*;


public class Store {
	public static final int MAXIMUM = 100;
	private static ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private static ArrayList<DigitalVideoDisc> itemsInStoreDvd = new ArrayList<DigitalVideoDisc>();
	private static ArrayList<Book> itemsInStoreBook = new ArrayList<Book>();
	private static int nbItems=0;
	static Cart anOrder= new Cart();
	public static void addMedia(DigitalVideoDisc disc)
	{
		if (itemsInStore.size()<MAXIMUM)
		{
			itemsInStore.add(itemsInStore.size(),disc);
			itemsInStoreDvd.add(itemsInStoreDvd.size(),disc);
			JOptionPane. showMessageDialog(null,"The disc Id."+ disc.getId()+ " has been added successfully");
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The disc Id." +disc.getId()+ " was not add to Cart","The Store is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
	public static void addMedia(Book book)
	{
		if (itemsInStore.size()<MAXIMUM)
		{
			itemsInStore.add(itemsInStore.size(),book);
			itemsInStoreBook.add(itemsInStoreBook.size(),book);
			JOptionPane. showMessageDialog(null,"The book Id."+ book.getId()+ " has been added successfully");
			 
		}else
		{
			 JOptionPane. showMessageDialog(null,"The book Id." +book.getId()+ " was not add to Cart","The Store is full",JOptionPane.ERROR_MESSAGE);

	    } 
	}
	public static void removeMedia(DigitalVideoDisc disc)
	{
		int i,j,k=0;
		for (i=0;i<itemsInStoreDvd.size();i++)
		{
			if(itemsInStoreDvd.get(i)==disc)
			{
				k=1;
				itemsInStoreDvd.remove(i);
				for(j=0;j<itemsInStore.size();j++) {
					if(itemsInStore.get(j)==disc)
					{
						itemsInStore.remove(j);
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
	public static void removeMedia(Book book)
	{
		int i,j,k=0;
		for (i=0;i<itemsInStoreBook.size();i++)
		{
			if(itemsInStoreBook.get(i)==book)
			{
				k=1;
				itemsInStoreBook.remove(i);
				for(j=0;j<itemsInStore.size();j++) {
					if(itemsInStore.get(j)==book)
					{
						itemsInStore.remove(j);
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
	public static void searchByMediaTitle(String title)
	{
		int k=0;
		ArrayList<Media> nbMatch1=new ArrayList<Media>();
		for(int i=0;i<itemsInStore.size();i++)
		{
			if(itemsInStore.get(i).isMatch(title))
			{
			    nbMatch1.add(itemsInStore.get(i));
			    k++;
			}
		}
		Media nbMatch[]= new Media[nbMatch1.size()];
		nbMatch1.toArray(nbMatch);
		if(k==1)
		{
			
			JOptionPane. showMessageDialog(null,nbMatch,"The media is found",JOptionPane.INFORMATION_MESSAGE);
		}
		if(k>1)
		{
			JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching media",JOptionPane.INFORMATION_MESSAGE);
		}
		if(k==0) 
		{
			JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the media you want ","The media is not found",JOptionPane.ERROR_MESSAGE);
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
		            String[] option2 = {"0.Add Dvd","1.Add Book"};
		            String[] option3 = {"0","1"};
		            int choose1 = JOptionPane.showOptionDialog(null,option2,"Your choice",
						      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
						        null, option3,null);
		            switch(choose1)
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
		        		for(int i=0;i<itemsInStoreDvd.size();i++)
		        		{
		        			if(itemsInStoreDvd.get(i).getTitle().compareToIgnoreCase(disc.getTitle())==0)
		        			{
		        			if(itemsInStoreDvd.get(i).getCategory().compareToIgnoreCase(disc.getCategory())==0)
		        			{
		        			
		        			if(itemsInStoreDvd.get(i).getDirector().compareToIgnoreCase(disc.getDirector())==0)
		        			{
		        			if(itemsInStoreDvd.get(i).getLength()==disc.getLength())
		        			{
		        				
		        			if(itemsInStoreDvd.get(i).getCost()==disc.getCost())
		        			{
		        				
		                        k=1;
		        				break;
		        			}}}}}
		        		 }
		        		if(k==0) addMedia(disc);
		        		if(k==1) 
		        			{
		        			JOptionPane.showMessageDialog(null,"The disc is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
		        			disc.setNbMedia(disc.getId()-1);
		        			}
		            }
		            break;
		            case 1:
		            {
		            	String s=new String();
		        		Book book= new Book();
		        		s=JOptionPane.showInputDialog("Please enter the title of the book");
		        		book.setTitle(s);
		        		s=JOptionPane.showInputDialog("Please enter the category of the book");
		        		book.setCategory(s);
		        		float b;
		        		b=Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost of the book"));
		        		
		        		List<String> authors = new ArrayList<String>();
		        		while(true)
		        		{
		        			
		        			s=JOptionPane.showInputDialog("Please enter the list of author(type Exit to leave)");
		        			if (s.compareToIgnoreCase("exit")==0) break;
		        			authors.add(s);
		        	    }
		        		book.setAuthors(authors);
		                int option4=JOptionPane.showConfirmDialog(null, "Do you want to add content for the book?");
		        		if(option4==JOptionPane.YES_OPTION)
		        		{
		        			book.setContentLength(JOptionPane.showInputDialog(null,"Please input the book's content"));
		        		}
		        		int k=0;
		        		for(int i=0;i<itemsInStoreBook.size();i++)
		        		{
		        			if(itemsInStoreBook.get(i).getTitle().compareToIgnoreCase(book.getTitle())==0)
		        			{
		        			if(itemsInStoreBook.get(i).getCategory().compareToIgnoreCase(book.getCategory())==0)
		        			{
		        			
		        			if(itemsInStoreBook.get(i).getCost()==book.getCost())
		        			{
		        			
		        				if(authors.size()==itemsInStoreBook.get(i).getAuthors().size())
		        				{
		        					
		        			     for(int g=0;g<authors.size();g++)
		        			     {
		        			    	 int f=0;
		        			    	 for(int j=0;j<authors.size();j++)
		        			    	 {
		        			    		 
		        			    	 if(authors.get(g).compareToIgnoreCase(itemsInStoreBook.get(i).getAuthors().get(j))==0)
		        			    	 {
		        			    		 f++;
		        			    	 }
		        			    	 else break;
		        			    	 }
		        			    	 if (f==authors.size())
		        			    	 {
		        			    		 k=1;
		        			    		 break;
		        			    	 }
		        			     }
		        				}
		        				if(k==0)
		        				{
		        				if((book.getContentLength()==null)&&(itemsInStoreBook.get(i).getContentLength()!=null)) k=1;
		        				if(book.getContentLength()!=null)
		        				{
		        					if(book.getContentLength().compareToIgnoreCase(itemsInStoreBook.get(i).getContentLength())!=0) k=1;
		        				}
		        				}
		        					
		        			
		        			}
		        			}
		        			}
		        			if (k==1) break;
		        			    	 
		        		}
		        		if(k==0) 
		        			{
		        			addMedia(book);
		        			}
		        		if(k==1) 
		        			{
		        			JOptionPane.showMessageDialog(null,"The book is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
		        			book.setNbMedia(book.getId()-1);
		        			}
		        		
		        		
		            }
		            break;
		       
		    	 default :break;
		            }
		    		
		    	}
		    	break;
		    	case 1:
		    	{
		    		 String[] option2 = {"0.Remove Dvd","1.Remove Book"};
			         String[] option3 = {"0","1"};
			         int choose1 = JOptionPane.showOptionDialog(null,option2,"Your choice",
						      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
						        null, option3,null);
			         switch(choose1)
			         {
			         case 0:
			         {
			        	 DigitalVideoDisc[] arr = new DigitalVideoDisc[itemsInStoreDvd.size()];
			        	 itemsInStoreDvd.toArray(arr);
			        	 JOptionPane. showMessageDialog(null,arr,"Here's the list of discs",JOptionPane.INFORMATION_MESSAGE);
			     		JList<DigitalVideoDisc> jlist = new JList<DigitalVideoDisc>(arr);
			     		
			     		JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple discs you wanna remove",JOptionPane.PLAIN_MESSAGE);
			     		int[] value = jlist.getSelectedIndices();
			     				for (int i=0;i<value.length;i++)
			     				{
			     					removeMedia(itemsInStoreDvd.get(value[i]));
			     				}
			     		
			        	 
			         }
			         break;
			         case 1:
			         {
			        	Book[] arr = new Book[itemsInStoreBook.size()];
			        	itemsInStoreBook.toArray(arr);
			        	JOptionPane. showMessageDialog(null,arr,"Here's the list of book",JOptionPane.INFORMATION_MESSAGE);
			     		JList<Book> jlist = new JList<Book>(arr);
			     		
			     		JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple books you wanna remove",JOptionPane.PLAIN_MESSAGE);
			     		int[] value = jlist.getSelectedIndices();
			     				for (int i=0;i<value.length;i++)
			     				{
			     					removeMedia(itemsInStoreBook.get(value[i]));
			     				}
			        	
			         }
			         break;
			         default:break;
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
		String[] display = new String[] {"--------------------------------","1. See a Media’s details","2. Add a Media to cart","3. See current cart","0. Back","--------------------------------","Please choose a number: 0-1-2-3"};
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
	    	String title=new String();
	    	title=JOptionPane.showInputDialog("Please enter the title of the media");
	    	searchByMediaTitle(title);
	    }
	    	break;
	    case 2:
	    {
	    	String[] option2 = {"0.Add Dvd","1.Add Book"};
            String[] option3 = {"0","1"};
            int choose1 = JOptionPane.showOptionDialog(null,option2,"Your choice",
				      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
				        null, option3,null);
            switch(choose1)
            {
            case 0:
         
            {
            	DigitalVideoDisc[] a = new DigitalVideoDisc[itemsInStoreDvd.size()];
            	itemsInStoreDvd.toArray(a);
	    	JOptionPane. showMessageDialog(null,a,"Here is the list of dvds in Store",JOptionPane.INFORMATION_MESSAGE);
	    	String title=JOptionPane.showInputDialog("Please enter the title of the disc you wannna add");
	    	int k=0;
			ArrayList<DigitalVideoDisc> nbMatch1=new ArrayList<DigitalVideoDisc>();
			for(int i=0;i<itemsInStoreDvd.size();i++)
			{
				if(itemsInStoreDvd.get(i).isMatch(title))
				{
					nbMatch1.add(itemsInStoreDvd.get(i));
					k++;
				}
			}
			DigitalVideoDisc[] nbMatch = new DigitalVideoDisc[nbMatch1.size()];
			nbMatch1.toArray(nbMatch);
			
			if(k==1)
			{
				anOrder.addMedia(nbMatch[0]);
				JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of Medias in the current cart",JOptionPane.INFORMATION_MESSAGE);
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
						
						anOrder.addMedia(nbMatch[i]);
					}
					JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of DVDs in the current cart",JOptionPane.INFORMATION_MESSAGE);
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
								anOrder.addMedia(nbMatch[value[i]]);
							}
					JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of DVDs in the current cart",JOptionPane.INFORMATION_MESSAGE);
							
				}
				break;
				default:break;
				}
			}
			if(k==0) 
			{
				JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the disc you want ","The disc is not found",JOptionPane.ERROR_MESSAGE);
			}
	    	
	    }
            break;
            case 1:
            {
            	Book[] a = new Book[itemsInStoreBook.size()];
            	itemsInStoreBook.toArray(a);
            	JOptionPane. showMessageDialog(null,a,"Here is the list of books in Store",JOptionPane.INFORMATION_MESSAGE);
    	    	String title=JOptionPane.showInputDialog("Please enter the title of the books you wannna add");
    	    	int k=0;
    			ArrayList<Book> nbMatch1=new ArrayList<Book>();
    			for(int i=0;i<itemsInStoreBook.size();i++)
    			{
    				if(itemsInStoreBook.get(i).isMatch(title))
    				{
    					nbMatch1.add(itemsInStoreBook.get(i));
    					k++;
    				}
    			}
    			Book[] nbMatch = new Book[nbMatch1.size()];
    			nbMatch1.toArray(nbMatch);
    			
    			if(k==1)
    			{
    				anOrder.addMedia(nbMatch[0]);
    				JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of Medias in the current cart",JOptionPane.INFORMATION_MESSAGE);
    			}
    			if(k>1)
    			{
    				JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching books",JOptionPane.INFORMATION_MESSAGE);
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
    						
    						anOrder.addMedia(nbMatch[i]);
    					}
    					JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of Books in the current cart",JOptionPane.INFORMATION_MESSAGE);
    				}
    				break;
    				case 0:
    				{
    					JOptionPane. showMessageDialog(null,nbMatch,"Here's the list of matching books",JOptionPane.INFORMATION_MESSAGE);
    					JList<Book> jlist = new JList<Book>(nbMatch);
    					JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple books you wanna add",JOptionPane.PLAIN_MESSAGE);
    					int[] value = jlist.getSelectedIndices();
    							for (int i=0;i<value.length;i++)
    							{
    								anOrder.addMedia(nbMatch[value[i]]);
    							}
    					JOptionPane. showMessageDialog(null,anOrder.getnbOrder(),"The number of Books in the current cart",JOptionPane.INFORMATION_MESSAGE);
    							
    				}
    				break;
    				default:break;
    				}
    			}
    			if(k==0) 
    			{
    				JOptionPane.showMessageDialog(null,"Sorry,we couldn't find the book you want ","The book is not found",JOptionPane.ERROR_MESSAGE);
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
			Media b= new Media();
		
			int l=0;
		String[] display = new String[] {"--------------------------------","1. Filter Medias in cart","2. Sort Medias in cart","3. Remove Media from cart","4.Get a lucky item from cart","5. Place order","0. Back","--------------------------------","Please choose a number: 0-1-2-3-4-5"};
	    String[] options = new String[] {"0", "1", "2", "3","4","5"};
	    int response = JOptionPane.showOptionDialog(null,display,"Options:",
	      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	        null, options,null);	
	   int q=0;
	  
	    switch(response)
	    {
	    case 0:
	    {
	    	l=1;
	    }
	    break;
	    case 1:
	    {
	    	String[] filter= {"0.Filter Dvd","1.Filter Book"};
	    	String[] option= {"0","1"};
	    	int response1 = JOptionPane.showOptionDialog(null,filter,"Options:",
	    		      JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
	    		        null, option,null);	
	    	switch(response1)
	    	{
	    	case 0:
	    	{
	    		JOptionPane.showMessageDialog(null,anOrder.getDvd(),"Here is the list of Dvd in Cart",JOptionPane.INFORMATION_MESSAGE);
	    	}
	    	break;
	    	case 1:
	    	{
	    		
		    	
	    		JOptionPane.showMessageDialog(null,anOrder.getBook(),"Here is the list of Book in Cart",JOptionPane.INFORMATION_MESSAGE);
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
	    		JOptionPane.showMessageDialog(null,anOrder.getMedia(),"Here is you cart after sorted by Title",JOptionPane.INFORMATION_MESSAGE);
	    	}
	    	break;
	    	case 1:
	    	{
	    		anOrder.sortByCost();
	    		JOptionPane.showMessageDialog(null, anOrder.getMedia(),"Here is you cart after sorted by Cost",JOptionPane.INFORMATION_MESSAGE);
	    	}
	    	break;
	    	default:break;
	    	}
	    	
	    }
	    break;
	    case 3:
	    {
	    	
	    	JOptionPane.showMessageDialog(null, anOrder.getMedia(),"Here is the list of Media currently in cart",JOptionPane.INFORMATION_MESSAGE);
	    	JList<Media> jlist = new JList<Media>(anOrder.getMedia());
			JOptionPane.showMessageDialog(null,jlist,"Please choose one/multiple Medias you wanna remove",JOptionPane.PLAIN_MESSAGE);
			int[] value = jlist.getSelectedIndices();
					for (int i=0;i<value.length;i++)
					{
						anOrder.removeMedia(anOrder.getMedia()[value[i]]);
					}
					
		b=anOrder.getALuckyItem();
	    }
	    break;
	    case 4:
	    {
	    	q=1;
	    	b=anOrder.getALuckyItem();
	    	JOptionPane.showMessageDialog(null,b,"You get a lucky item",JOptionPane.INFORMATION_MESSAGE);
	    }
	   
	    break;
	    case 5:
	    {
	    	if(q==0)
	    	{
	    		b=anOrder.getALuckyItem();
	    	}
	    	JOptionPane.showMessageDialog(null,b,"you get a lucky items",JOptionPane.INFORMATION_MESSAGE);
	    	anOrder.sortByTitle();
	    	JOptionPane.showMessageDialog(null,anOrder.getMedia(),"Total cost "+ anOrder.totalCost(b),JOptionPane.INFORMATION_MESSAGE);
	    	anOrder=new Cart();
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
