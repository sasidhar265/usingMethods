package usingMethods;
import java.util.*;
public class ArrayCasesPro7
{
	public static double average(int[]a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum/a.length;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int leastUniqueNumber(int[] a) {
		int v=a[0];
		return v;
	}
	
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=obj.nextInt();
		int []arr=new int[size];
		System.out.println("enter array elements");
		for (int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		while(true)
		{
		System.out.println("Enter 1 to print");
		System.out.println("Enter 2 to find avergae");
		System.out.println("Enter 3 to lun");
		int opt=obj.nextInt();
		switch(opt) {
		case 1:print(arr);break;
		case 2:System.out.println(average(arr));break;
		case 3:System.out.println(leastUniqueNumber(arr));
		break;
		default: System.out.println("Wrong Input");
		}
		}
	}
}
