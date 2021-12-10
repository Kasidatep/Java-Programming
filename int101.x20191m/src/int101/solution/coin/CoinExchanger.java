package int101.solution.coin;

/**
 * เครื่องแลกเหรียญ
 */
public class CoinExchanger {
    private double coinValue = 1.0; // มูลค่าเหรียญ 1 เหรียญ
    private int numberOfCoins = 10; // จำนวนเหรียญในเครื่อง
    private double totalBankNoteValue; // มูลค่าของธนบัตรทั้งหมดที่มีอยู่ในเครื่อง

    // (1) สร้าง 3 constructors 
    // Constructor 1. รับมูลค่าเหรียญเข้ามา set ค่า coinValue
    // Constructor 2. รับจำนวนเหรียญเข้ามา set ค่า numberOfCoins
    // Constructor 3. รับทั้งสองค่าเข้ามา คือ coinValue และ numberOfCoins ตามลำดับ
    // ค่าใดที่ไม่ได้รับเข้ามา หรือรับเข้ามาแต่มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // numberOfCoins มี default เป็น 10
    // coinValue มี default เป็น 1.0
    // totalBankNoteValue มี default เป็น 0.0

    public CoinExchanger(double coinValue) {
        if (coinValue > 0.0) this.coinValue = coinValue;
    }

    public CoinExchanger(int numberOfCoins) {
        if (numberOfCoins > 0) this.numberOfCoins = numberOfCoins;
    }

    public CoinExchanger(double coinValue, int numberOfCoins) {
        if (coinValue > 0.0) this.coinValue = coinValue;
        if (numberOfCoins > 0) this.numberOfCoins = numberOfCoins;
    }

    // (2) มี 3 getters แต่ไม่มี setter
    public double getCoinValue() { return coinValue; }
    public int getNumberOfCoins() { return numberOfCoins; }
    public double getTotalBankNoteValue() { return totalBankNoteValue; }

    // (3) @Override toString() method
    @Override
    public String toString() {
        return "CoinExchanger{" + "coinValue=" + coinValue 
                + ", numberOfCoins=" + numberOfCoins 
                + ", totalBankNoteValue=" + totalBankNoteValue + '}';
    }

    // (4) มี method ชื่อ exchangeForOneBankNoteOfValue(double value)
    // คือ method สำหรับรับแลกธนบัตร 1 ใบที่มีมูลค่า = value เป็นเหรียญที่เครื่องมี
    // a) method นี้จะ return -1 ถ้า value ที่ส่งเข้ามา น้อยกว่าหรือเท่ากับ 0
    // b) method นี้จะ return -2 ถ้า มีจำนวนเหรียญในเครื่องไม่เพียงพอหรือไม่พอดีกับมูลค่าธนบัตร
    // c) method นี้จะ return จำนวนเหรียญ ที่มีมูลค่ารวม เท่ากับมูลค่าธนบัตร ถ้ามีเหรียญพอให้แลก
    // ถ้าแลกเหรียญได้สำเร็จ (คือกรณี c เท่านั้น) method นี้ จะลดจำนวนเหรียญในเครื่องลง 
    // และเพิ่มมูลค่า totalBankNoteValue ตามหลักการแลกเหรียญ
    public int exchangeForOneBankNoteOfValue(double value) {
        if (value <= 0.0) return -1;
        if (value % coinValue != 0) return -2;
        int change = (int) (value / coinValue);
        if (change > numberOfCoins) return -2;
        numberOfCoins -= change;
        totalBankNoteValue += value;
        return change;
    }
    
    // (5) มี method ขื่อ resetTo(double coinValue, int numberOfCoins)
    // สำหรับ admin ตั้งค่าระบบใหม่ โดยจะรับค่าทั้งสองมา set ค่าให้กับ 
    // coinValue และ numberOfCoins ของเครื่อง ตามค่ารับเข้ามา
    // ถ้าค่าใดที่รับเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // ค่า totalBankNoteValue จะ reset เป็น 0.0
    public CoinExchanger resetTo(double coinValue, int numberOfCoins) {
        this.coinValue = coinValue > 0.0 ? coinValue : 1.0;
        this.numberOfCoins = numberOfCoins > 0 ? numberOfCoins : 10;
        totalBankNoteValue = 0.0;
        return this;
    }
}
