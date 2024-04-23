package task5;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails ob=new EmployeeDetails();
		ob.setEmpId(1);
		ob.setEmpName("Vinod");
		ob.setJobRole("Testing");
		ob.setSalary("50000");
		
		System.out.println(ob.getEmpId());
		System.out.println(ob.getEmpName());
		System.out.println(ob.getJobRole());
		System.out.println(ob.getSalary());

	}

}
