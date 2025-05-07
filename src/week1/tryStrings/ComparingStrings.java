package week1.tryStrings;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbc";

        //when comparing strings, a negative means s1 comes before s2
        //a positive means s2 comes before s1
        //zero means they are the same
        System.out.println(s1.compareTo("s2") < 0);
    }
}
