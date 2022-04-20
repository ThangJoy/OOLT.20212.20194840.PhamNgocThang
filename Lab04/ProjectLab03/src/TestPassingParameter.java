
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD,cinderellaDVD);
		System.out.println("JungleDVD title "+ jungleDVD.getTitle());
		System.out.println("CinderellaDVD title "+ cinderellaDVD.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("JungleDVD title "+ jungleDVD.getTitle());
		
	}
	public static void swap(DigitalVideoDisc o1,DigitalVideoDisc o2)
	{
		DigitalVideoDisc tmp = o1;
		o1=o2;
		o2=tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title)
	{
		String oldTitle= dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
