//5! =1 * 2 * 6 * 24 =120
package logical;

public class Factorial_Number {
	
	public static void main(String[] args) {
		int num=5;
		
		long factorial =1;
		/*
		 * for(int i=1;i<num;i++) { 
		 * factorial=factorial*i; //1 2 6 24 120
		 * 
		 * }
		 */
		
		for(int i= num;i>=1;i--) {
			factorial=factorial*i; //5 20 60 120 120
		}
		System.out.println("Factorial of a Number is : "+factorial);
	}

}
