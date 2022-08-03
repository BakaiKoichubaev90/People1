package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.age = 32;
        person.name= "Bakai";
        person.rost = 179;
        person.ves = 92;
        System.out.println("My name is " + person.name);
        System.out.println( "moi ves sostavliaet " + person.ves + " kg");
        System.out.println( "Mne " + person.age + " goda");
        System.out.println("moi rost sostavliaet" + person.rost + " sm");
    }
        /*Scanner scanner =new Scanner(System.in);
        int number1 = scanner. nextInt();
        int number2 = 0;
        while(number1>0) {
            number1/=10;
            number2++;

        }
        System.out.println(number2);

}*/
}
 class Person {
    String name;
    int age;
    int rost;
    int ves;

 }





























