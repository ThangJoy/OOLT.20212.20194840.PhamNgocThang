
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		Wrapper o1=new Wrapper(jungleDVD);
		Wrapper o2=new Wrapper(cinderellaDVD);
		
		swap(o1,o2);
		System.out.println("JungleDVD title "+ o1.a.getTitle());
		System.out.println("CinderellaDVD title "+ o2.a.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("JungleDVD title "+ jungleDVD.getTitle());
		
	}
	public static void swap(Wrapper o1,Wrapper o2)
	{
		DigitalVideoDisc tmp = o1.a;
		o1.a=o2.a;
		o2.a=tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title)
	{
		String oldTitle= dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
class Wrapper
{
	DigitalVideoDisc a;
	Wrapper(DigitalVideoDisc a)
	{
		this.a=a;
	}
}
