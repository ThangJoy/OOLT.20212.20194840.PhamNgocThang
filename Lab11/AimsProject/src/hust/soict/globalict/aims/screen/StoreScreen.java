package hust.soict.globalict.aims.screen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

import javax.swing.*;
import hust.soict.globalict.aims.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

public class StoreScreen extends JFrame {
	private static Store store;
	Container cp = getContentPane();
	
	
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JButton dvd = new JButton("Add DVD");
		dvd.addActionListener(new ActionListener()
				{
			@Override 
			public void actionPerformed(ActionEvent argo)
			{
				close();
				AddDigitalVideoDiscToStoreScreen add = new AddDigitalVideoDiscToStoreScreen(store);
			}
				});
		JButton cd = new JButton("Add CD");
		cd.addActionListener(new ActionListener()
				{
			@Override 
			public void actionPerformed(ActionEvent argo)
			{
				close();
				AddCompactDiscToStoreScreen add = new AddCompactDiscToStoreScreen(store);
			}
				});
		JButton book = new JButton("Add Book");
		book.addActionListener(new ActionListener()
		{
	@Override 
	public void actionPerformed(ActionEvent argo)
	{
		close();
		AddBookToStoreScreen add = new AddBookToStoreScreen(store);
	}
		});
		smUpdateStore.add(cd);
		smUpdateStore.add(dvd);
		smUpdateStore.add(book);
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View Store"));
		menu.add(new JMenuItem("View Cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View Cart");
		cart.setPreferredSize(new Dimension(100,50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i = 0; i < mediaInStore.size(); i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	
	public StoreScreen(Store store) {
		this.store =  store;
		
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		open();
	}
	int k=0;
	public void open()
	{
		setSize(1024, 768);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
		setVisible(true);
		setTitle("Store");
		
	}
	public void close()
	{
		setVisible(false);
		setTitle("");
		setSize(0,0);
	}
	public static void main(String[] argc)
	{
		Store myStore = new Store();
		
		DigitalVideoDisc dvd1= new DigitalVideoDisc("Harry","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		myStore.addMedia(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd3);
		DigitalVideoDisc dvd4= new DigitalVideoDisc("Harry Potter and the Half Blood Prince","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd4);
		DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Cup of Fire","Animation","Roger Allers",87,19.95f);
		myStore.addMedia(dvd5);
		Book book1 = new Book ("Harry","Noval",87f);
		
		myStore.addMedia(book1);
		String[] author = {"A","B","C"};
		List<String> authors= new ArrayList<String>(Arrays.asList(author));
		Book book2 = new Book ("Harry","Noval",88f,authors," I can can the can, but the can cannot can me");
		//System.out.println(book2.contentLength());
		myStore.addMedia(book2);
Book book3 = new Book ("Harry 1","Noval",87f,"i can");
		
		myStore.addMedia(book3);
Book book4 = new Book ("Harry 0","Noval",87f);
		
		myStore.addMedia(book4);
		Collection<Media> collection = new ArrayList<Media>();
		DigitalVideoDisc dvd6= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		collection.add(dvd6);
		
		
		
		DigitalVideoDisc dvd8= new DigitalVideoDisc("Aladin","Animation",18.99f);
		collection.add(dvd8);
		
		CompactDisc cd1= new CompactDisc("IBM Symphony","25",10);
		Track track1 = new Track("Hello",5);
		Track track2 = new Track("Hello1",8);
	    cd1.addTrack(track1);
	    cd1.addTrack(track2);
	    
	
		//collection.add(cd1);
		DigitalVideoDisc dvd9= new DigitalVideoDisc("Warm Up","Animation","Q",3,3f);
		//collection.add(dvd4);
	
		DigitalVideoDisc dvd10= new DigitalVideoDisc("Scale","Animation","Q",4,3f);
		//collection.add(dvd5);
		
		DigitalVideoDisc dvd11= new DigitalVideoDisc("Introduction","Animation","Q",6,3f);
		//collection.add(dvd6);
		 myStore.addMedia(dvd6);
		 
		 myStore.addMedia(dvd8);
		
	    myStore.addMedia(cd1);
		new StoreScreen(myStore);
	}
}
