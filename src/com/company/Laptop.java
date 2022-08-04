package com.company;

public class Laptop {
    int memori = 256;
    public String brand = "abble";
    public String model = "Macbook";
    public String colour = "black";
    public int ram =8;
    public int price = 80;

    @Override
    public String toString() {
        return "Laptop{" +
                "memori=" + memori +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", weigth=" + weigth +
                '}';
    }

    public String owner = "Bakai";
    public double weigth = 2.6;
}
