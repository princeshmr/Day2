import java.util.Scanner;
class SingleDigitToWord
{
	static void numToWord(char num[]){
         int len=num.length;
	     String[] digit=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; 
	     if(len==1){
		     System.out.println(digit[num[0]-'0']);
		 }
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String num=scan.nextLine();
		char ar[]=num.toCharArray();
		
		numToWord(ar); 
	}
}
