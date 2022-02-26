package com.company;

public class Car implements AutoCloseable {

    void drive() {
        System.out.println("Машина едет!");
    }

    void battery() throws MyException {
        System.out.println("Заряд аккумулятора закончилось!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Будьте осторожны! Двери закрывается!");
    }
}
