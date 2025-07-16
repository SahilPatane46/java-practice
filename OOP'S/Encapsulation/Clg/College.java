class College{
	//State
	private String collegename;
	private String address;
	private int tstudent;

	//Behaviour
	//Getter method to get collegename
	public String getcollegename()
	{
		return collegename;
	}

	//Getter method to get address
	public String getaddress()
	{
		return address;
	}

	//Getter method to get total Student
	public int gettstudent()
	{
		return tstudent;
	}

	//Setter method to set collegename
	public void setcollegename(String collegename)
	{
		this.collegename=collegename;
	}

	//Setter method to set address
	public void setaddress(String address)
	{
		this.address=address;
	}

	//Setter method to set tstudent
	public void settstudent(int tstudent)
	{
		this.tstudent=tstudent;
	}
}