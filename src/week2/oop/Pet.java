package week2.oop;

public class Pet {

    private static int number_pets = 0;
    //attributes
    private String name;
    private String type;
    private int times_petted;

    public Pet(final String type, final String name) {
        this.name = name;
        this.type = type;
        times_petted = 0;
        number_pets++;
    }

    public static int getNumber_pets() {
        return number_pets;
    }

    public void petThePet(int times) {
        times_petted += times;
    }

    public String toString() {
        return name + " is a " + type + " and had been petted " + times_petted + ".";
    }



}
