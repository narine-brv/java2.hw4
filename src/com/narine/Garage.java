package com.narine;

public class Garage <C extends Car> implements Printable <C> {

    private C cars;

    public C getCars() {
        return cars;
    }

    public void setCars(C cars) {
        this.cars = cars;
    }


    @Override
    public C print() {
        System.out.println(getCars().getClass().getSimpleName() + " выехал из завода");
        return cars;
    }

    @Override
    public void print(C c) {
        System.out.println(c.getClass().getSimpleName() + " заехал в гараж");
    }
}