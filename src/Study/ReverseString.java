package Study;

public class ReverseString   {

	public static void main(String[] args)   {

		String a = "india";
		int b = a.length();
		String rev = "";
		for (int i = b - 1; i >= 0; i--) {
			

			rev = rev + a.charAt(i);
		     }

		System.out.println(rev);
	
	
		
	}

}
