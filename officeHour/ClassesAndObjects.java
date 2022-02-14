
public class ClassesAndObjects {


    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Gunner";
        myDog.age = 10;
        myDog.breed = "lab";
        myDog.numberOfLegs = 4;
        myDog.color = "black";

        myDog.bark();

        Dog yourDog = new Dog();
        yourDog.name = "Ninja";
        yourDog.bark();

    }
}