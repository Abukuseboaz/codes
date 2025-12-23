import java.util.Scanner;

class Product {
    private String name;
    private double price;
     
    public Product(String name, double price) {
    this.name=name;
    this.price=price;
    }

    public void applyDiscount(double Percentage){
        price=price-(price*Percentage/100);

    }
    public double getPrice(){
        return price;
    }

}
public class OnlineStore {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    
    Product product= new Product("Phone", 113000);

    System.out.println("Enter a discount percentage: ");
    double Percentage= scanner.nextDouble();

    Product.applyDiscount();

    System.out.println("New price:Ksh "+price);

    scanner.close();
    }
}

