package encapsulation;

public class EncapMain {

	public static void main(String[] args) {
		Person ob=new Person("Vignesh","kumar");
		
		ob.setAge("50");
		ob.setGender("Male");
		ob.setBloodGroup("A+");
		
		String name=ob.getFirstName()+ " "+ ob.getLastName()+","+ob.getAge()+"/"+ob.getGender();
		System.out.println(name);

	}

}
