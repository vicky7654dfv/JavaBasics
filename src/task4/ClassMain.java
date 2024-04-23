package task4;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary ob = new Salary();
        ob.setName("Vignesh");
		ob.setAge("21");
		ob.setDob("07-07-2002");
		ob.setGender("Male");
		ob.setPhnum("9626842300");
		ob.setEmpid("23647");
		ob.setRole("Developer");
		ob.setsalDate("30-12-2024");
		ob.setLpa("3");
		
		Bills obb=new Bills();
		obb.setCusid("74122");
		obb.setBillid("88");
		
		
		System.out.println(ob.name);
		System.out.println(ob.age);
		System.out.println(ob.dob);
		System.out.println(ob.gender);
		System.out.println(ob.phnum);
		System.out.println(ob.empid);
		System.out.println(ob.salDate);
		System.out.println(ob.lpa);
		System.out.println(obb.cusid);
		System.out.println(obb.billid);
		
	}

}
