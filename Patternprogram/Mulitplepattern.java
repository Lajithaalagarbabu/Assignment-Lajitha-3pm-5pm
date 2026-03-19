public class Mulitplepattern {
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) { //loop for each row
			for(int j=1;j<=i;j++) { //loop for start in rows
				System.out.print(" " +j*5);
			}
			System.out.println(); //move to next row
		}

	}

}
