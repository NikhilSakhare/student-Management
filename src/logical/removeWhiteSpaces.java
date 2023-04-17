package logical;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		String str ="Java       programming     nikhil     sakhare";
		
		str=str.replaceAll("\\s", "");
		System.out.println("After removing "+str);
				
	}
}
