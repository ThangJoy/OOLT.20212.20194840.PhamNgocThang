import java.util.Scanner;
import java.util.Arrays;
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] a; a=new int[100];
		int i,k=0;
		System.out.println("Nhap n");
		int n = keyboard.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=keyboard.nextInt();
			k+=a[i];
		}
		Arrays.sort(a);
		System.out.println(k);
		for( int x : a)
		{
			if (x!=0)
		
		System.out.print(x+" ");
		}

	}

}
