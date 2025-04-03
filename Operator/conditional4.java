class conditional4
{
	public static void main(String[] args)
	{
		int a,b,c;
		a=100;
		b=200;
		c=300;
		 //int result = a > b ? a : b;
		 //int result1 = result > c ? result : c;

		int result = a > b  ? (b>c ? b : c)  : (a>c ? a : c);

		 System.out.println(result);
	}
}