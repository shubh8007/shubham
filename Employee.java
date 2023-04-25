
public class Employee {
	private static int empid;
	private String name;
	protected double salary;
	private int id;
	
	static {
		empid=0;
		
	}
	public Employee() {
		
	}
	public Employee(String name,double salary) {
		empid++;
		id=empid;
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public void calsalary() {
		System.out.println("Salary="+salary);
	}

}
