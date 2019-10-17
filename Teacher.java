class Teacher
{
	public String name;
	public String id;
	public String phoneNumber;
	public String email;
	public String department;
	public String position;
	public String currentStatus;
	public String notice;
	public String password;
	
	public Teacher(String name,String id,String phoneNumber,String email,String department,String position,String password)
	{
		this.name=name;
		this.id=id;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.department=department;
		this.position=position;
		this.status="Not Available";
		this.notice=null;
		this.password=password;
	}
	public void showTeacher()
	{
		System.out.Println("Teacher Name :"+this.name);
	}
	public setStatus(String date,String present)
	{
		
	}
	
	public setNotice(String date,String notice)
	{
		
	}
	public changePassword(String oldpass,String newpass)
	{
		
	}
	
	public void setConsulting()
	{
		
	}
}