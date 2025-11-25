import java.util.Scanner;

class calculateTotalCost {
    double accommodationCost;
    double mealCost;
    double activityCost;

    calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        this.accommodationCost = accommodationCost;
        this.mealCost = mealCost;
        this.activityCost = activityCost;
    }

     void display() {

        System.out.println("Accommodation Cost: " +accommodationCost);
        System.out.println("Meal Cost: " +mealCost);
        System.out.println("Activity Cost: " +activityCost);
    }
}

class calculator {
    double add(double a, double b, double c) {
         
         return a+b+c;
    }
}

public class Travelagency {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Accommodation Cost: ");
        double accommodationCost= scanner.nextDouble();

        System.out.println("Enter Meal Cost: ");

        double mealCost= scanner.nextDouble();

        System.out.println("Enter activity Cost: ");

        double activityCost= scanner.nextDouble();

        calculateTotalCost calculateTotalCost = new calculateTotalCost(accommodationCost, mealCost, activityCost);

        System.out.println("Travel details: ");
        
        calculateTotalCost.display();

        calculator Cost =new calculator();

        

        System.out.println("Total Vacation Cost:Ksh " +Cost.add(accommodationCost, mealCost, activityCost));

        scanner.close();
    }
}