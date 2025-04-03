class increment
{
	public static void main(String[] args) {
		int a = 10;
		int b = 20+ a++ + ++a;
		int c = ++b + a++ + b + a++;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(++c);

	}
}