package week5.shapes;

public interface Shape {
//    double computeArea();

    int QUARTER = 25;
    default double computeArea()
    {
        return 2.5;
    }
//
    static int multiply(int one, int two)
    {
        return one * two;
    }

}
