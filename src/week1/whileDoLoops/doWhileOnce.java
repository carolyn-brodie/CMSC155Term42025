package week1.whileDoLoops;

public class doWhileOnce {
    public static void main(String[] args) {
        System.out.println("Beginning");
        int x = 10;
        while( x < 5) {
            System.out.println("Inside while loop");
            x++;
        }

        System.out.println("after while loop");
        do {
            System.out.println("Inside do loop");
            x++;
        } while(x < 5);
        System.out.println("End");
    }
}
