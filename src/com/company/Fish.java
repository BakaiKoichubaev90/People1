package com.company;

public class Fish {

    public String turu;
    public double salmagy;
    public String onu;

    void setOnu (String word){
       if (word.length()>=3){
           onu = word;

       } else {
           System.out.println("Myndai on jok");
       }

    }
    void setSalmagy (double number){
        if(number >0.1){
            salmagy=number;
        } else{
            System.out.println("salmagy ters san bolboit");
        }
    }
    void setTuru(String word) {
        if (word.length() >= 2) {
            turu=word;
        } else {
            System.out.println("Myndai turu jok");
        }
    }
        //////////////////////////////////////////////////////////////////
        // getter

        String getOnu(){
            return onu;
        }
        double getSalmagy(){
            return salmagy;
        }
        String getTuru(){
            return turu;
        }


}
