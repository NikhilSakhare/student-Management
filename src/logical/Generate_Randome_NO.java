package logical;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Randome_NO {

	public static void main(String[] args) {
		
		//Appraoch1 - random
		
		/*
		 * Random rand = new Random();
		 * 
		 * int rand_int =rand.nextInt(100);
		 * 
		 * System.out.println(rand_int);
		 * 
		 * double rand_dbl=rand.nextDouble(); //range 0.0 and less than 1.0
		 * System.out.println(rand_dbl);
		 */
		
		//Approch2 - math class
		
		System.out.println(Math.random());
		
		//approch 3 - Apache commos-lang API
		//http://commons.apache.org/
		
		String randNum = RandomStringUtils.randomNumeric(7);
		System.out.println(randNum);
		
	}
	
}
