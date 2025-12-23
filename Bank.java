import java.util.Scanner;
class BankAccount {
    double balance;

    BankAccount(double balance){
        this.balance=balance;
    }
    
    public void deposit(int Amount){
        if (Amount>0){
            balance+=Amount;
            System.out.println("Deposit: Ksh"+ Amount);
        }
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount() {
        super(0.0);
    }
public void AddInterest(){
    balance=balance+(balance*0.05);
}
}
public class Bank{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        SavingsAccount savingaccount= new SavingsAccount();

        System.out.println("Enter amount to deposit:");
        int Amount=scanner.nextInt();
        savingaccount.deposit(Amount);
        savingaccount.AddInterest();
        System.out.println("New balance: Ksh" +savingaccount.balance);

        scanner.close();

    }
}