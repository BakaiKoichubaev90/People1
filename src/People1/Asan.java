package People1;

import java.util.Scanner;

public class Asan extends People1 {
    public Asan(String id, String fistName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, fistName, lastName, age, email, city, timeTable);
    }

    @Override
    public void work(String fistName) {
        System.out.println(" mektepte ishteit");
    }

    @Override
    public void ToRelax() {
        System.out.println("Jylyna 2 jolu Ysyk-Kolgo barat");


    }

    @Override
    public void communications() {
        System.out.println("adamdar menen jakshy til tabyshat");

    }

    @Override
    public void grafik() {
        System.out.println("Ushul kundoru Asan ishteit");

    }

    @Override
    public void timetable() {
    Scanner scanner = new Scanner(System.in);
       int kun = scanner.nextInt();

        int a = 0;
        for (int i = 0; i < getTimeTable().length; i++) {

            if (kun == getTimeTable()[i]){
                a=1;
            }
        }
        if (a == 0 && a>8){
            System.out.println("ishteit");
        }else {
            System.out.println("ishtebeit");
        }

    }
}


