import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1.Hire Manager,2.hire Worker,3.Display all,4.update basic salary");
Scanner sc= new Scanner(System.in);

	int ch;
	int index=0;
	Employee[]  e1=new Employee[5];
	do {
		System.out.println("Enter choice=");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1: System.out.println("Name Salary Bonus depid");
		if(index<e1.length) {
		Manager mgr=new Manager(sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextInt());
			
		e1[index]=mgr;
		index++;
		
		}
		else {
			System.out.println("Array Full");
		}
		break;
		case 2:System.out.println("Empid Name Salary hrs rateperhr");
		if(index<e1.length) {
			Worker w=new Worker(sc.next(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
			
		}
		else {
		System.out.println("Array Full");
		}
		break;
		
	case 3:System.out.println("Display All");
	for(Employee e:e1) {
		if(e!=null)
			System.out.println(e);
	}
	case 4:System.out.println("Salary to be updated....");
	
		}
	}while(ch<=4);

	}

}
