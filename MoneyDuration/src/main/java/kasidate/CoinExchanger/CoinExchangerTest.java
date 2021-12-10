package kasidate.CoinExchanger;

public class CoinExchangerTest {
    public static void main(String[] args) {
        CoinExchanger a = new CoinExchanger(2);
        CoinExchanger b = new CoinExchanger(2.2);
        CoinExchanger c = new CoinExchanger(2.2,8);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.getCoinValue());
        System.out.println(a.getNumberOfCoins());
        System.out.println(a.getTotalBankNoteValue());
        System.out.println(b.getNumberOfCoins());
        System.out.println(b.getNumberOfCoins());
        System.out.println(b.getTotalBankNoteValue());
        System.out.println(c.getCoinValue());
        System.out.println(c.getNumberOfCoins());
        System.out.println(c.getTotalBankNoteValue());
        a.exchangeForOneBankOfValue(2);
        a.resitTo(5,52);


    }
}
