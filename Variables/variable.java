class variable
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("Main Method Start");
		{   
			System.out.println("Inner Block Start");
			int b=20;
			System.out.println(a);
			System.out.println(b);
			System.out.println("Inner Block End");
		}
		//System.out.println(b); //CTE
		System.out.println("Main Method End");
	}
}