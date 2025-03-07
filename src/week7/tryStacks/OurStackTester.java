package week7.tryStacks;



public class OurStackTester {
    public static void main(String[] args) {
        OurStack temp = new OurStack();

        temp.push("I");
        temp.push("am");
        temp.push("not");

        temp.pop(); 			// removes "not"
        temp.push("fine");
        String x = temp.peek();  	// should be "fine"

        temp.push("how");
        temp.push("are");
        temp.push("you");

        String y = temp.pop(); 	// should be "you"

        System.out.println("x = " + x + " y = " + y);
        System.out.println(temp);  //should be ["I" "am" "fine" "how" "are"]
    }
}
