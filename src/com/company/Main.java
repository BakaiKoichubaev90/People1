package com.company;



public class Main {
    public static void main(String[] args) {


        /* Ryba ryba = new Ryba("forel", 56, false);
        System.out.printf(ryba.getName() + " degen balyk ");
        System.out.printf("salmagy "+ryba.getWeigth() + " kg ");
        System.out.printf(ryba.isUiJanybary() + " ui janybary emes");*/

        Kurs kurs = new Kurs("unever", "Muha","1 jul");
        Kurs kurs1 = new Kurs("peaksoft","Janarbek","1 avgust");
        Student student = new Student("Syimyk",21,"bala");
        Student student1 = new Student("Nurlan",18,"bala");
        Student student2 = new Student("Samarbek",42,"bala");

        System.out.printf("Student   : %s,%d,%s\n", student.getName(),student.getAge(),student.getPol());
        System.out.printf("Student1  : %s,%d,%s\n", student1.getName(),student1.getAge(),student1.getPol());
        System.out.printf("Student2  : %s,%d,%s\n", student2.getName(),student2.getAge(),student2.getPol());


        System.out.printf("kurs    : %s,%s,%s\n", kurs.getkurstunAty(),kurs.getmygalimdinAty(),kurs.getbashtalganKun());
        System.out.printf("kurs1   : %s,%s,%s\n", kurs1.getkurstunAty(),kurs1.getmygalimdinAty(),kurs1.getbashtalganKun());





































        /*Fish fish = new Fish();
    fish.setOnu ("Kara");
    fish.setSalmagy(3.6);
    fish.setTuru("Karb");

        System.out.println(fish.getOnu());
        System.out.println(fish.getSalmagy() + " kilogramm");
        System.out.println(fish.getTuru());

        myshyk myshyk = new myshyk();
        myshyk.setColor("kyzyl");
        myshyk.setName("Murka");
        myshyk.setWeight(2);

        System.out.println(myshyk.getName());
        System.out.println(myshyk.getColor());
        System.out.println(myshyk.getWeight() + " kg");


        Popugai popugai = new Popugai();
        popugai.setImya("Kesha");
        popugai.setSvet("Raznosvetnyi");
        popugai.setVes(1.6);
        popugai.setVozrast(3);

        System.out.println(popugai.getImya());
        System.out.println(popugai.getSvet());
        System.out.println(popugai.getVes() + " kilo");
        System.out.println(popugai.getVozrast() + " goda");


        It it=new It();
        it.setName("Bobik");
        it.setColor("white");
        it.setAge(1.6);
        it.setBreed("Alabai");

        System.out.println(it.getName());
        System.out.println(it.getColor());
        System.out.println(it.getAge() + "jashta");
        System.out.println(it.getBreed());*/




    }






}



































