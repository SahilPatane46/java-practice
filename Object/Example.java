class Sahil{
	int x ;
	private static int y;
	void f1() {
		y=25
	}
	void f2() {
		System.out.println(y);
		
	}
	void f3() {
		y=45;
	}
}
class Example{
	public static void main(String [] args) {
		Sahil s1 = new Sahil();
		Sahil s2 = new Sahil();
		s1.f1();
		s2.f3();
		s1.f2 ();
	}
}