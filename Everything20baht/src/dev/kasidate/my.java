package dev.kasidate;

public class my {
    final double PRODUCTPRICE = 20.00;
    private String customerID;
    private String employeeID = "S0001";
    private double totalPrice;
    private double receive;
    private double change;
    private int point;

    my (String customerID , int product){
        this.customerID = customerID;
        this.totalPrice = product*PRODUCTPRICE;
        this.point = this.point + (product*2);
    }
    public String getProduct() {
        return "คุณมีสินค้าในตระกร้า " + totalPrice/PRODUCTPRICE + " รายการ";
    }
    public String getPoint() {
        return "คุณมีแต้มทั้งหมด " + point + " แต้ม";
    }

    public String setReceive(int receive) {
        this.receive = receive;
        return "รับมา " + receive + " บาท";
    }

    public String getChange() {
        change = receive - totalPrice;
        this.totalPrice = 0.00;
        return "เงินทอนทั้งหมด " + change + " บาท";
    }
    public String additem(){
        this.totalPrice += 20;
        return "สินค้าถูกเพิ่มเป็นจำนวน 1 ชิ้น รามสินค้า " + this.totalPrice/20 + " ชิ้น";
    }
    public String getTotalPrice(){
        return "คุณมีสินค้าทั้งหมด " + this.totalPrice/20 + " ชิ้น ราคารวม " + totalPrice +" บาท" ;
    }
    public String removeitem(){
        this.totalPrice -= 20;
        return "สินค้าถูกนำออกเป็นจำนวน 1 ชิ้น รามเหลือสินค้า " + this.totalPrice/20 + " ชิ้น";
    }
    public String Bill(){
        return "soon";
    }

}