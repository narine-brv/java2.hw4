package com.narine;

public class Main {

    public static void main(String[] args) {
        Garage <Mercedes> car1 = new Garage<>();
        car1.setCars(new Mercedes());
        car1.print();
        car1.print(car1.getCars());



        Garage <BMW> car2 = new Garage<>();
        car2.setCars(new BMW());
        car2.print();
        car2.print(car2.getCars());



        Garage <Lexus> car3 = new Garage<>();
        car3.setCars(new Lexus());
        car3.print();
        car3.print(car3.getCars());
    }
}
