package hust.soict.globalict.lab01;

public class FirstDegreeEquation {
	double a;
	double b;
public String Resolve(double a,double b)
{
	if ((a==0)&&(b!=0)) return "No solution";
	if (a!=0) return "x="+(float)(-b/a);
	return "thg";
}
}