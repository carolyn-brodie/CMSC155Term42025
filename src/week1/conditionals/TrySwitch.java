package week1.conditionals;

public class TrySwitch {

    public static void main(String[] args) {
        String foodGrade = "GradeA";

        switch(foodGrade) {
            case "GradeA":
                System.out.println("30 cents per lb.");
                break;
            case "GradeB":
                System.out.println("20 cents per lb.");
                break;
            case "GradeC":
                System.out.println("15 cents per lb.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
