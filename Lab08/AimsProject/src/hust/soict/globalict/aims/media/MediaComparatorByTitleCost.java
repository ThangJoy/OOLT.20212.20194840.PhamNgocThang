package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost()  {
		// TODO Auto-generated constructor stub
	}
		public int compare(Media m1,Media m2)
		{
			if (m1.getTitle().compareToIgnoreCase(m2.getTitle())>0) return 1;
			if (m1.getTitle().compareToIgnoreCase(m2.getTitle())==0) 
			{
				if(m1.getCost()>m2.getCost()) return -1;
				if(m1.getCost()==m2.getCost()) return 0;
				return 1;
			}
			return -1;
			
		}
	
			
		
	}


