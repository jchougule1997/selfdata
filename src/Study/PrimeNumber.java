package Study;

public class PrimeNumber {

	public static void main(String[] args) {
    
		
		
		  int a=7;
		  int rev=0;
		  for(int b=2;b<=a-1;b++) {
			  
			  if(a%b==0) {
				  rev=rev+1;
			  }
		  }if(rev==0) {
			  System.out.println("no.is a prime");
		  }else {
			  System.out.println("no.is not a prime");
		  }
		  
	}

}
