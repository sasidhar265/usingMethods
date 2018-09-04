package usingMethods;

public class PalindromeArmstrongNumbers 
{
	public static int palindrome(int n)
	{
		int temp,s=0,r;
		temp=n;
		while (n!=0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if (temp==s)
		{
			System.out.println("palindrome : "+temp);
			return n;
		}
		else
		{
			System.out.println("not palindrome : "+temp);
			return n;
		}
	}
	public static int armstrong(int a)
	{
		int l=a;
		int r,s=0;
		while (a!=0)
		{
			r=a%10;
			a=a/10;
			s=s+(r*r*r);
		}
		if (l==s)
		{
			System.out.println("armstrong : "+l);
		}
		else
		{
			System.out.println("not armstrong : "+l);
		}
		return a;
	}
	public static void main(String[] args) 
	{
		palindrome(121);
		armstrong(370);
	}
}
