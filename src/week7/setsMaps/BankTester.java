package week7.setsMaps;

import java.util.HashSet;
import java.util.Set;

public class BankTester {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("Suzy", 123, 10.10);
        BankAccount acct2 = new BankAccount("Suzy", 123, 10.10);

        System.out.println("acct1 hashcode " + acct1.hashCode());
        System.out.println("acct1 hashcode " + acct2.hashCode());

        Set<BankAccount> accounts = new HashSet<>();
        accounts.add(acct1);
        accounts.add(acct2);
        System.out.println(accounts);
    }
}
