package days;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch(scanner.nextLine()) {
            case "1-kun":
                System.out.println(Days.DUISHOMBY.kundor);
                break;
            case "2-kun":
                System.out.println(Days.SHEISHEMBI.kundor);
                break;
            case "3-kun":
                System.out.println(Days.SHARSHENBI.kundor);
                break;
            case "4-kun":
                System.out.println(Days.BEISHEMBI.kundor);
                break;
            case "5-kun":
                System.out.println(Days.ZHUMA.kundor);
                break;
            case "6-kun":
                System.out.println(Days.ISHEMBI.kundor);
                break;
            case "7-kun":
                System.out.println(Days.JEKSHEMBI.kundor);
                break;
            default:
                System.out.println("Myndai kun jok");


        }





    }
}
