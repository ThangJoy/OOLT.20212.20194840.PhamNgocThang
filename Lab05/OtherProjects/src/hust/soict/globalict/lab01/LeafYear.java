package hust.soict.globalict.lab01;
import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
String[] a = {"January","February","March","April","May","June","July","August","September","October","November","December"};
String[] b = {"Jan.","Feb.","Mar.","Apr.","May","Jun.","Jul.","Aug.","Sept.","Oct.","Nov.","Dec."};
String[] c = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
String[] d = {"1","2","3","4","5","6","7","8","9","10","11","12"};
int [] e = {31,28,31,30,31,30,31,31,30,31,30,31};
int i;
while(true)
{
	
System.out.println("Nhap thang ");
String n = keyboard.nextLine();
int h=0;
boolean k=false;
for (i=0;i<12;i++)
{
   k = n.equals(a[i]);
   
   
   if (k) 
   {
	   h=1;
	   break;
   }
   k = n.equals(b[i]);
   
   if (k) 
   {
	   h=1;
	   break;
   }
   
   k = n.equals(c[i]);
   if (k) 
   {
	   h=1;
	   break;
   }
   
   k = n.equals(d[i]);
   if (k) 
   {
	   h=1;
	   break;
   }
}
if (h==1) break;
}
int y;
while (true)
{
	System.out.println("Nhap nam ");
	y = keyboard.nextInt();
	if (y>=1000) break;
	
}
if (i!=1) System.out.println(e[i] +" ngay");
else
{
	if (y %100 == 0)
	{
		if (y%400 ==0) System.out.println( "29 ngay");else System.out.println("28 ngay");
	} else 
	{
		if (y%4 ==0) System.out.println(29 + "ngay");else System.out.println(28 + "ngay");
	}
}

	}

}
