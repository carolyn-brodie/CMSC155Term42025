package week2.oop;

public class Equality {

    public static void main(String[] args) {


        String s1 = new String("Hi There");
        String s2 = new String("Hi There");
        String s3 = s1;  // this is an alias

        System.out.println("s1 == s2: " + (s1 == s2));
        //False
        System.out.println("s1 == s3: " + (s1 == s3));
       // True
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        //True
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        //True
    }

}
