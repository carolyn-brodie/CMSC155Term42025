package week8.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void readNumber(String filename) throws FileNotFoundException  {
        //try {
            File reader = new File(filename);
            Scanner in = new Scanner(reader);
            int num;

            while (in.hasNext()) {
                num = in.nextInt();
                System.out.println(num);
            }
            in.close();
//        } catch (FileNotFoundException exception) {
//            System.out.println("Oop " + exception);
//        }
    }

    public static void main(String[] args)  {
        // Try reading from a file
       // File  reader = new File("E:\\myData\\firstFile.txt");
        //File  reader = new File("C:\\Users\\carolyn.brodie\\IdeaProjects\\CMSC155StartingSource\\src\\firstFile.txt");
//        File  reader = new File("firstFile.txt");
//        Scanner in = new Scanner(reader);
//        String word = "";
////
//        while(in.hasNext()) {
//            //word = in.next();
//            word = in.nextLine ();
//            System.out.println(word);
//        }
//        in.close();

        try {
            readNumber("numbers1.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("OOPS " + exception);
        }
    }

}
