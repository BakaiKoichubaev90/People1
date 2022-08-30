package People1;

import java.util.Scanner;

public class Akyl extends People1{
    public Akyl(String id, String fistName, String lastName, int age, String email, String city, int[] timeTable) {
        super(id, fistName, lastName, age, email, city, timeTable);
    }

    @Override
    public void work(String fistName) {
        System.out.println(fistName+ " Akyl ech jakta ishtebeit");

    }

    @Override
    public void ToRelax() {
        System.out.println(" jyl saiyn europaga baryp kelet");

    }

    @Override
    public void communications() {
        System.out.println(" adamdar menen jakshy til abyshat");

    }

    @Override
    public void grafik() {
        System.out.println(" jumushka barbait");

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
