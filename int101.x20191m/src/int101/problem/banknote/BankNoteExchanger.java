package int101.problem.banknote;

/**
 * เครื่องแลกธนบัตร
 */
public class BankNoteExchanger {
    private double bankNoteValue; // มูลค่าธนบัตร 1 ใบ
    private int numberOfBankNotes; // จำนวนธนบัตรในเครื่อง
    private double totalCoinValue; // มูลค่าของเหรียญทั้งหมดที่มีอยู่ในเครื่อง

    // (1) สร้าง 3 constructors 
    // Constructor 1. รับมูลค่าธนบัตรเข้ามา set ค่า bankNoteValue
    // Constructor 2. รับจำนวนธนบัตรเข้ามา set ค่า numberOfBankNotes
    // Constructor 3. รับทั้งสองค่าเข้ามา คือ bankNoteValue และ numberOfBankNotes ตามลำดับ
    // ค่าใดที่ไม่ได้รับเข้ามา หรือรับเข้ามาแต่มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // numberOfBankNotes มี default เป็น 10
    // bankNoteValue มี default เป็น 1.0
    // totalCoinValue มี default เป็น 0.0

    // (2) มี 3 getters แต่ไม่มี setter

    // (3) @Override toString() method

    // (4) มี method ชื่อ exchangeForCoins(double value, int numbers)
    // คือ method สำหรับรับแลกเหรียญที่มีมูลค่า 1 เหรียญ = value และมีจำนวนเหรียญ = numbers
    // เพื่อแลกเป็นธนบัตรที่มีอยู่ในเครื่อง
    // a) method นี้จะ return -1 ถ้า value หรือ numbers ที่ส่งเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0
    // b) method นี้จะ return -2 ถ้า ไม่สามารถแลกเหรียญเป็นธนบัตรได้พอดี หรือมีจำนวนธนบัตรในเครื่องไม่พอ
    // c) method นี้จะ return จำนวนธนบัตร ที่มีมูลค่ารวม เท่ากับมูลค่าเหรียญทั้งหมดที่ส่งเข้ามา ถ้าสามารถแลกได้ลงตัว
    //
    // ถ้าแลกได้สำเร็จ (คือกรณี c เท่านั้น) method นี้ จะลดจำนวนธนบัตรในเครื่องลง 
    // และเพิ่มมูลค่า totalCoinValue ในเครื่อง ตามหลักการแลกเงิน
    
    // (5) มี method ขื่อ resetTo(double bankNoteValue, int numberOfBankNotes)
    // สำหรับ admin ตั้งค่าระบบใหม่ โดยจะรับค่าทั้งสองมา set ค่าให้กับ 
    // bankNoteValue และ numberOfBankNotes ของเครื่อง ตามค่ารับเข้ามา
    // ถ้าค่าใดที่รับเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // ค่า totalCoinValue จะ reset เป็น 0
}

/* 
(6) เขียน class ชื่อ BankNoteExchangerTest 
โดยมี public static void main(String[] args) เพียง method เดียว
เพื่อทดสอบการทำงานของ BankNoteExchanger ดังนี้
6.1 ทดสอบการสร้าง BankNoteExchanger ด้วย constructor 1 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.2 ทดสอบการสร้าง BankNoteExchanger ด้วย constructor 2 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.3 ทดสอบการสร้าง BankNoteExchanger ด้วย constructor 3 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.4 ทดสอบการเรียกใช้ toString() กับทุก BankNoteExchanger ที่สร้างขึ้นมา
6.5 ทดสอบการเรียกใช้ทุก getters
6.6 ทดสอบการเรียกใช้ exchangeForCoins กับ BankNoteExchanger 1 ตัว 
    ด้วยค่าต่าง ๆ ทั้งที่เป็น +/-/0 และค่าที่ทำให้เกิดการ return ในทุกรูปแบบที่กำหนดข้างต้น
6.7 ทดสอบการเรียกใช้ resetTo กับ BankNoteExchanger 1 ตัว ด้วยค่าต่าง ๆ ทั้งที่เป็น +/-/0
*/