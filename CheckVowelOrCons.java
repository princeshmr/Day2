import java.util.Scanner;
class CheckVowelOrCons 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		char ch2=Character.toUpperCase(ch);
		switch (ch2)
		{
		   case 'A':
		       System.out.println("Vowel");
		       break;
                   case 'E':
		       System.out.println("Vowel");
		       break;
		   case 'I':
		       System.out.println("Vowel");
		       break;
		   case 'O':
		       System.out.println("Vowel");
		       break;
		   case 'U':
		       System.out.println("Vowel");
		       break;
		   default:
		       System.out.println("Consonant");
		}
	}
}
