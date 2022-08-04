package com.company;

public class  Person {
    public String name = "Bakai";
    public double weigth = 92;
    public String citizenship = "Kyrgyzstan";
    public int age = 32;
    public  Laptop laptop = new Laptop();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                ", citizenship='" + citizenship + '\'' +
                ", age=" + age +
                ", laptop=" + laptop +
                '}';
    }
}

