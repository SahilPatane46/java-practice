class CollegeDriver{
	public static void main(String[] args)
	{
		System.out.println("College Details");
		College clg = new College();

		clg.setcollegename("DGCC");
		clg.setaddress("SATARA");
		clg.settstudent(1000);
		
		System.out.println("College Name : "+clg.getcollegename());
		System.out.println("Address : "+clg.getaddress());
		System.out.println("Total Student : "+clg.gettstudent());
	}
}