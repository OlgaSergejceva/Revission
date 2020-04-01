
public class Company {

	public static void main(String[] args) {
		
	//declare and create 3 objects(as a employee1,2,3) and set params
	Employee employee1 = new Employee("Alise", "accountant", "ABC", 1100);
	Employee employee2 = new Employee("Janis", "enginner", "DEF", 1500);
	Employee employee3 = new Employee("Arturs", "junior designer", "GHI", 1000);
	
	double salary1 = employee1.getSalary();
    double salary2 = employee2.getSalary();
    double salary3 = employee3.getSalary();
		
    //set department for your employees
	employee1.setDepartment("Finance");
    employee2.setDepartment("Main");
    employee3.setDepartment("Marketing");
	
    //System.out.println("After 1 year inside the company:");
    System.out.println("After 1 year inside the company: ");
    
    //set to change your employee promotion from position to salary
    employee1.setPosition("senior accountant");
    employee1.setSalary(1350);
    
    employee2.setPosition("chief engineer");
    employee2.setSalary(2100);
    
    employee3.setPosition("designer");
    employee3.setSalary(1255);
    
    //calculate employees salary difference after 1 year
    
    double newSalary1 = employee1.getSalary();
    double newSalary2 = employee2.getSalary();
    double newSalary3 = employee3.getSalary();

    double difference1 = newSalary1 - salary1;
    double difference2 = newSalary2 - salary2;
    double difference3 = newSalary3 - salary3;
    
    //out print your employees
    System.out.println(employee1);
    System.out.println(employee2);
    System.out.println(employee3);

    System.out.println("Employee with an id: " + employee1.getId() + " salary increase is " + difference1 + " EUR");
    System.out.println("Employee with an id: " + employee2.getId() + " salary increase is " + difference2 + " EUR");
    System.out.println("Employee with an id: " + employee3.getId() + " salary increase is " + difference3 + " EUR");
	}

}
