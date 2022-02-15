package day01;

import java.util.concurrent.Callable;

public class CarObject {

    public static void main(String[] args) {
        Car car = new Car();
        car.year = 2022;
        car.make = "BMW";
        car.model = "5 Series";
        car.color = "Midnight Blue";
        car.miles = 12;




        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.miles + " miles");
        System.out.println(car.color);



        Car car1 = new Car ();
        car.year = 2017;
        car.make = "Ford";
        car.model = "F150";
        car.miles = 62000;
        car.color = "Silver";

        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.miles + " miles");
        System.out.println(car.color);







    }
}
