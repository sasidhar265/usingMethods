package usingMethods;

public class TwoMethods {
public static double avg(int[]a)
{
	int s=0,c=0,avg=0;
	for(int i=0;i<a.length;i++)
	{
		s=s+a[i];
		c++;
		avg=s/c;
	}
	//System.out.println(avg);
	return avg;
}
public static double avg(double[]b)
{
	double s1=0;
	double c1=0,avg1=0;
	for (int i=0;i<b.length;i++)
	{
		s1=s1+b[i];
		c1++;
		avg1=s1/c1;
	}
	//System.out.println(avg1);
	return avg1;
}
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7,8,9,10};
		
		double[]av= {2.5,3.5,4.5,5.5};
		
		System.out.println(avg(a));
		System.out.println(avg(av));
	}
}
