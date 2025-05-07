package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrySorting {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";

//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.compareTo(s1));

        String[] strings = {"hi", "sigh", "bye"};
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(strings));
        System.out.println(Arrays.toString(strings));
//
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

    }
}
