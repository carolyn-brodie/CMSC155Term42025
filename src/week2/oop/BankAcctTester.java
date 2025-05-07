package week2.oop;


public class BankAcctTester {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Tommy", 567, 10);
        BankAccount acct2 = new BankAccount("Tommy", 567, 10);
        System.out.println("Alias test: " + (acct == acct2));
        System.out.println("Equality test: " + (acct.equals(acct2)));
//        System.out.println(acct);
//        BankAccount suzyAcct = new BankAccount("Suzzy");
//        System.out.println(suzyAcct);
//        System.out.println(suzyAcct.balance);
//        suzyAcct.deposit(10);
    }
}