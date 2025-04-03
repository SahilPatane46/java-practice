class Ifelseif1
{
	public static void main(String[] args) {
		int w = 57;
		if (w>=40 && w<=50)
		{
			System.out.println("Group A");			
		}
		else if(w>=51 && w<=60)
		{
			System.out.println("Group B");
		}
		else if(w>=51 && w<=70)
		{
			System.out.println("Group C");
		}
		else if(w>=71 && w<=80)
		{
			System.out.println("Group D");
		}
		else if(w>=81)
		{
			System.out.println("Group E");
		}
		else
		{
			System.out.println("Not Quaified");
		}
	}
}