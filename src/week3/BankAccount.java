package week3;

public class BankAccount {

    //static instance variables
    private static int nextId = 100;

    //instance variables
    private String owner;
    private int accountNum;
    private double balance;

    //constructors
    public BankAccount(String name) {
        this(name, nextId++, 0 );
    }

    public BankAccount(String name, int accountNum) {

        this(name, accountNum, 0);
    }
    public int hashCode() {
        int HASH_MULTIPLIER = 13;

        int h1 = owner.hashCode();
        int h2 = Integer.valueOf(accountNum).hashCode();
        int h = HASH_MULTIPLIER * h1 + h2;
        return h;
    }

    public BankAccount(String name, int accountNum, double balance) {
        owner = name;
        this.accountNum = accountNum;
        this.balance = balance;

    }


    //Deposit Method
    public void deposit(double amount) {
        balance  += amount;
    }

    //Withdrawal Method
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    //copy
    public BankAccount copy() {
        return new BankAccount(owner, accountNum, balance);
    }

    //equals
//    public boolean equals(Object obj) {
//        if (obj instanceof BankAccount) {
//            BankAccount other = (BankAccount) obj;
//            return owner.equals(other.owner) &&
//                    accountNum == other.accountNum  &&
//                    balance == other.balance;
//        } else {
//            return false;
//        }
//    }

    //For Printing
    public String toString() {
        return owner + " has account " + accountNum + " with balance $" + balance;
    }


}
