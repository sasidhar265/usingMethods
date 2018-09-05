package batch18BasicPrograms;

public class PatternPro10 {

	public static void main(String[] args) 
	{
		int k=6;
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
