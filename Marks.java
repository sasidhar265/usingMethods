package usingMethods;
import java.util.*;
public class Marks 
{
	public static int marks(int mark)
	{
		if (mark>100)
		{
			System.out.println("Invalid Input");
		}
		if (mark>=90 && mark<=100)
		{
			System.out.println("Genious");
		}
		if (mark>=80 && mark<90)
		{
			System.out.println("Brilliant");
		}
		if (mark>=70 && mark<80)
		{
			System.out.println("Celver");
		}
		if (mark>=60 && mark<70)
		{
			System.out.println("Average");
		}
		if (mark>=50 && mark<60)
		{
			System.out.println("Below Average");
		}
		if (mark>=40 && mark<50)
		{
			System.out.println("Poor");
		}
		if (mark>=0 && mark<40)
		{
			System.out.println("Dump");
		}
		return mark;
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Examination Reports");
		System.out.println("Enter marks");
		int mark=obj.nextInt();
		int marks=marks(mark);
		}
}