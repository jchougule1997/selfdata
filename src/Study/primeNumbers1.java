package Study;

public class primeNumbers1 {

	public static void main(String[] args) {

		int a=7;
		int b=0;
		
		for(int i=2;i<=a-1;i++) {
			if(a%i==0) {
				b=b+1;
			}
		}
		if(b>0) {
			System.out.println(a+"  is not a prime number");
		}else {
			System.out.println(a+" is a prime number  ");
		}
		
		
		
		
	}

}
