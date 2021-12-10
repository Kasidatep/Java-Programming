package int101.solution.banknote;

/**
 * เครื่องแลกธนบัตร
 */
public class BankNoteExchanger {
    private double bankNoteValue = 1.0; // มูลค่าธนบัตร 1 ใบ
    private int numberOfBankNotes = 10; // จำนวนธนบัตรในเครื่อง
    private double totalCoinValue; // มูลค่าของเหรียญทั้งหมดที่มีอยู่ในเครื่อง

    // (1) สร้าง 3 constructors 
    // Constructor 1. รับมูลค่าธนบัตรเข้ามา set ค่า bankNoteValue
    // Constructor 2. รับจำนวนธนบัตรเข้ามา set ค่า numberOfBankNotes
    // Constructor 3. รับทั้งสองค่าเข้ามา คือ bankNoteValue และ numberOfBankNotes ตามลำดับ
    // ค่าใดที่ไม่ได้รับเข้ามา หรือรับเข้ามาแต่มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // bankNoteValue มี default เป็น 1.0
    // numberOfBankNotes มี default เป็น 10
    // totalCoinValue มี default เป็น 0.0

    public BankNoteExchanger(double bankNoteValue) {
        if (bankNoteValue > 0.0) this.bankNoteValue = bankNoteValue;
    }

    public BankNoteExchanger(int numberOfBankNotes) {
        if (numberOfBankNotes > 0) this.numberOfBankNotes = numberOfBankNotes;
    }

    public BankNoteExchanger(double bankNoteValue, int numberOfBankNotes) {
        if (bankNoteValue > 0.0) this.bankNoteValue = bankNoteValue;
        if (numberOfBankNotes > 0) this.numberOfBankNotes = numberOfBankNotes;
    }

    // (2) มี 3 getters แต่ไม่มี setter
    public double getBankNoteValue() { return bankNoteValue; }
    public int getNumberOfBankNotes() { return numberOfBankNotes; }
    public double getTotalCoinValue() { return totalCoinValue; }

    // (3) @Override toString() method
    @Override
    public String toString() {
        return "BankNoteExchanger{" + "bankNoteValue=" + bankNoteValue 
                + ", numberOfBankNotes=" + numberOfBankNotes 
                + ", totalCoinValue=" + totalCoinValue + '}';
    }

    // (4) มี method ชื่อ exchangeForCoins(double value, int numbers)
    // คือ method สำหรับรับแลกเหรียญที่มีมูลค่า 1 เหรียญ = value และมีจำนวนเหรียญ = numbers
    // เพื่อแลกเป็นธนบัตรที่มีอยู่ในเครื่อง
    // a) method นี้จะ return -1 ถ้า value หรือ numbers ที่ส่งเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0
    // b) method นี้จะ return -2 ถ้า ไม่สามารถแลกเหรียญเป็นธนบัตรได้พอดี หรือมีจำนวนธนบัตรในเครื่องไม่พอ
    // c) method นี้จะ return จำนวนธนบัตร ที่มีมูลค่ารวม เท่ากับมูลค่าเหรียญทั้งหมดที่ส่งเข้ามา ถ้าสามารถแลกได้ลงตัว
    // ถ้าแลกได้สำเร็จ (คือกรณี c เท่านั้น) method นี้ จะลดจำนวนธนบัตรในเครื่องลง 
    // และเพิ่มมูลค่า totalCoinValue ในเครื่อง ตามหลักการแลกเงิน
    public int exchangeForCoins(double value, int numbers) {
        if (value <= 0.0 || numbers <= 0) return -1;
        double amount = value * numbers; // amount = มูลค่าเงินที่ลูกค้าใส่เข้ามาในเครื่องในครั้งนี้
        if (amount % bankNoteValue != 0) return -2; // แปลงมูลค่าเงินเป็นธนบัตรได้พอดีหรือไม่
        int result = (int) (amount / bankNoteValue); // แปลงมูลค่าเงินเป็นธนบัตรได้กี่ใบ
        if (result > numberOfBankNotes) return -2; // เกินจำนวนธนบัตรที่มีอยู่ในเครื่องหรือไม่
        numberOfBankNotes -= result;
        totalCoinValue += amount;
        return result;
    }
    
    // (5) มี method ขื่อ resetTo(double bankNoteValue, int numberOfBankNotes)
    // สำหรับ admin ตั้งค่าระบบใหม่ โดยจะรับค่าทั้งสองมา set ค่าให้กับ 
    // bankNoteValue และ numberOfBankNotes ของเครื่อง ตามค่ารับเข้ามา
    // ถ้าค่าใดที่รับเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // ค่า totalCoinValue จะ reset เป็น 0
    public BankNoteExchanger resetTo(double bankNoteValue, int numberOfBankNotes) {
        this.bankNoteValue = bankNoteValue > 0.0 ? bankNoteValue : 1.0;
        this.numberOfBankNotes = numberOfBankNotes > 0 ? numberOfBankNotes : 10;
        totalCoinValue = 0.0;
        return this;
    }

}
