class Ifelseif2
{
	public static void main(String[] args) {
		char ch = 'a';
		if(ch >='0' && ch <='9')
		{
			System.out.println(ch + " is a Digit");
		} 
		else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println(ch + " is an Alphabet");
		}
		else
		{
			System.out.println(ch + " is a Special Character");
		}
	}
}