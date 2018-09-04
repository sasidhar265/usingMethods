package usingMethods;
import java.util.*;
public class WAPPro2 
{
	private static void readanumber(int a)
	{
		if (a>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
	private static void greaterthan(int a)
	{
		if (a>1000)
		{
			System.out.println("Greater than 1000");
		}
		else
		{
			System.out.println("Not Greater than 1000");
		}
	}
	private static void Tnumber(int a)
	{
		if (a%10==3)
		{
			System.out.println("T-Number");
		}
		else
		{
			System.out.println("Not a T-Number");
		}
	}
	private static void divisible(int a)
	{
		if (a%16==0)
		{
		System.out.println("Divisible by 16");
		}
		else
		{
			System.out.println("Not Divisible by 16");
		}
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=obj.nextInt();
		readanumber(a);
		greaterthan(a);
		Tnumber(a);
		divisible(a);
	}
}
