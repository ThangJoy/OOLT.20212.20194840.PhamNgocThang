package hust.soict.globalict.lab01;
	import java.lang.Math;
public class SecondDegreeEquation
{
	public String Resolve(double D,double a,double b,double c)
	{
	
	if (D>0) return "The system has two distinct roots\nx1="+(float)((-b+Math.sqrt(D))/(2*a))+"\n"+"x2="+(float)((-b-Math.sqrt(D))/(2*a));
	if (D==0) return "The system has double root\n"+"x="+(float)(-b/(2*a));
	if (D<0) return "System has no solution";
	return "thg";
	}

}
