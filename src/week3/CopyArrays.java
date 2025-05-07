package week3;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        int[] test = {1, 5, -3, 0, 66};
        int[] alias = test;

        int[] copy = Arrays.copyOf(test, test.length);
//        test[0] = 100;
//        System.out.println(Arrays.toString(test));
//        System.out.println(Arrays.toString(alias));
//        System.out.println(Arrays.toString(copy));



        int[] temp = new int[test.length];
        System.arraycopy(test, 0,
                temp, 2, 3);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(temp));

    }
}
