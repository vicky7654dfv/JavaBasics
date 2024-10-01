package ArrayList;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating Employee objects
        Employee emp1 = new Employee();
        emp1.setName("RanjithKumar");
        emp1.setId(7);
        emp1.setGender("Male");
        emp1.setPhone("9876543210");

        Employee emp2 = new Employee("Rakumar", 89, "0987654321", "Male");
        Employee emp3 = new Employee("Rathika", 79, "098764323456", "Female");

        // Adding employees to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(new Employee("Ranjana", 4, "987468930", "Female"));

        // Printing the list of employees
        System.out.println("Employees before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sorting employees by ID
        ArrayList<Employee> sortedById = sortById(employees);
        System.out.println("\nEmployees sorted by ID:");
        for (Employee employee : sortedById) {
            System.out.println(employee);
        }

        // Sorting employees by Name
        ArrayList<Employee> sortedByName = sortByName(employees);
        System.out.println("\nEmployees sorted by Name:");
        for (Employee employee : sortedByName) {
            System.out.println(employee);
        }
    }

    // Method to sort employees by ID
    public static ArrayList<Employee> sortById(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getId() > employees.get(j).getId()) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
        return employees;
    }

    // Method to sort employees by Name
    public static ArrayList<Employee> sortByName(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getName().compareTo(employees.get(j).getName()) > 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
        return employees;
    }
}
