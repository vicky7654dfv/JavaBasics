package ArrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Employee emp1=new Employee();
		emp1.setName("RanjithKumar");
		emp1.setId(7);
		emp1.setGender("Male");
		emp1.setPhone("9876543210");
		Employee emp2 =new Employee("Rakumar",89,"0987654321","Male");
		Employee emp3=new Employee("Rathika",79,"098764323456","Female");
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee("Ranjana", 4, "987468930","Female"));
		
		for(int i=0;i<employees.size();i++) {Employee
			

	}
		public static ArrayList<Employee> sort(ArrayList<Employee> employees) {
			for(int i=0;i<employees.size();i++) {
				for(int j=i+1;j<employees.size();j++) {
					if(employees.get(i).getId> employees.get(j).getId()) {
						Employee temp=employees.get(i);
						employees.set(i, employees.get(i));
						employees.set(j,temp);
					}
				}
			}
			return employees;
		}
		
		public static ArrayList<Employee> sort(ArrayList<Employee> employees) {
			for(int i=0;i<employees.size();i++) {
				for(int j=i+1;j<employees.size();j++) {
					if(employees.get(i).getName().compareTo( employees.get(j).getId()) {
						Employee temp=employees.get(i);
						employees.set(i, employees.get(i));
						employees.set(j,temp);
					}
				}
			}
			return employees;
		}


}
