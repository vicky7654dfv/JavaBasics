package json;

import java.util.ArrayList;

public class WrapperClass {
	String name,id,age;	
	
	public WrapperClass(String name,String id,String age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
    public String getAge() 
    {
		return age;
	}
    public String getId()
    {
		return id;
	}
   
}
