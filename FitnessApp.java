import java.util.Scanner;

class getFitnessLevel {
    int steps;

    getFitnessLevel(int steps) {
        this.steps= steps;

    }
    void display() {

        System.out.println("Steps: " +steps);

    }
}

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Your Steps for today: ");

        int steps= scanner.nextInt();
        
        getFitnessLevel getFitnessLevel= new getFitnessLevel(steps);

        System.out.println("Fitness details: ");

        getFitnessLevel.display();

        if (steps>=10000) {
            System.out.println("Excellent");
        }
        else if (steps>=7000 && steps<10000) {
            System.out.println("Good");
        }
        else if (steps>=4000 && steps<7000) {
            System.out.println("Average");
        }
        else {
            System.out.println("Poor");

        }

        scanner.close();
    }
}