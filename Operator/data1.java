class data1
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		//byte c = a+b; // error: incompatible types: possible lossy conversion from int to byte
		int c = a+b;
		System.out.println(c);
	}
}