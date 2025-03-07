package week2.functions;

public class BankAccount {

    //instance variables
    private String owner;
    private final int accountNum;
    private double balance;

    //constructor
    public BankAccount(final String name, final int accountNum) {
        owner = name;
        this.accountNum = accountNum;
        this.balance = 0;
    }



    //Deposit Method

    //Withdrawal Method

    //For Printing
    public String toString() {

        return owner + " has account " + accountNum + " with balance $" + balance;
    }

    public static void main(String[] args) {
        BankAccount samAccount = new BankAccount("Sam Jones", 123);
        System.out.println(samAccount);
//        samAccount.deposit(100);
        System.out.println(samAccount);
        //BankAccount joeAccount = new BankAccount("Joe", 345, 100);
        //System.out.println(joeAccount);
    }
}
