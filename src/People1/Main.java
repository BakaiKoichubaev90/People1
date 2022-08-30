package People1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asan people1 = new Asan("AN3365253", "Asan",
                "Dyikanbae", 24, "Asan98@mail.ru", "Bishkek", new int[]{1, 2, 3, 4, 5});
        Uson people2 = new Uson("AN3735493", "Uson",
                "Razzakova", 20, "Uson2002@mail.ru", "Osh", new int[]{1, 2, 3, 4, 5});

        Adyl people3 = new Adyl("AN3743853", "Adyl",
                "Beishekeev", 28, "Adyl94@mail.ru", "Bishkek", new int[]{1, 2, 3, 4, 5});

        Akyl people4 = new Akyl("AN3733853", "Akyl",
                "Orozbaev", 21, "Akyl99@mail.ru", "Naryn", new int[]{1, 2, 3, 4, 5});

        Ainur people5 = new Ainur("AN3733853", "Ainur",
                "Smirnova", 21, "Ainur2001@mail.ru", "Batken", new int[]{1, 2, 3, 4, 5});

        People1[] peoples = {people1, people2, people3, people4, people5};
        Asan[] asans = new Asan[1];
        Uson[] usons = new Uson[1];
        Adyl[] adyls = new Adyl[1];
        Akyl[] akyls = new Akyl[1];
        Ainur[] ainurs = new Ainur[1];

        for (int i = 0; i < peoples.length; i++) {
            System.out.println("---------" + peoples[i].getFistName() + " jonundo maalymat " + "-------");
            peoples[i].work(peoples[i].getFistName());
            peoples[i].ToRelax();
            peoples[i].communications();
            System.out.println();

        }
        System.out.println("kundu teriniz");
        int number = scanner.nextInt();
        int value = 0;
        for (int i = 0; i < peoples.length; i++) {

            System.out.println(peoples[i].getFistName());
            for (int j = 0; j < peoples[i].getTimeTable().length; j++) {
                if (peoples[i].getTimeTable()[j] == number) {
                    value = 1;
                }
            }
            if (value == 1) {
                System.out.println("ishteit");
            }
            if (value == 0) {
                System.out.println("ishtebeit");
           }
        }


    }
}
