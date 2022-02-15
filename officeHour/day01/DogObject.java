package day01;

public class DogObject {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Gunner";
        myDog.age = 10;
        myDog.breed = "Lab";
        myDog.color = "Black";
        myDog.numberOfLegs = 4;
        myDog.barks();

       Dog yourDog = new Dog();
       yourDog.name = "Ninja";
        yourDog.barks();




    }
}
