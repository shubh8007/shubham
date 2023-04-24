package Array;

import java.util.Scanner;

public class ArrayEmpTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		// ArrayEmployee e=new ArrayEmployee();

		System.out.println("Enter the number to store emp imformation..");
		ArrayEmp[] arr = new ArrayEmp[sc.nextInt()];
		int i;
		do {

			System.out.println("ENter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee details");
				for (i = 0; i < arr.length; i++) {
					System.out.println("Enter empid,ename,city,sal");
					ArrayEmp e = new ArrayEmp(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					arr[i] = e;

				}
				break;

			case 2:
				System.out.println("Display Empoyee Details....");
				for (i = 0; i < arr.length; i++) {
					System.out.println(arr[i].toString());

				}
				break;

			case 3:
				System.out.println("Enter empid for set city and name");
				int id = sc.nextInt();

				for (i = 0; i < arr.length; i++) {
					if (arr[i].getEmpid() == id) {
						arr[i].setEname(sc.next());
						arr[i].getEname();
						arr[i].setCity(sc.next());
						arr[i].getCity();

						System.out.println(arr[i]);
					} 
					
					else {
						System.out.println("Enter valid Empid..");
					}

				}
				break;
			default:
				System.out.println("Invalid Choice.....");
			}
		} while (choice < 4);
	}
}