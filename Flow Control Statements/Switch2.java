class Switch2
{
	public static void main(String[] args) {
		switch("Hi"){
		case "Hi":
			System.out.println("10");
		}break;
		case "Hi":
		{
			System.out.println(40); //CTE
		}break;
		case "Hello":
		{
			System.out.println(20);
		}break;
		case "Bye":
		{
			System.out.println(30);
		}break;
		default:{
		System.out.println("default");
		}break;
	}
}