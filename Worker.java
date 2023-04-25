
public class Worker extends Employee {
private int hrs;
private int rateperhr;


public Worker() {
	
}
public Worker(String name,double salary,int hrs,int rateperhr) {
	super();
	this.hrs=hrs;
	this.rateperhr=rateperhr;
	
}
public String toString() {
	return super.toString()+" "+hrs+" "+rateperhr;
}
public void calsalary() {
	System.out.println("Worker salary="+(super.salary+(hrs*rateperhr)));
}

}
