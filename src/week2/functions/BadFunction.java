package week2.functions;

public class BadFunction {

    public static boolean badFunction(int int1) {
        if (int1 > 0) return true;
        else if (int1 < 0) return false;
//
        else return true;
    }


    public static void main(String[] args) {
        badFunction(5);
    }
}
