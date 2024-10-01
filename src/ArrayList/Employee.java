package ArrayList;

public class Employee {
    // Fields for Employee
    private String name;
    private int id;
    private String phone;
    private String gender;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, int id, String phone, String gender) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.gender = gender;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Override toString() method to display employee details
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", phone=" + phone + ", gender=" + gender + "]";
    }
}
