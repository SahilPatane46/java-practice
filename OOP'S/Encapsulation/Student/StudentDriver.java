class StudentDriver{
	public static void main(String[]args)
	{
		System.out.println("Student Details");

		Student student = new Student();
		student.setsid(101);
		student.setname("Manga");
		System.out.println("Sid : "+ student.getsid());
		System.out.println("Name : "+ student.getname()); 
	}
}