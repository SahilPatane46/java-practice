class para1_method{
	public static void main(String[] args) {
		System.out.println("Main Start");
		test(10);
		//test(10.5); //CTE
		test('0'); //auto widening

		demo("Hii",10,20); 
		// demo(10,"Hello",20) //CTE
		//demo("hii",10); //CTE
		System.out.println("Main End");
	}
	public static void test(int a)
	{
		System.out.println("Test Start");
		System.out.println(a);
		System.out.println("Test End");
	}
	public static void demo(String a,int b,int c)
	{
		System.out.println("Demo Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Demo End");
	}
}
