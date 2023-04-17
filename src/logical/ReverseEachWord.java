package logical;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		//Approch 1
		/*String str= "Wellcome to java"; //Original string
		
		String[] words=str.split("  "); //Splitting String into words
		
		String reverseString=" ";
		for(String w:words) {
			String reversewords="";
			for(int i=w.length()-1;i>0;i--)
			{
				reversewords=reversewords+w.charAt(i);
			}
			reverseString=reverseString+reversewords+"  ";
				
				
		}
		System.out.println(reverseString);*/
		
		//Approch2
		String str ="Wellcome to java";
		String[] words =str.split("\\s");
		
		String reverseword="";
		
		for(String w:words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);
	}

}
