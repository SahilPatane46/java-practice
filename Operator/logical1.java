class logical1
{
	public static void main(String [] args)
	{
		// Consumer Req
		double amount = 2000;
		String color = "White";

		//T-Shirt Features
		double price = 1500;
		String T_color = "White";
		String result = (price<=amount)&&(color==T_color) ? "Buy" : "Not Buy";
		System.out.println(result);
	}
}