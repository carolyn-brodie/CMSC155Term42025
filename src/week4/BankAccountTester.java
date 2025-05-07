package week4;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
//        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        suzyAccount.deposit(10);
//        System.out.println(suzyAccount);
        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);

        BankAccount acct2 = new BankAccount("Tom", 8976, 1000);
        BankAccount acct3 = new BankAccount("Tom", 8979, 400);




        SavingsAccount bankVar = new SavingsAccount("Xiavor", .15);
//        System.out.println(bankVar);
//        bankVar.doSomething();
//        suzyAccount.doSomething();
        BankAccount test = new SavingsAccount("name", .15);
//        bankVar.savingsOnly();
//        test.doSomething();
       // SavingsAccount test2 = new BankAccount("name");

        System.out.println(acct2);
        System.out.println(bankVar);


        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(acct3);
        list.add(suzyAccount);
        list.add(acct2);
        list.add(bankVar);

//        System.out.println(list.contains(new BankAccount("Suzy Q", 1234,99.9)));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);




    }
}
