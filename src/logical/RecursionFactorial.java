package logical;

import java.util.Scanner;

public class RecursionFactorial {

	public static int factoril (int n) {
		if (n==0) {
			return 1;
		}
		else
			return(n*factoril (n-1));
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert your Number:  ");
		int num =sc.nextInt();
		
		int fact =1;
		fact =factoril(num);
		System.out.println("Factorial of  "+num +" is:  "+fact);
		
		
		
	}
	
}
