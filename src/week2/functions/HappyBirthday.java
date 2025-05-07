package week2.functions;

public class HappyBirthday {

    public static String happy()
    {

        return "Happy birthday to you! ";
    }

    public static void singHappyBirthday(String person) {
        System.out.println(happy() + happy() + "Happy birthday dear "
                + person + ",\n" + happy());
    }



    public static void main(String[] args)
    {
//        String out = happy();
//        System.out.println(out);
        singHappyBirthday("Suzy");
    }
}
