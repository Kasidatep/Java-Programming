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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.price, price) == 0 && quality == fruit.quality && name.equals(fruit.name);
    }
}
