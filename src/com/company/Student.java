package com.company;

public class Student {
    private String name;
    private int age;
    private String pol;
    private int skorostPechat;
    private String english;
    private String forma;

    public Student(String name, int age, String pol,int skorostPechat,String english,String forma){
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.skorostPechat=skorostPechat;
        this.english=english;
        this.forma=forma;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getPol(){
        return pol;
    }
    int getSkorostPechat(){
        return skorostPechat;
    }
    String getEnglish(){
        return english;
    }
    String getForma(){
        return forma;
    }

    }




