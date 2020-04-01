import java.util.*;
public class Employee {

	//instance variables for id, name, position, department, company, salary
	private int id;
	private String name;
	private String position;
	private String department;
	private String company;
	private double salary;
	
	//constructor with 4 params, except id and department
	public Employee(String name, String position, String company, double salary) {
		this.name = name;
		this.position = position;
		this.company = company;
		this.salary = salary;
	
	//inside the constructor generate a random number between 1 and 100 as ID number
	Random random = new Random();
		int id = random.nextInt(100) + 1;
		this.id = id;
	
	//inside the constructor provide a message for department "Department not yet assigned";
		this.setDepartment("Department not yet assigned");
	}	
		
	//declare set get Methods for department, position, salary

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	
	//Override all toString method for better explanation about our object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", department=" + department
				+ ", company=" + company + ", salary=" + salary + "]";
	}
	
}


