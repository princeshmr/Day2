import java.util.Scanner;
class ReverseInteger 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt(); //123
		int res=0;
		while (num>0)
		{
			int rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println(res);
	}
}
