class Product {

    int productId;
    String productName;
    int price;
    double quantity;

    Product(int id,String n,int p,double q){
        productId=id;
        productName=n;
        price=p;
        quantity=q;
    }

    void calculateTotalPrice(){
        double totalPrice=price*quantity;

        System.out.println("Product Id : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Price : "+totalPrice);
    }

    public static void main(String[] args) {

        Product p=new Product(1,"Laptop",50000,1);
        p.calculateTotalPrice();

    }
}