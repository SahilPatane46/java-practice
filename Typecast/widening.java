class widening
{
	public static void main(String[] args)
	{
		byte a = 10;
		int b = (int) a; // explicit widening

		System.out.println(a);
		System.out.println(b);

		int c = 100;
		double d = c; // implicit widening

		System.out.println(c);
		System.out.println(d);

		char e = '$';
		int f = e; // implicit widening

		System.out.println(e);
		System.out.println("Astrisk of "+e+" is "+f);

	}
}