package workshop;

public class Person {
protected String address;

Person(String address){
	this.address = address;
}
}
class Employee extends Person{
	String department;
	Employee(String address, String department) {
        super(address);
        this.department = department;
    }
	void display() {
		 System.out.println("Address: " + address);
	        System.out.println("Department: " + department);
	}
}
class show {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kathmandu", "IT");
        e1.display();
    }
}