package logical;

public class countCarecterOccurrences {
	
	public static void main(String[] args) {
		
		String s="Java programingjava oops";
		int totalcounts =s.length();  //total length
		
		int totalcount_afterRemove=s.replace("a","").length();  //total len after removing a
		
		int count=totalcounts-totalcount_afterRemove;
		System.out.println("No. of a " +count);
	}

}
