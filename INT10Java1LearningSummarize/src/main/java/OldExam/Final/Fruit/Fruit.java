package OldExam.Final.Fruit;

public class Fruit {
    String name;
    double price;
    int quality;

    public Fruit(String name, double price, int quality){
        this.name = (name == null) ? "" : name;
        this.price = (price < 0.0) ? 0.0 : price;
        if (quality < 1) this.quality = 1;
        else if (quality > 10) this.quality = 10;
        else this.quality = quality;
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
        return name + " (price:" + price + ", quality:" + quality +")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.price, price) == 0 && quality == fruit.quality && name.equals(fruit.name);
    }

    public int   compareTo(Fruit f){
        if ( f == null || this.quality > f.quality) return 1;
        else if (this.quality < f.quality) return -1;
        else return 0;
    }

}
