package week2.oop;

public class BankAccount {
    private static int nextID = 100;
    //Attributes
    private String owner;
    public double balance;
    private int account;

    //constructor
    public BankAccount(String owner, int account) {
//        this.owner = owner;
//        balance = 0;
//        this.account = account;
        this(owner, account, 0);

    }

    public BankAccount(String owner, int account, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.account = account;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        balance = 0;
        this.account = nextID;
        nextID++;

    }


    public static double seeNextID() {

        return nextID;
    }

    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void testMethod() {
        deposit(5);
    }

    public void withdraw(double amount) {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficent funds");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount other = (BankAccount) obj;
            return this.owner.equals(other.owner) &&
                    account == other.account &&
                    balance == other.balance;
        } else {
            return false;
        }
    }

    //Print
    public String toString() {

        return owner  + " has account " + account + " with balance " + balance;
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Suzy", 123, 10);
        obj.deposit(10);
        System.out.println(nextID);
        System.out.println(obj.balance);
        System.out.println(obj.balance);
    }

}


