package OldExam.Final.Fruit;

public class FruitCollection {
    Fruit[] fruits;
    int count;

    public FruitCollection(int size){
        size = (size < 1) ? 1 : size;
        fruits = new Fruit[size];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull(){
        return count == fruits.length;
    }

    public boolean addFruit(String name, double price, int quality){
        if (count >= fruits.length || price < 0.0 || quality < 1 || quality > 10) return false;
        fruits[count] = new Fruit(name, price, quality);
        count++;
        return true;
    }

    public Fruit getFruitAt(int slot) {
        if (slot < 0 || slot > fruits.length) return null;
        return fruits[slot];
    }

    public boolean expand(int size){
        if (size < 1) return false;
        Fruit[] newFruits = new Fruit[fruits.length+size];
        for (int i = 0 ; i < count ; i++){
            newFruits[i] = fruits[i];
        }
        fruits = newFruits;
        return true;
    }

    public int searchForFruitName(String name){
        if (name == null)return -1;
        for (int i = 0 ; i < count ; i++){
            if (name.equals(fruits[i].getName())) return i;
        }
        return -1;
    }
}
