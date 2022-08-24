package com.company;

public class Cat implements AnimalInterface{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
