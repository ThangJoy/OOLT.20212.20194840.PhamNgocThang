import java.util.Scanner;
public class  AddArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] a; a=new int[100];
		int[] b = new int [100];
		int i,k=0;
		System.out.println("Nhap n");
		int n = keyboard.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=keyboard.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=keyboard.nextInt();
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+b[i]+ " ");
	

	}

}