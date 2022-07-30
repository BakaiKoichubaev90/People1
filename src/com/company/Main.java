package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
        System.out.println(method(word));

        }
       public static boolean method(String word) {
          int count = 0;
           for (int i = 0; i < word.length(); i++) {
               if(word.charAt(i) == 'e'){

                   return true;
               }
               else{
                   return false;
               }

           }

            return false;
        }
}




























