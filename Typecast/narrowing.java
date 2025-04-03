class narrowing
{
	public static void main(String[] args)
	{
		int a = 100;
		byte b = (byte)a; // Narrowing : have to do explcitly using type cast operator
		System.out.println(a);
		System.out.println(b);
	}
}