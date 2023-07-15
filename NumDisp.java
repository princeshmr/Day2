import java.util.Scanner;
class NumDisp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String num=scan.nextLine();
		char ar[]=num.toCharArray();
		if (ar.length==1)
		{
			System.out.println("Unit");
		}
		else if (ar.length==2)
		{
			System.out.println("ten");
		}
		else if (ar.length==3)
		{
			System.out.println("hundred");
		}
		else{
		    System.out.println("Thousand");
		}
	}
}
