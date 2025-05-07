package week3;

import java.util.ArrayList;

public class TryArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(1);
        System.out.println(myList);
        myList.add(1, 3);
        System.out.println(myList);
        myList.set(0, 4);
        System.out.println(myList);
        myList.add(myList.get(1));
        System.out.println(myList);
//        System.out.println(myList.remove(myList.size() - 1));
       myList.remove(Integer.valueOf(3));
        System.out.println(myList);
       // myList.remove(myList.size());

    }
}
