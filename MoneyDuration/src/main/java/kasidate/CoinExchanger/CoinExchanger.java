package kasidate.CoinExchanger;

public class CoinExchanger {
    private double coinValue = 1.0;
    private int numberOfCoins = 10;
    private double totalBankNoteValue ;

    CoinExchanger(double coinValue){
        if (coinValue > 0.0){this.coinValue = coinValue;}
    }

    CoinExchanger(int numberOfCoins){
        if (numberOfCoins > 0){this.numberOfCoins = numberOfCoins;}
    }

    CoinExchanger(double coinValue, int numberOfCoins){
        if (coinValue > 0.0){this.coinValue = coinValue;}
        if (numberOfCoins > 0){this.numberOfCoins = numberOfCoins;}
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public double getCoinValue() {
        return coinValue;
    }

    public double getTotalBankNoteValue() {
        return totalBankNoteValue;
    }

    @Override
    public String toString() {
        return "CoinExchanger{" +
                "coinValue=" + coinValue +
                ", numberOfCoins=" + numberOfCoins +
                ", totalBankNoteValue=" + totalBankNoteValue +
                '}';
    }

    public int exchangeForOneBankOfValue(double value){
        if (value <= 0) return  -1 ;
        if (numberOfCoins < value*coinValue ) return -2;
        int change = (int) (value / coinValue);
        if (change > numberOfCoins) return -2;
        numberOfCoins -= change;
        totalBankNoteValue += value;
        return change;
    }

    public void resitTo(double coinValue, int numberOfCoins){
        if (coinValue > 0.0){ this.coinValue = coinValue ;}
        if (numberOfCoins > 0){this.numberOfCoins = numberOfCoins;}
        totalBankNoteValue = 0.0;
        return;
    }

}
