import java.util.Scanner;
class PalindromeNum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int count=0;
		for (int si=0,ei=s.length()-1;si<ei ;si++,ei-- )
		{
			if (s.charAt(si)==s.charAt(ei))
			{
			}
			else
			{
				count++;
				break;
			}
		}
		if (count==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not A Palindrome");
		}
	}
}
