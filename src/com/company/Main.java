package com.company;

public class Main {

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone(IphoneModels.IPHONE_7,450.99,true);
        System.out.println(iphone1);

        Dog dog = new Dog("max","bulldog");
        dog.makeSound();

    }
}
