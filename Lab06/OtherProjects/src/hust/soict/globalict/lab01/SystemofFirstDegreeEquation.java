package hust.soict.globalict.lab01;
public class SystemofFirstDegreeEquation {
	double a,a1,a2,b,b1,b2;
	
public String Resolve(double D,double D1,double D2)
{
	
	
	if (D!=0) return "The system has unique solution\nx="+(float)(D1/D)+"y="+(float)(D2/D);
	if (D==0) if ((D1==0)&&(D2==0)) return "The system has infinitely many solution";
	return "No Solution";
}

}