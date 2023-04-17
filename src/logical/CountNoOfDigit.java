package logical;

import java.util.Scanner;

public class CountNoOfDigit {
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Insert Your Number");
		long num= sc.nextLong();
		
		int count=0;
		
		int EvenCount=0;
		int OddCount=0;
		
		
		while(num>0) {
			num=num/10;  
			count++;
		}
		System.out.println("Num of Digit:  "+count);
		
		
	}
	}
}
