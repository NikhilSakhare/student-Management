package logical;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		/*
		 * String arr[] = { "java", "c", "pythone", "java" };
		 * 
		 * // Approch1
		 * 
		 * boolean flag = false; for (int i = 0; i < arr.length; i++) { for (int j = i +
		 * 1; j < arr.length; j++) { if (arr[i] == arr[j]) {
		 * System.out.println("Found Duplicate element: " + arr[i]); flag = true; } } }
		 * if (flag == false) { System.out.println("Duplicate element not fount"); }
		 */
		
		//Approach:H:HashSet
		
		//Hashset never allow you to create or print dupplicate
		
			String arr[] = { "java", "c", "pythone", "java" };
		  HashSet <String> lang=new HashSet();
		  
		  /*System.out.println(lang.add("java")); System.out.println(lang.add("Python"));
		  System.out.println(lang.add("java"));*/
		 
		boolean flag=false;
		
		for(String l:arr)
		{
		if(lang.add(l)==false)
		{
			System.out.println("Found Duplicate Element: "+l);
			flag=true;
		}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}

	}

}
