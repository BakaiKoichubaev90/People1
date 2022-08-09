package com.company;

public class myshyk {
     public String color;
     public int weight;
     public  String name;
     void setColor (String word){
         if(word.length()>=1){
             color=word;
         }else {
             System.out.println("onu bir tamga bolboit");
         }
     }
     void setWeight (int kg){
         if(kg>1){
             weight=kg;
         }else{
             System.out.println("salmagy 1 kg dan ashyk bolot");
         }
     }
     void setName(String aty){
         if(aty.length()>=3){
             name=aty;
         }else{
             System.out.println("aty 3 tamgadan kop bolush kerek");
         }
     }
     ////////////////////////////////////////////////////////////////////
    //getter
    String getColor(){
         return color;
    }
    int getWeight(){
         return weight;
    }
    String getName(){
         return name;
    }
}
