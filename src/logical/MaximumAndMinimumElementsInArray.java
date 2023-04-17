package logical;

public class MaximumAndMinimumElementsInArray {

	public static void main(String[] args) {

		/*
		 * int a[] = { 20, 50,200,30, 40, 60 };
		 * 
		 * int max = a[0];
		 * 
		 * for (int i = 1; i < a.length; i++) { if (a[i] > max) { max = a[i]; } }
		 * 
		 * System.out.println("Maximun Element is array is:  "+ max);
		 */

		int a[] = {30, 20, 40, 60};
		int min = a[0];
		for (int i = 1; i <= a.length; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Minimum Elemet is array is: "+min);
	}
}
