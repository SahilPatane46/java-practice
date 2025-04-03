class compound_assignment
{
	public static void main(String[] args)
	{
		double amt = 5000;
		System.out.println("Account Balance : "+amt);
		//deposit = 1200;
		amt+=1200;
		System.out.println("Deposit Amount : "+amt);
		//debited = 5000;
		amt-=5000;
		System.out.println("Debited Amount : "+amt);
		//bonus = 3500;
		amt+=3500;
		System.out.println("Deposit Amount : "+amt);
		//Deduction 2 %
		double ded = amt*2/100;
		System.out.println("2 % Deduction Amount : "+ded);
		amt=amt-ded;
		System.out.println("Deduction 2 %  from Account : "+amt);

	}
}