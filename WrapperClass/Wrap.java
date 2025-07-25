class Wrap{
	public static void main(String[] args) {
		int x = Integer.parseInt("123");
		System.out.println(x);

		Integer x1 = Integer.valueOf("100010101",2);
		int y = x1.intValue();
		System.out.println(y);

		Double x2 = Double.valueOf(56);
		double z = x2.doubleValue();
		System.out.println(z);
	}
}