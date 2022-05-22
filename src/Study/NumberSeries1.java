package Study;

public class NumberSeries1 {

	public static void main(String[] args) {

		int row=4,number=10;
		int time=4;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=time;j++) {
				
				System.out.print(number   +     " ");
				number--;
			}
			time--;
			System.out.println();
		}
		
		
	}

}
