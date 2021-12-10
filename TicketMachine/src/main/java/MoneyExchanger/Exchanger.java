package MoneyExchanger;

public class Exchanger {
    public static void main(String[] args) {
        pre();
        MoneyExchanger mx = new MoneyExchanger(0.50, 500);
        mx.receiveForeignUnitsFromAdmin(100);
        mx.receiveForeignUnitsFromAdmin(300);
        mx.receiveBahtFromCustomer(800);
        mx.receiveBahtFromCustomer(240);
        System.out.println(mx);
       // System.out.println(mx.exchangeToForeignUnitsForCustomer(250));
        System.out.println(mx);
       // System.out.println(mx.giveAllCollectedBahtToAdmin());
        System.out.println(mx);
    }
    public static void pre(){
        System.out.println("------------ Money Exchanger -----------");
        System.out.println("--------------- welcome ----------------");

    }
}
