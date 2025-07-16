-lass p5
{
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println(test());
		System.out.println(demo());
		System.out.println("Main Ends");
	}
	static int a = test();
	static{
		int a = 100;
		System.out.println("Static block of p5");
		System.out.println(a);
	}
	public static int test()
	{
		System.out.println("Test() of p5");
		return 200;
	}
	static int b = 100+demo();
	public static int demo()
	{
		System.out.println(a);
		System.out.println("Demo() of p5");
		return 400;
	}
	static{
		a = 900;
		System.out.println("Static block of p5");
	}
}