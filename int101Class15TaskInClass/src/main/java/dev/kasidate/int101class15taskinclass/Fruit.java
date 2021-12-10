package dev.kasidate.int101class15taskinclass;

import java.util.Objects;

public class Fruit {
    final String name;
    final double price;
    final int quality;

    Fruit(String name, double price, int quality){
        if(name == null)name = "";
        this.name = name;
        if(price < 0.0)price = 0.0;
        this.price = price;
        if(quality < 1){quality = 1;}
        else if(quality > 10){quality = 10;}
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fruit other = (Fruit) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.quality != other.quality) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

  
