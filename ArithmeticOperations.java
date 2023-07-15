import java.util.Scanner;
class ArithmeticOperations 
{
	static int maximum(int a,int b,int c)
	{
		int max=a;
		if (b>max)
		{
			max=b;
		}
		if (c>max)
		{
			max=c;
		}
		return max;
	}
	static int minimum(int a,int b,int c)
	{
		int min=a;
		if (b<min)
		{
			min=b;
		}
		if (c<min)
		{
			min=c;
		}
		return min;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max=maximum(a,b,c);
		int min=minimum(a,b,c);
		System.out.println(max);
		System.out.println(min);

		int res1=a+b*c;
		System.out.println(res1);
		int res2=c+a/b;
		System.out.println(res2);
		int res3=a%b+c;
		System.out.println(res3);
		int res4=a*b+c;
		System.out.println(res4);
	}
}
