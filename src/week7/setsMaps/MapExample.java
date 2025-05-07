package week7.setsMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static String findMaxInMap(Map<String,Integer> theMap) {
        Iterator it = theMap.entrySet().iterator();
        int max;
        String keyForMaxValue = null;
        Map.Entry pair;

        //Start at beginning
        if (it.hasNext()) {
            pair = (Map.Entry) it.next();
            keyForMaxValue = (String) pair.getKey();
            max = (int)pair.getValue();
            while (it.hasNext()) {
                pair = (Map.Entry) it.next();
                if ((int)pair.getValue() > max) {
                    keyForMaxValue = (String) pair.getKey();
                    max = (int)pair.getValue();
                }   } }
        return keyForMaxValue;
    }

    public static void main(String[] args) {
        Map<String,Integer> test = new HashMap<>();
        test.put("val1", 10);
        test.put("val2",5);
        test.put("val3", 25);
        test.put("val4",20);
        System.out.println(findMaxInMap(test));
    }

}
