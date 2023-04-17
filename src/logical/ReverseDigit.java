package logical;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your number");
		long original_num = sc.nextLong();
		long num=original_num;
		
		System.out.println("Original Number: "+original_num);
		// Logic for reverese the number
		long rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10; 
		}
		
		
		System.out.println("Reversed Number: "+rev);
		
		//logic for checking palindrome number
		if(original_num == rev) {
			System.out.println(original_num+ " is the Palindrome number");
		}
		
		else {
			System.out.println(original_num+ " is not the Palindrome number");

		}
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("reversed Number: "+rev);

	}

}}