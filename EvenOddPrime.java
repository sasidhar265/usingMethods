package usingMethods;

public class EvenOddPrime 
{
	public static boolean check(int n)
	{
		int c=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				c++;
			}
		}
		if (c==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean checkeven(int e)
		{
			if (e%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	public static int checkodd(int o)
	{
		if (o%2!=0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
		public static void main(String[] args) 
		{
			boolean b=check(22);
			boolean e=checkeven(10);
			int o=checkodd(9);
			System.out.println(b);
			System.out.println(e);
			System.out.println(o);
		}
}
