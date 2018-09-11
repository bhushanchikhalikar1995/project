package firstspring;

public class Student {

	private String name;
	private int no;
	
	public  String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public  int getNo()
	{
		return no;
	}
	
	public void setNo(int no)
	{
		this.no=no;
	}
	
	
	
	void displayInfo()
	{
		System.out.println("Hello:"+name+" "+"No: "+no );
	}
	
	
	
}
