package int101.solution.banknotetest;

import int101.solution.banknote.BankNoteExchanger;

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
public class BankNoteExchangerTest {

    public static void main(String[] args) {
        BankNoteExchanger bV05 = constructing("bV05", 0.5);
        BankNoteExchanger bV00 = constructing("bV00", 0.0);
        BankNoteExchanger bV_5 = constructing("bV_5", -5.0);
        BankNoteExchanger bV25 = constructing("bV25", 2.5);

        BankNoteExchanger bB03 = constructing("bB03", 3);
        BankNoteExchanger bB_2 = constructing("bB_2", -2);
        BankNoteExchanger bB00 = constructing("bB00", 0);
        BankNoteExchanger bB25 = constructing("bB25", 25);
        
        BankNoteExchanger bV20B15 = constructing("bV20B15", 2.0, 15);
        BankNoteExchanger bV30B_4 = constructing("bV30B_4", 3.0, -4);
        BankNoteExchanger bV00B00 = constructing("bV00B00", 0.0, 0);
        BankNoteExchanger bV_3B50 = constructing("bV_3B50", -3, 50);
        
        System.out.println();
        System.out.println(bV20B15 + "\n0.25, 8 => " + bV20B15.exchangeForCoins(0.25, 8));
        System.out.println(bV20B15 + "\n-1.0, 2 => " + bV20B15.exchangeForCoins(-1.0, 2));
        System.out.println(bV20B15 + "\n2.5, -3 => " + bV20B15.exchangeForCoins(2.5, -3));
        System.out.println(bV20B15 + "\n2.5, 4  => " + bV20B15.exchangeForCoins(2.5, 4));
        System.out.println(bV20B15 + "\n1.0,20  => " + bV20B15.exchangeForCoins(1.0, 20));
        System.out.println(bV20B15 + "\n3.0, 6  => " + bV20B15.exchangeForCoins(3.0, 6));
        System.out.println(bV20B15 + "\n0.5, 4  => " + bV20B15.exchangeForCoins(0.5, 4));
        System.out.println(bV20B15);
        
        System.out.println("\n" + bV20B15);
        System.out.println("0.0, 0 => " + bV20B15.resetTo(0.0, 0));
        System.out.println("1.5, 3 => " + bV20B15.resetTo(1.5, 3));
        System.out.println("-0.5,6 => " + bV20B15.resetTo(-0.5, 6));
        System.out.println("2.0,-4 => " + bV20B15.resetTo(2.0, -4));
    }

    private static BankNoteExchanger constructing(String name, double bankNoteValue) {
        BankNoteExchanger c = new BankNoteExchanger(bankNoteValue);
        System.out.println(name + " " + c);
        return c;
    }
    
    private static BankNoteExchanger constructing(String name, int numberOfBankNotes) {
        BankNoteExchanger c = new BankNoteExchanger(numberOfBankNotes);
        System.out.println(name + " " + c);
        return c;
    }

    private static BankNoteExchanger constructing(String name, double bankNoteValue, int numberOfBankNotes) {
        BankNoteExchanger c = new BankNoteExchanger(bankNoteValue, numberOfBankNotes);
        System.out.println(name + " " + c);
        return c;
    }
}
