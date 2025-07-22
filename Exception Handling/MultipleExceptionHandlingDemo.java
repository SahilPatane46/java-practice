public class MultipleExceptionHandlingDemo{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		demo();
		System.out.println("Main End");
	}
	public static void demo()
	{
			int res = div(10,0);
			System.out.println(res);	
	}
	public static int div(int a, int b)
	{
		try{
			return a/b;	
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("Dinominator cannot be Zero");
			return 0;
		}
	}
}