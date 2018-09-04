package usingMethods;

public class ArthematicOperations 
{
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int subtraction(int a,int b) 
	{
		int s=a-b;
		return s;
	}
	public static int multiplication(int a,int b) 
	{
		int m=a*b;
		return m;
	}
	public static double division(int a,int b)
	{
		double d=a/b;
		return d;
	}
	public static void main(String[] args) 
	{
		int c=add(10,12);
		int s=subtraction(8,6);
		int m=multiplication(5,6);
		double d=division(20,2);
		System.out.println(c);
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
	}
}
