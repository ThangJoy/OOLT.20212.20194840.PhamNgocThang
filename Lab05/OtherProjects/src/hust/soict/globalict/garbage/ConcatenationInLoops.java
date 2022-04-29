package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s="";
		for(int i=0;i<65536;i++)
		{
			s+=r.nextInt(2);
		}
		System.out.println(System.currentTimeMillis()-start);
		Random r1 = new Random(123);
		long start1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<65536;i++)
		{
			sb.append(r1.nextInt(2));
		}
		s=sb.toString();
		System.out.println(System.currentTimeMillis()-start1);
	}

}
