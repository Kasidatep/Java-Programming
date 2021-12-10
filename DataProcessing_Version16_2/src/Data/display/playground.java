package Data.display;

public class playground {

    public static void main(String[] args) {
        function();
    }
   public static void function(){
        final int U_COST = 12000;
        final int UNIT_COST = 1200;
        final int ALLLIFEUES = 3000;
        final int MOUNTPERYEAR = 12;
        int fullunit = 124;
        int partunitorfree = 17;
        int totalstudy = 4;
        int nonpay = 1;
        int cost;
        int totalcost;

       System.out.println("ค่าเทอมต่อ 1 เทอม คือ " + U_COST);
       System.out.println("ค่าหน่วยกิต คือ " + UNIT_COST);
       System.out.println("ค่าครองชีพ คือ " + ALLLIFEUES);
       System.out.println("หน่วยกิตรวม " + fullunit + " จ่ายหรือชำระแล้ว " + partunitorfree + " หน่วยกิต");
       cost = U_COST*totalstudy*2;
       System.out.println("ค่าเทอมรวม คือ " + cost);
       totalcost = cost;
       cost = U_COST*nonpay;
       System.out.println("ค่าที่ชำระแล้วรวม คือ " + cost);
       totalcost -= cost;
       System.out.println("ค่าที่ต้องชำระรวม  " + totalcost);
       cost = UNIT_COST*fullunit;
       System.out.println("ค่าหน่วยกิตรวม คือ " + cost);
       totalcost += cost;
       int saveunitcost = cost;
       cost = UNIT_COST*partunitorfree;
       System.out.println("ค่าหน่วยกิตที่ไม่ต้องชำระ คือ " + cost);
       totalcost -= cost;
       saveunitcost -= cost;
       System.out.println("ค่าหน่วยกิตที่ต้องชำระ คือ " + saveunitcost);
       cost = ALLLIFEUES*MOUNTPERYEAR;
       System.out.println("ค่าครองชีพต่อปี คือ " + cost);
       cost *= totalstudy;
       System.out.println("ค่าครองชีพรวม คือ " + cost);
       totalcost += cost;
       System.out.println("รวมค่าใช้จ่ายทั้งหมด คือ " + totalcost);
       System.out.println("-------------------------");
       System.out.println(12000+ 11*1200);
   }
}
