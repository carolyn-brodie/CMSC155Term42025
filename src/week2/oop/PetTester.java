package week2.oop;

public class PetTester {
    public static void main(String[] args) {
        Pet cat = new Pet("Cat", "Bill");
        System.out.println(cat);
        cat.petThePet(5);
        System.out.println(cat);
        Pet dog = new Pet("Dog", "Fido");
        System.out.println(Pet.getNumber_pets());

    }
}
