package logical;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Insert Valuye of a:  ");
		int a=sc.nextInt();
		
		System.out.println("Insert value of b:  ");
		int b=sc.nextInt();
		System.out.println("Variable Values before swaping:");
		System.out.println("a=  "+a +"b=  "+b);
	    
		//Swaping using Third Variable
		
	//	int c=a;
		  //  a=b;
		  //  b=c;
		    
		 //  System.out.println("Variable values after swapping :  ");
		 //   System.out.println("a=  "+a +"b=  "+b);
		    
		    //Swping using Addition sub
		    
		    // a=a+b;
		    // b=a-b;
		  //  a=a-b;
		   // System.out.println("Variable values after swapping :  ");
		   // System.out.println("a=  "+a +"b=  "+b);
		    
		    // Swapping using Division And multiplication
		    
		    a=a*b;
		    b=a/b;
		    a=a/b;
		    System.out.println("Variable values after swaping :  ");
		    System.out.println("a=  "+a +"b=  "+b);
		    
		    
		    
	}
	

}
