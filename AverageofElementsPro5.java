package usingMethods;
import java.util.*;
public class AverageofElementsPro5 
{
	public static double average(int[]a)
	{
		double sum=0,avg=0;
		int c=0,i;
		for ( i=0;i<a.length;i++)
		{
			if (a[i]%11==0)
			{
				sum=sum+a[i];
				//System.out.println(a[i]);
				c++;
			}
		}
			avg=sum/c;		
			System.out.println(avg);
		if (avg>=50)
		{
			System.out.println("Greater than 50");
		}
		else
		{
			System.out.println("Not Greater than 50");
		}
		return avg;
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size=obj.nextInt();
		int []a=new int[size];
		System.out.println("Enter the Array Elements");
		for (int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		average(a);
	}
}
