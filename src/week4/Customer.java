package week4;

public class Customer extends Person{

    private int accountNumber;
    private String salesArea;

    public Customer(String name, String phone, String address,
                    int acct, String area) {

        super(name,phone, address);
        accountNumber = acct;
        salesArea = area;
    }

    public void findLocationInfo() {
        System.out.println("Customer");
    }

    public String formatAddress() {
        return getAddress() + " " + salesArea;
    }


}
