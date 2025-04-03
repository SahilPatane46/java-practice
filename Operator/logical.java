import java.util.Scanner;

class logical
{
	public static void main(String[] args)
	{
		int a =60;
		/*Scanner s =new Scanner(System.in);
		System.out.print("Enter No : ");	
		int a = s.nextInt();*/
		String result = a==0 ? "The No. is Zero": (a%2==0)&&(a>0) ? "Even Number" : "Odd Number";
		System.out.println(result);
	}
}