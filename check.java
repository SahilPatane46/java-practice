class check{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		char c = '*';
		switch(c)
		{
		case '+':{
		System.out.println("Additon is  : "+ (a+b));
		}break;
		case '-':{
		System.out.println("Substraction is : "+ (a-b));
		}break;
		case '*':{
		System.out.println("Multiplication is : "+ (a*b));
		}break;
		case '/':{
		System.out.println("Division is : "+ (a/b));
		}break;
	    default :{
	    System.out.println("default"); 
	    }break;
	    }
    }
}