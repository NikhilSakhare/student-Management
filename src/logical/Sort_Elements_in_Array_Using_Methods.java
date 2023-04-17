package logical;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sort_Elements_in_Array_Using_Methods {
	
	public static void main(String[] args) {
		
		//Approch1
		/*int a[]= {30,40,60,50,20,10};
		System.out.println("Arrays element before sorting : "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays element after sorting :"+Arrays.toString(a));
	
	*/
		//Approach2
		/*
		 * int a[]= {30,40,60,50,20,10};
		 * System.out.println("Arrays element before sorting : "+Arrays.toString(a));
		 * Arrays.sort(a);
		 * System.out.println("Arrays element after sorting :"+Arrays.toString(a));
		 */
		
		//reverce Descending order
		Integer a[]= {30,40,60,50,20,10};
		System.out.println("Arrays element before sorting : "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Arrays element after sorting :"+Arrays.toString(a));
		}
	
	

}
