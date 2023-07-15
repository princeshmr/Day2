import java.util.Scanner;
class ReverseIntForLoop 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String num=scan.nextLine();
		char ar[]=num.toCharArray();
		String t="";
		for (int i=0;i<ar.length ;i++ )
		{ 
                   t=ar[i]+t;
		}
		System.out.println(t);
	}
}
