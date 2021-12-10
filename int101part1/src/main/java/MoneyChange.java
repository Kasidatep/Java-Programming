public class MoneyChange {
        static final int NOTE100 = 100;
        static final int NOTE50 = 50;
        static final int NOTE20 = 20;
        static final int COIN10 = 10;      

    public static void main(String[] args) {
        final int note100 = 2;
        final int note50 = 1;
        final int note20 = 5;
        final int coin10 = 3;
        final int coin1 = 4;
        
        int moneyValue = value(note100, note50, note20, coin10, coin1);
        String moneyChange = change(moneyValue);
        
        System.out.println("money value = " + moneyValue);
        System.out.println("money change = " + moneyChange);
    }
    
    /**
     * convert money value to banknotes and coins.
     * This method converts a money value to a string 
     * representing the numbers of each banknote and coin.
     * @param value the value of the money
     * @return the string representing the numbers of each banknote and coin
     */
    public static String change(int value) {
        int note100 = value / NOTE100;
        value %= NOTE100;
        
        int note50 = value / NOTE50;
        value %= NOTE50;
        
        int note20 = value / NOTE20;
        value %= NOTE20;
        
        int coin10 = value / COIN10;
        value %= COIN10;
        
        return note100 + " 100-baht + " + note50 + " 50-baht + "
                + note20 + " 20-baht + " + coin10 + " 10-baht + " 
                        + value + " 1-baht";
    }
    /**
     * compute the values of banknotes and coins.
     * This method computes the baht value from banknotes and coins.
     * @param note100 the numbers of 100-baht banknotes
     * @param note50 the numbers of 50-baht banknotes
     * @param note20 the numbers of 20-baht banknotes
     * @param coin10 the numbers of 10-baht coins
     * @param coin1 the numbers of 1-baht coins
     * @return the value in baht of those banknotes and coins
     */
    public static int value(int note100, int note50, int note20, int coin10, int coin1) {
        return note100 * NOTE100 + note50 * NOTE50 
                + note20 * NOTE20 + coin10 * COIN10 + coin1;
    }
}
