package logical;

public class Evan_odd_from_Array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		//Extracting evan numbers
		
		System.out.println("Even Numbers in array.....");
		/*for(int i=0;i<a.length;i++)
		{

		if(a[i]%2==0)
			System.out.println(a[i]);
		
		}*/
		
		//Enhanced for loop
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
			
		}
		
		System.out.println("Odd Numbers in array.....");
		/*for(int i=0;i<a.length;i++)
		{

		if(a[i]%2 !=0)
			System.out.println(a[i]);
*/
		
	for(int value:a)
	{
		if(value%2!=0)
			System.out.println(value);
		
	}
		
	}
	
}