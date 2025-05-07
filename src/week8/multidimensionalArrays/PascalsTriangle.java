package week8.multidimensionalArrays;

//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1

public class PascalsTriangle {

    public static int[][] makeTriangle(int numRows) {
        int[][] triangle = new int[numRows + 1][];

        triangle[0] = new int[1];
        triangle[0][0] = 1;
        triangle[1] = new int[2];
        triangle[1][0] = 1;
        triangle[1][1] = 1;

        for (int row = 2; row < triangle.length; row++) {
            triangle[row] = new int[row+1];
            triangle[row][0] = 1;
            for (int column = 1; column < row; column++) {
                triangle[row][column] = triangle[row - 1][column] + triangle[row - 1][column - 1];
            }
            triangle[row][row] = 1;
        }


        return triangle;
    }

    public static void main(String[] args) {

        PrintUtils.printIntMatrix(makeTriangle(5));
    }
}
