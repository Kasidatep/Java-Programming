package int101.solution.cointest;

import int101.solution.coin.CoinExchanger;

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
public class CoinExchangerTest {

    public static void main(String[] args) {
        testConstructors();
        testOperations();
    }

    private static CoinExchanger constructing(String name, double coinValue) {
        CoinExchanger c = new CoinExchanger(coinValue);
        System.out.println(name + " " + c);
        return c;
    }
    
    private static CoinExchanger constructing(String name, int numberOfCoins) {
        CoinExchanger c = new CoinExchanger(numberOfCoins);
        System.out.println(name + " " + c);
        return c;
    }

    private static CoinExchanger constructing(String name, double coinValue, int numberOfCoins) {
        CoinExchanger c = new CoinExchanger(coinValue, numberOfCoins);
        System.out.println(name + " " + c);
        return c;
    }

    private static void testConstructors() {
        CoinExchanger cV05 = constructing("cV05", 0.5);
        CoinExchanger cV00 = constructing("cV00", 0.0);
        CoinExchanger cV_5 = constructing("cV_5", -5.0);
        CoinExchanger cV25 = constructing("cV25", 2.5);

        CoinExchanger cC03 = constructing("cC03", 3);
        CoinExchanger cC_2 = constructing("cC_2", -2);
        CoinExchanger cC00 = constructing("cC00", 0);
        CoinExchanger cC25 = constructing("cC25", 25);
        
        CoinExchanger cV20C03 = constructing("cV20C03", 2.0, 3);
        CoinExchanger cV30C_4 = constructing("cV30C_4", 3.0, -4);
        CoinExchanger cV00C00 = constructing("cV00C00", 0.0, 0);
        CoinExchanger cV_3C50 = constructing("cV_3C50", -3, 50);
        
    }

    private static void testOperations() {
        CoinExchanger cV05 = constructing("cV05", 0.5);

        System.out.println();
        System.out.println(cV05 + "\n2.75 => " + cV05.exchangeForOneBankNoteOfValue(2.75));
        System.out.println(cV05 + "\n15   => " + cV05.exchangeForOneBankNoteOfValue(15));
        System.out.println(cV05 + "\n3    => " + cV05.exchangeForOneBankNoteOfValue(3));
        System.out.println(cV05 + "\n1.50 => " + cV05.exchangeForOneBankNoteOfValue(1.50));
        System.out.println(cV05 + "\n8.50 => " + cV05.exchangeForOneBankNoteOfValue(8.50));
        System.out.println(cV05 + "\n-2.5 => " + cV05.exchangeForOneBankNoteOfValue(-2.5));
        System.out.println(cV05 + "\n0.25 => " + cV05.exchangeForOneBankNoteOfValue(0.25));
        System.out.println(cV05 + "\n0.75 => " + cV05.exchangeForOneBankNoteOfValue(0.75));
        System.out.println(cV05 + "\n0.50 => " + cV05.exchangeForOneBankNoteOfValue(0.50));
        System.out.println(cV05);
        
        System.out.println("\n" + cV05);
        System.out.println("1.5, 12 => " + cV05.resetTo(1.5, 12));
        System.out.println("-3.0, 8 => " + cV05.resetTo(-3.0, 8));
        System.out.println("4.2, -6 => " + cV05.resetTo(4.2, -6));
        System.out.println("2.0, 7  => " + cV05.resetTo(2.0, 7));
        System.out.println("0.0, -2 => " + cV05.resetTo(0.0, -2));
    }
}
