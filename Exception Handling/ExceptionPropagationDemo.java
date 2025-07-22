public class ExceptionPropagationDemo{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try{
			demo();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Donominator cannot be 0");
		}
		
		System.out.println("Main End");
	}
	public static void demo()
	{
		// try{
			int res = div(10,0);
			System.out.println(res);
		// }
		// catch(ArithmeticException e)
		// {
		// 	System.out.println("Donominator cannot be 0");
		// }
	}
	public static int div(int a,int b)
	{
		// try
		// 	{
		 	 return a/b;
		//    }
		
		//    catch(ArithmeticException e)
		//    {
		//    	  	// e.printStackTrace();
		//    		System.out.println("Exception Handlled");
		//    		System.out.println("Denominator cannot be Zero");
		//    		return 0;
		//    }
		
		//    catch(RuntimeException e)
		//    {
		//    	  	// e.printStackTrace();
		//    		System.out.println("RuntimeException");
		//    		return 0;
		//    }
		
		//    catch(Throwable e)
		//    {
		//    	  	// e.printStackTrace();
		//    		System.out.println("Throwable");
		//    		return 0;
		//    }
		
	}
}