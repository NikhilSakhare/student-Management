package logical;

public class find_sumOf_Elements_in_Array {
	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		int sum=0;
		
		/*
		 * for(int i=0; i<=a.length-1;i++) //a.lenth =5 { sum=sum+a[i]; }
		 */
		//Enhanced for loop
		
		for(int value:a)
		{
			sum=sum+value;
		}
		
		
		System.out.println("sum of array elements  "+sum);
	}

}
