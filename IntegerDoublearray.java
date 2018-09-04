package usingMethods;

public class IntegerDoublearray 
{
	public static int array(int[]a)
	{
		int max=a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		return max;
	}
	public static double array(double[]b)
	{
		double max=b[0];
		for (int i=0;i<b.length;i++)
		{
			if (b[i]>max)
			{
				max=b[i];
			}
		}
		System.out.println(max);
		return max;
	}
	public static int maximum(int a,int b)
	{
		if (a>b)
		{
			System.out.println(a);
			return a;
		}
		else
		{
			System.out.println(b);
			return b;
		}
	}
	public static double maximum(double a,double b)
	{
		if (a>b)
		{
			System.out.println(a);
			return a;
		}
		else
		{
			System.out.println(b);
			return b;
		}
	}
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		array(a);
		double[]b= {0.2,0.5,1.5,1.3,1.5};
		array(b);
		maximum(10,20);
		maximum(2.5,5.5);
	}

}
