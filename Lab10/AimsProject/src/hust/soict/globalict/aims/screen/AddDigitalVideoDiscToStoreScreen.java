package hust.soict.globalict.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;


public class AddDigitalVideoDiscToStoreScreen extends JFrame {
	Container cp = getContentPane();
	 static Store store;
	public AddDigitalVideoDiscToStoreScreen()
	{
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
	public AddDigitalVideoDiscToStoreScreen(Store store) {
		
		this.store=store;
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		open();
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
		for(int i=0;i<store.getItemsInStoreDvd().size();i++)
		{
			if(store.getItemsInStoreDvd().get(i).getTitle().compareToIgnoreCase(disc.getTitle())==0)
			{
			if(store.getItemsInStoreDvd().get(i).getCategory().compareToIgnoreCase(disc.getCategory())==0)
			{
			
			if(store.getItemsInStoreDvd().get(i).getDirector().compareToIgnoreCase(disc.getDirector())==0)
			{
			if(store.getItemsInStoreDvd().get(i).getLength()==disc.getLength())
			{
				
			if(store.getItemsInStoreDvd().get(i).getCost()==disc.getCost())
			{
				
                k=1;
				break;
			}}}}}
		 }
		if(k==0) store.addMedia(disc);
		if(k==1) 
			{
			JOptionPane.showMessageDialog(null,"The disc is already exist","Please try again",JOptionPane.ERROR_MESSAGE);
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
