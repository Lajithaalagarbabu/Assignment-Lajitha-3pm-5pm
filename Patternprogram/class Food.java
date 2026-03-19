class Food{
	void eat(String breakfast) {
		System.out.println("Breaking the fast" +" " +breakfast);
		}
	void eat(String lunch,int time) {
		System.out.println("Lunch is " +lunch ,"at" ,+time+"pm");
	}
	void eat(String snacks,double quantity) {
		System.out.println("Snacks" +snacks +" (" +quantity + "plate"));
	}
	void eat(String dinner ,boolean isLight) {
		if(isLight) {
			System.out.println("Dinenr is " +dinner+ "(light meal"));
		}
		else {
			System.out.println("Dinenr is " +dinner+ "(Heavy meal"));
		}
	}
}
public class Polymorpism {

	public static void main(String[] args) {
		
                Food f=new Food();
                f.eat("Idly");
                f.eat("Briyani",2);
                f.eat("Tea" , 467890);
                f.eat("Chppathi & Kuruma" ,true);
	}

}
