
public class Manager extends Employee {
	private double bonus;
	public int depid;
	
	 
	public Manager() {
		
	}
	public Manager(String name,double salary,double bonus,int depid) {
		super();
		this.bonus=bonus;
		this.depid=depid;
		
	}
	public String toString() {
		return super.toString()+" "+bonus;
	}
	public void calsalary() {
	
		System.out.println("Manager Salary="+(super.salary+bonus));
	}

}
