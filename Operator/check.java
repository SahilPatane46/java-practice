// Check whether the given char is digit or not

class check 
{
	public static void main(String[] args)
	{
		char a ='q';
		String result = (a >= '0' && a <= '9') ? "Digit" : "Not a Digit";
		System.out.println(result);
	}
}