package week1.tryStrings;

public class TestEquality {

    public static void main(String[] args) {
        String s1 = "hello there";
        String s2 = new String("hello there");
        String s3 = s1;

        //  == is an alias test
        System.out.println("s1 == s2 will be false: " + (s1 == s2));
        System.out.println("s1 == s3 will be true: " + (s1 == s3));

        //To test equality use .equals()
        System.out.println("s1.equals(s2): " + (s1.equals(s2)));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));
    }
}
