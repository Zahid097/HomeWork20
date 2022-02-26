package com.company;

public class Main {

    public static void main(String[] args) {

        try (Car car = new Car()) {
            car.drive();
            car.battery();
        } catch (Exception a) {
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Электрокар едет даже на нолевом заряде аккумулятора))!!");
        }
    }
}
