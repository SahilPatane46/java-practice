class para_method{
	public static void main(String[] args) {
		System.out.println("Main Start");
		demo(10,20);
		System.out.println("Main Start");
	}
	public static void demo(int a,int b){
		System.out.println("Demo Start");
		int result = a+b;
		System.out.println(result);
		System.out.println("Demo End");
	}
}
