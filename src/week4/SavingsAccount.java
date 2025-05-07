package week4;

public class SavingsAccount extends BankAccount{

    //Notice this is no longer static
    private double interestRate = .1;

    public SavingsAccount(String owner, double interest) {
        super(owner);
        interestRate = interest;
    }
    @Override
    public void doSomething() {
        System.out.println("something");

    }

    public void savingsOnly() {
        System.out.println("savings");
    }

    @Override
    public String toString() {
        String out = super.toString();
        out +=  " with interest rate " + interestRate;
        return out;
    }


}
