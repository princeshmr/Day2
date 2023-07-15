import java.util.Scanner;
class SumNum 
{
	public static void main(String[] args) 
	{
		
	    Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		int n=1;
		while (n<=num)
		{
			sum=sum+n;
			n++;
		}
		System.out.println(sum);
	}
}