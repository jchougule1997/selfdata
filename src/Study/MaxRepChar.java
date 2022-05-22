package Study;

public class MaxRepChar {

	public static void main(String[] args) {

		
		
		
		String s="abbbcccc";
		int arr[]=new int[127];
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=-1;
		char x=' ';
		for(int i=0;i<s.length();i++) {
			if(max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				x=s.charAt(i);
			}
		}System.out.println("maximum repeated charecter is  "+x);
		
	}

}
