package com.company;

public class Popugai {
    public String imya;
    public String svet;
    public int vozrast;
    public double ves;

    void setImya(String name){
        if(name.length()>=4){
            imya=name;
        }
    }
    void setSvet(String color){
        if(color.length()>=2){
            svet=color;
        }else{
            System.out.println("takoi svet ne poidet");
        }
    }
    void setVozrast(int age){
        if(age>0){
            vozrast=age;
        }
    }
    void setVes(double kg){
        if(kg>0.5){
            ves=kg;
        }
    }

    ///////////////////////////////////////////////////////////////////
    //getter

    String getImya(){
        return imya;
    }
    String getSvet(){
        return svet;
    }
    double getVes(){
        return ves;
    }
    int getVozrast(){
        return vozrast;
    }
}
