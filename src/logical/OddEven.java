package logical;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Insert Your No.  :  ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + "  is Even No");
		}
		else {
			System.out.println(num+"  Is odd no.");
		}
		
				
		}
		
	}

}
