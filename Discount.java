import java.util.Scanner;
public class Discount{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double discount;
        //prompt user to enter name
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();

        System.out.println("Enter amount purchased: ");
        double amount= scanner.nextDouble();

        if(amount>5000){
            discount=amount*0.1;
        }
        else if (amount>=1000 && amount<=5000){
            discount=amount*0.05;
        }
        else {
            discount=0;
        }
        double amounttopay=amount-discount;

        System.out.println("Initial amount" + amount);
        System.out.println("Discount" + discount);
        System.out.println("Amount to pay" + amounttopay);

        scanner.close();
    }
}