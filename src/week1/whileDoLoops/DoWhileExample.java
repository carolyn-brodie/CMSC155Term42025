package week1.whileDoLoops;

public class DoWhileExample {
    public static void main(String[] args) {
        double number = 1;
        int divisor = 3, count = 0;
        do
        {
            number /= divisor;
            System.out.println(number);
            count++;
        }
        while (number >= divisor);

        System.out.println("count = " + count);

    }
}
