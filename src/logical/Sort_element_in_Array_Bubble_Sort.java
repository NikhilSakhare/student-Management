package logical;

import java.util.Arrays;

public class Sort_element_in_Array_Bubble_Sort {
	
	public static void main(String[] args) {
		
		int a[]= {4,2,1,5,3};
		System.out.println("Arrays before sorting"+Arrays.toString(a));
		
		int n=a.length;
		for(int i =0;i<n-1;i++)//Number passes
		{
			for(int j=0;j<n-1;j++) //Iterations in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting"+Arrays.toString(a));
	}

}
