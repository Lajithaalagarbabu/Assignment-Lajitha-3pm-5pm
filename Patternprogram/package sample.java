package sample;

public class ConstructorName {
	int value1, value2;//imstance variable
	
	ConstructorName()
	{
		value1 =10;//initialize the instance variable
		value2 =20;
	}
   public void display()
   {
	   System.out.println("value1= " +value1);
	   System.out.println("value2= " +value2);
	   }
	public static void main(String[] args) {
		ConstructorName cn = new ConstructorName();
		cn.display();
	
		

	}

}