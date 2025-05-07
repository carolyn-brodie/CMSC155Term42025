package week4;

public class BankAccount implements Comparable<BankAccount>{

    private static int nextNum = 100;
    //attributes
    private String owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(String owner, int acct) {

        this(owner,acct,0);
    }

    public BankAccount(String owner, int acct, double balance) {
        this.owner = owner;
        accountNum = acct;
        this.balance = balance;
    }

    public BankAccount(String owner) {

        this(owner, nextNum++,0);
    }

    public int compareTo(BankAccount other) {
        if(this.owner.compareTo(other.owner) == 0) {
            if (this.balance < other.balance) {
                return -1;
            } else if (this.balance > other.balance) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return this.owner.compareTo(other.owner);
        }
    }

    //other methods
    public void deposit(double amount) {

        balance += (amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }

//    public boolean equals(BankAccount otherAcct) {
//        if (this.owner.equals(otherAcct.owner) &&
//             accountNum == otherAcct.accountNum &&
//                balance == otherAcct.balance)
//        {
//            return true;
//        } else {
//            return false;
//        }
//    }


//    public boolean equals(BankAccount otherAcct) {
//         return owner.equals(otherAcct.owner) &&
//                accountNum == otherAcct.accountNum &&
//                balance == otherAcct.balance;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount otherAcct = (BankAccount) obj;
            return owner.equals(otherAcct.owner) &&
                    accountNum == otherAcct.accountNum &&
                    balance == otherAcct.balance;
        } else return false;
    }

   // public BankAccount copy() {
//        return new BankAccount(owner, accountNum, balance);
//    }

    public void doSomething() {
        System.out.println("Bank - Something");
    }
    //print methods
    @Override
    public String toString() {
        String out = owner + " with account " + accountNum;
        out += " has balance " + balance;
        return out;
    }



}
