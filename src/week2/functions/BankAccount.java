package week2.functions;

public class BankAccount {

    //attributes
    private Person owner;
    private final int accountNum;
    private double balance;

    //constructor
    public BankAccount(final Person name, final int accountNum) {
        owner = name;
        this.accountNum = accountNum;
        this.balance = 0;
    }



    //Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    //Withdrawal Method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //For Printing
    public String toString() {

        return owner + " has account " + accountNum + " with balance $" + balance;
    }

    public static void main(String[] args) {
        Person sam = new Person("Sam Jones", "111 First Street", "555-555-5555");
        BankAccount samAccount = new BankAccount(sam, 123);
        System.out.println(samAccount);
        samAccount.deposit(100);
        System.out.println(samAccount);
        samAccount.withdraw(10);
        System.out.println(samAccount);
//        BankAccount joeAccount = new BankAccount("Joe", 345);
//        System.out.println(joeAccount);
    }
}
