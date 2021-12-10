package kasidate.money;

public class Change {
    public static void main(String[] args) {
        Money a = new Money(8787);
        Money b = new Money(8,1,2,1,1,1,1,2);
        a.change();
        ////b.change();
        b.moneyCount();
        System.out.println(a);
        System.out.println(b);
    }
}
