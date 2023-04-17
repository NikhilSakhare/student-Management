package logical;

import java.util.Scanner;


 
public class TotalCount_EvenOdd {
	
		

	public static void totalcount() {
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Insert Your Number");
			long num= sc.nextLong();
			
						
			int EvenCount=0;
			int OddCount=0;
			
			
			while(num>0) {
				long rem= (int)num%10;  
				if(rem%2==0)  {
					EvenCount++;
				}else {
					OddCount++;
					
				}
				num=num/10;
			}
			System.out.println("Even Num of count:  "+EvenCount);
			System.out.println("Odd No Count " +OddCount);
		
	}

	}
}
