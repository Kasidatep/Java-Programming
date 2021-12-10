package OldExam.Testpackage;

import OldExam.Final.Fruit.Fruit;
import OldExam.Final.Fruit.FruitCollection;

public class FruitTest {
    public static void main(String[] args) {
        Fruit a = new Fruit("Apple", 150.9, 10);
        Fruit b = new Fruit("Banana", 48.52, 6);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("Cherry", 85.179, 8);
        fc.addFruit("Date", 94.62, 9);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93, 7);
        int s = fc.searchForFruitName("Date");
        if (s>=0) {
            System.out.println(fc.getFruitAt(s));
        }

    }
}
