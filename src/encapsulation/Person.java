package encapsulation;

public class Person {
	String firstName, lastName, salutation, gender, ssn, address, zipcode, phone, bloodGroup;
	String age;
   
	public Person(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
    public String getFirstName() {
		return firstName;
	}
    public String getLastName() {
		return lastName;
	}
    public String getSalutation() {
		return salutation;
	}
    public String getGender() {
		return gender;
	}
    public String getSsn() {
		return ssn;
	}
    public String getAddress() {
		return address;
	}
    public String getZipcode() {
		return zipcode;
	}
    public String getPhone() {
		return phone;
	}
    public String getBloodGroup() {
		return bloodGroup;
	}
    public String getAge() {
		return age;
	}
    
    
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
    public void setGender(String gender) {
		this.gender = gender;
	}
    public void setSsn(String ssn) {
		this.ssn = ssn;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
    public void setPhone(String phone) {
		this.phone = phone;
	}
    public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
    public void setAge(String age) {
		this.age = age;
	}
    
}
