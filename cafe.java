class CoffeeOrder {
    String size;
    double price;

    CoffeeOrder(String size, double price) {
        this.size= size;
        this.price= price;
    }

    void display(){
        System.out.println("Coffee Size: " +size);
        System.out.println("Price:Ksh " +price);
        System.out.println("----------------");
    }
}

public class Cafe {
    public static void main(String[] args) {
        CoffeeOrder coffeeorder1= new CoffeeOrder("Large", 200);
        CoffeeOrder coffeeorder2= new CoffeeOrder("Small", 100);

        System.out.println("Coffee order: ");
        coffeeorder1.display();

        System.out.println("Coffee order: ");
        coffeeorder2.display();
    }
}