class mix
{
	public static void main(String[] args) {
		int a = 20;
		int b = ++a + 5 + a-- + ++a ;
		int c = a++ + b-- + --a + b++;
		int d = --c + b++ + a + a++;
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(c++);
		System.out.println(--d);
	}
}