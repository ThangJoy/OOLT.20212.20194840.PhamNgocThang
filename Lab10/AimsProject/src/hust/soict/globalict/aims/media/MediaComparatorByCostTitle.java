package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Media m1,Media m2)
	{
		if (m1.getCost()<m2.getCost()) return 1;
		if (m1.getCost()==m2.getCost())
		{
			if (m1.getTitle().compareToIgnoreCase(m2.getTitle())>0) return 1;
			if (m1.getTitle().compareToIgnoreCase(m2.getTitle())==0) return 0;
			return -1;
			
		}
		return -1;
	}

}
