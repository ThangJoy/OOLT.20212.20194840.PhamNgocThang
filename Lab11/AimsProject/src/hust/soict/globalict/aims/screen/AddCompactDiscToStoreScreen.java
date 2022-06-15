package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.Store;

public class AddCompactDiscToStoreScreen  extends JFrame
{
static Store store;
Container cp = getContentPane();
	public AddCompactDiscToStoreScreen() 
	{
		
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
	public AddCompactDiscToStoreScreen(Store store) {
		this.store=store;
		
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		open();
	String s=new String();
	CompactDisc disc= new CompactDisc();
	s=JOptionPane.showInputDialog("Please enter the title of the Cd");
	disc.setTitle(s);

	s=JOptionPane.showInputDialog("Please enter the artist of the Cd");
	disc.setArtist(s);
	float b;
	b=Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost of the Cd"));
	disc.setCost(b);
	int a;
	ArrayList<Track> tracks = new ArrayList<Track>();
	while(true)
	{
    Track track = new Track();
		
		s=JOptionPane.showInputDialog("Please enter the title for track No."+(disc.getNbTrack()+1)+ "(type Exit to leave)");
		if (s.compareToIgnoreCase("exit")==0) break;
		track.setTitle(s);
		a=Integer.parseInt(JOptionPane.showInputDialog("Please enter the length for track No."+(disc.getNbTrack()+1)+ "(type -1 to leave)"));
		if(a==-1) break;
		track.setLength(a);
		disc.setTracks(tracks);
	    disc.addTrack(track);
		
	
    }
	
	disc.setTracks(tracks);
	
	int k=0;
	for(int i=0;i<store.getItemsInStoreCd().size();i++)
	{
		if(store.getItemsInStoreCd().get(i).getTitle().compareToIgnoreCase(disc.getTitle())==0)
		{
		
		
		if(store.getItemsInStoreCd().get(i).getArtist().compareToIgnoreCase(disc.getArtist())==0)
		{
		if(store.getItemsInStoreCd().get(i).getLength()==disc.getLength())
		{
			
		if(store.getItemsInStoreCd().get(i).getCost()==disc.getCost())
		{
			
		if(store.getItemsInStoreCd().get(i).getTracks().size()==disc.getTracks().size())
		{
			int f=0;
           for(int j=0;j<store.getItemsInStoreCd().get(i).getTracks().size();j++)
          {
        	  
           for(int e=0;e<disc.getTracks().size();e++)
           {
        	   
        	   if (store.getItemsInStoreCd().get(i).getTracks().get(j).getTitle().compareToIgnoreCase(disc.getTracks().get(e).getTitle())==0)
        	   {
        		   if(store.getItemsInStoreCd().get(i).getTracks().get(j).getLength()==disc.getTracks().get(e).getLength())
        		   {
        			   f++;
        			   break;
        		   }
        	   }
           }
          }
          
           if(f==disc.getTracks().size())
           {
        	   k=1;
        	   break;
           }
          }
		}}}}
		if (k==1) break;
	 }
	if(k==0) 
	{
	store.addMedia(disc);
	}
if(k==1) 
	{
	JOptionPane.showMessageDialog(null,"The cd is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
	disc.setNbMedia(disc.getId()-1);
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

	