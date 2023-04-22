import java.util.Scanner;

//wap for prime no checking
public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int f=1;
		
		for(int i=2; i<n; i++) {
			
		
			if(n%i==0)
		
			{
				f=0;
			}
		
		}
		if(f==0)
			System.out.println("not prime number");
		else 
			System.out.println("prime number");
		
		
		
		
		

	}

}
