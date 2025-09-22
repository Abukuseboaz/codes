import java.util.Scanner;

public class librarybook {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter book ID: ");
    int bookID= scanner.nextInt();

    System.out.println("Enter due date(Number of days): ");
    int Duedate=scanner.nextInt();

    System.out.println("Enter return date(number of days): ");
    int returndate=scanner.nextInt();

    int overdue=returndate-Duedate;

    int fineamount;
    
    if(overdue<=7) {

        fineamount=overdue*20;
    }
    else if(overdue<=14){

        fineamount=overdue*50;
    }
    else{
        fineamount=overdue*100;
        }

        System.out.println("FINE RATE IS AS FOLLOW:");
        System.out.println("For <=7 days: 20/=");
        System.out.println("For <14 days: 50/=");
        System.out.println("For more than 15: 100/=");
        System.out.println("BookId: "+ bookID);
        System.out.println("Due date: "+ Duedate);
        System.out.println("Return date: "+ returndate);
        System.out.println("Days of overdue: " + overdue);
        System.out.println("The fine amount: " + fineamount);
    }

}