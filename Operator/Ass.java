class Ass
{
	public static void main (String [] args)
	{
		double m,price,totalc;
		m=50;
		price=10;
		totalc=m/price;
		System.out.println("Total Money He Have : "+m);
		System.out.println("Price of one Chocolate : "+price);
		System.out.println("Total No of Chocolate : "+totalc);

		{
			double gf=2;
			System.out.println("Total No of GF : "+gf);
			//double getcho=(double)totalc/gf;
			double getcho=totalc/gf;
			System.out.println("Each GF Get Chocolate : "+getcho);
		}
	}
}