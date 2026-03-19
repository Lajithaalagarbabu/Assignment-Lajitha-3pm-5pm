

public class Incrementby2pattern {
	public static void main(String[] args) {
		int row=10;
		for(int i=3;i<=row;i+=2) { //loop for each row
			for(int j=3;j<=i;j+=2) { //loop for start in rows
			if(j%2==1){
				System.out.print(j);
			}
			}
			System.out.println(); //move to next row
		}

	}

}