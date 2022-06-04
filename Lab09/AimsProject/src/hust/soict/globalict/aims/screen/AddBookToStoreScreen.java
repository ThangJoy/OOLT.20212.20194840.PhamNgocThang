package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import hust.soict.globalict.aims.media.Book;


import hust.soict.globalict.aims.store.Store;

public class AddBookToStoreScreen extends JFrame {
static Store store;
Container cp = getContentPane();
	public AddBookToStoreScreen() {
		// TODO Auto-generated constructor stub
	}
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		
		return north;
	}
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JButton st = new JButton("View Store");
		st.addActionListener(new ActionListener()
				{
			@Override 
			public void actionPerformed(ActionEvent argo)
			{
				close();
				StoreScreen add = new StoreScreen(store);
			}
				});
		menu.add(st);
		menu.add(new JMenuItem("View Cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	JTextField tfInput,tfOutput;
	public AddBookToStoreScreen(Store store) {
		this.store=store;
		
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		open();
		
		String s=new String();
				        	Book book= new Book();
				        		s=JOptionPane.showInputDialog("Please enter the title of the book");
				        		book.setTitle(s);
				        		s=JOptionPane.showInputDialog("Please enter the category of the book");
				        		book.setCategory(s);
				        		float b;
				        		b=Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost of the book"));
				        		book.setCost(b);
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
				        		for(int i=0;i<store.getItemsInStoreBook().size();i++)
				        		{
				        			if(store.getItemsInStoreBook().get(i).getTitle().compareToIgnoreCase(book.getTitle())==0)
				        			{
				        			if(store.getItemsInStoreBook().get(i).getCategory().compareToIgnoreCase(book.getCategory())==0)
				        			{
				        			
				        			if(store.getItemsInStoreBook().get(i).getCost()==book.getCost())
				        			{
				        			
				        				if(authors.size()==store.getItemsInStoreBook().get(i).getAuthors().size())
				        				{
				        					int f=0;
				        			     for(int g=0;g<authors.size();g++)
				        			     {
				        			    	
				        			    	 for(int j=0;j<authors.size();j++)
				        			    	 {
				        			    		 
				        			    	 if(authors.get(g).compareToIgnoreCase(store.getItemsInStoreBook().get(i).getAuthors().get(j))==0)
				        			    	 {
				        			    		 f++;
				        			    		 break;
				        			    	 }
				        			    	
				        			    	 }
				        			     }
				        			    	 if (f==authors.size())
				        			    	 {
				        			    		 k=1;
				        			    		 break;
				        			    	 }
				        			     
				        				}
				        				if(k==1)
				        				{
				        				if((book.getContentLength()==null)&&(store.getItemsInStoreBook().get(i).getContentLength()!=null)) k=0;
				        				if((book.getContentLength()!=null)&&(store.getItemsInStoreBook().get(i).getContentLength()==null)) k=0;
				        				if((book.getContentLength()!=null)&&(store.getItemsInStoreBook().get(i).getContentLength()!=null))
				        				{
				        					String s1=book.getContentLength();
				        					
				        					String s2=store.getItemsInStoreBook().get(i).getContentLength();
				        		
				        					for(int j=0;j<s1.length();j++)
				        					{
				        						if(Character.isLetter(s1.charAt(j))==false)
				        						{
				        							s1=s1.substring(0,j)+s1.substring(j+1);
				        						}
				        					}
				        					for(int j=0;j<s2.length();j++)
				        					{
				        						if(Character.isLetter(s2.charAt(j))==false)
				        						{
				        							s2=s2.substring(0,j)+s2.substring(j+1);
				        						}
				        					}
				        					
				        					if(s1.compareToIgnoreCase(s2)!=0) k=0;
				        				}
				        				}
				        					
				        			
				        			}
				        			}
				        			}
				        			if (k==1) break;
				        			    	 
				        		}
				        		if(k==0) 
				        			{
				        			store.addMedia(book);
				        			}
				        		if(k==1) 
				        			{
				        			JOptionPane.showMessageDialog(null,"The book is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
				        			book.setNbMedia(book.getId()-1);
				        			}
				        		
				        		
				            }
	public void open()
	{
		setSize(450,350);
		 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		    setLocation(x, y);
		setVisible(true);
		setTitle("Add DVD");
		
	}
	public void close()
	{
		setVisible(false);
		setTitle("");
		setSize(0,0);
	}
}