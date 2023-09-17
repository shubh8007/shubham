package Array;

public class ArrayEmp {
	private int empid;
	private String ename;
	private double basicsal;
	private  String city;
	public ArrayEmp() {
		
	}
	public ArrayEmp(int empid,String ename,String city,double basicsal) {
		this.empid=empid;
		this.ename=ename;
		this.basicsal=basicsal;
		this.city=city;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public double getBasicsal() {
		return basicsal;
	}

	public double computeSal() {
		return 0;
		
	}
	public String toString() {
		return "Empid="+empid+" "+"Ename="+ename+" "+"City="+city+" "+"BasicSal="+basicsal;
	}
	

}
