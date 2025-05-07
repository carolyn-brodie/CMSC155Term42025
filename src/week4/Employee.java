package week4;

public class Employee extends Person{

    private String jobTitle;

    public Employee(String name, String phone, String address, String job) {
        super(name, phone,address);
        jobTitle = job;
    }

    @Override
    public void findLocationInfo() {
        //do something
        System.out.println(getAddress());
    }

    public String formatAddress() {

        return "Address: " + getAddress();
    }
}
