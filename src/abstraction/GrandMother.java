package abstraction;

public abstract class GrandMother {
	String name;
	
	public GrandMother(String name)
	{
		this.name=name;
	}
	//Normal method
	private void setName(String name) {
		this.name=name;
	}
	//normal method
	String getName() {
		return name;
	}
	//abstract method
	abstract String getAge(String dob);

}
