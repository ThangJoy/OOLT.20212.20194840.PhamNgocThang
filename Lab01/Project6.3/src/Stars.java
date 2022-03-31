import java.util.Scanner;
public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Nhap n ");
int n = keyboard.nextInt();
int i;int j;int k;int l=1;
for(i=1;i<=n;i++)
{
	for(j=1;j<=n-i;j++) System.out.print(" ");
for(k=1;k<=l;k++) 
	{
	System.out.print("*");

	}l=l+2;
System.out.println("\n");
	}

	}

}
