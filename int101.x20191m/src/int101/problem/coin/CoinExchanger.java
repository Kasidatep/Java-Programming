package int101.problem.coin;

/**
 * เครื่องแลกเหรียญ
 */
public class CoinExchanger {
    private double coinValue; // มูลค่าเหรียญ 1 เหรียญ
    private int numberOfCoins; // จำนวนเหรียญในเครื่อง
    private double totalBankNoteValue; // มูลค่าของธนบัตรทั้งหมดที่มีอยู่ในเครื่อง

    // (1) สร้าง 3 constructors 
    // Constructor 1. รับมูลค่าเหรียญเข้ามา set ค่า coinValue
    // Constructor 2. รับจำนวนเหรียญเข้ามา set ค่า numberOfCoins
    // Constructor 3. รับทั้งสองค่าเข้ามา คือ coinValue และ numberOfCoins ตามลำดับ
    // ค่าใดที่ไม่ได้รับเข้ามา หรือรับเข้ามาแต่มีค่าน้อยกว่าหรือเท่ากับ 0 จะกำหนดให้เป็นค่า default
    // numberOfCoins มี default เป็น 10
    // coinValue มี default เป็น 1.0
    // totalBankNoteValue มี default เป็น 0.0

    // (2) มี 3 getters แต่ไม่มี setter

    // (3) @Override toString() method

    // (4) มี method ชื่อ exchangeForOneBankNoteOfValue(double value)
    // คือ method สำหรับรับแลกธนบัตร 1 ใบที่มีมูลค่า = value เป็นเหรียญที่เครื่องมี
    // a) method นี้จะ return -1 ถ้า value ที่ส่งเข้ามา น้อยกว่าหรือเท่ากับ 0
    // b) method นี้จะ return -2 ถ้า มีจำนวนเหรียญในเครื่องไม่เพียงพอหรือไม่พอดีกับมูลค่าธนบัตร
    // c) method นี้จะ return จำนวนเหรียญ ที่มีมูลค่ารวม เท่ากับมูลค่าธนบัตร ถ้ามีเหรียญพอให้แลก
    //
    // ถ้าแลกเหรียญได้สำเร็จ (คือกรณี c เท่านั้น) method นี้ จะลดจำนวนเหรียญในเครื่องลง 
    // และเพิ่มมูลค่า totalBankNoteValue ตามหลักการแลกเหรียญ
    
    // (5) มี method ขื่อ resetTo(double coinValue, int numberOfCoins)
    // สำหรับ admin ตั้งค่าระบบใหม่ โดยจะรับค่าทั้งสองมา set ค่าให้กับ 
    // coinValue และ numberOfCoins ของเครื่อง ตามค่ารับเข้ามา
    // ถ้าค่าใดที่รับเข้ามา มีค่าน้อยกว่าหรือเท่ากับ 0 จำกำหนดให้เป็นค่า default
    // ค่า totalBankNoteValue จะ reset เป็น 0
}

/* 
(6) เขียน class ชื่อ CoinExchangerTest 
โดยมี public static void main(String[] args) เพียง method เดียว
เพื่อทดสอบการทำงานของ CoinExchanger ดังนี้
6.1 ทดสอบการสร้าง CoinExchanger ด้วย constructor 1 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.2 ทดสอบการสร้าง CoinExchanger ด้วย constructor 2 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.3 ทดสอบการสร้าง CoinExchanger ด้วย constructor 3 ที่รับค่าต่าง ๆ กัน ทั้งค่าที่เป็น +/-/0
6.4 ทดสอบการเรียกใช้ toString() กับทุก CoinExchanger ที่สร้างขึ้นมา
6.5 ทดสอบการเรียกใช้ทุก getters
6.6 ทดสอบการเรียกใช้ exchangeForOneBankNoteOfValue กับ CoinExchanger 1 ตัว 
    ด้วยค่าต่าง ๆ ทั้งที่เป็น +/-/0 และค่าที่ทำให้เกิดการ return ในทุกรูปแบบที่กำหนดข้างต้น
6.7 ทดสอบการเรียกใช้ resetTo กับ CoinExchanger 1 ตัว ด้วยค่าต่าง ๆ ทั้งที่เป็น +/-/0
*/
