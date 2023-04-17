//Natural Number >1
//Which has only 2 factors 1 and itself

//19=>1 and 19=>prime number
//28 => 1,2,3,4,7,14,28 => not a prime number
package logical;

public class Check_Given_Number_is_Prime_Or_Not {

	public static void main(String[] args) {
		
		int num=3;
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)	
				count++;
				
			}
			if (count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println("Not Palidrome Number");
		}
	}

}
