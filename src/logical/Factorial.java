package logical;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	public static void simpleFact() {
		while(true) {
		Factorial F=new Factorial();                 
          Scanner sc =new Scanner(System.in);
          
          System.out.println("Enter the number for facttorial:  ");
          int N=sc.nextInt();
          
          
          String x=F.factorial(N).toString();
          int count=0;
          for(int i=x.length()-1;i>0;i--){
                  if(x.charAt(i)=='0')count++;
                  else{
                          i=0;
                  }
          }
          System.out.println("The Factorial of No is"+count);

  }
	}

  BigInteger factorial(int num){
          BigInteger fact = BigInteger.ONE;
          for(int i=1;i<=num;i++)
                  fact = fact.multiply(new BigInteger(i + ""));
          return fact;
  }
		
	
	public static void main(String[] args) {
		simpleFact();
		
	}	
	
	
	}




