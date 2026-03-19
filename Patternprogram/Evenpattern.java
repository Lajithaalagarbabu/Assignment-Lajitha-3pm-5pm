public class Evenpattern {

	public static void main(String[] args) {
		int row=10;
		for(int i=1;i<=row;i++) { //loop for each row
			for(int j=1;j<=i;j++) { //loop for start in rows
			if(i%2==0&& j%2==0){
				System.out.print(j);
			}
			}
			System.out.println(); //move to next row
		}

	}

}