package Kasidate;

public class Run {
    public static void main(String[] args) {
        ShuttleBus sb = new ShuttleBus();
        sb.setBusId("B#001");
        sb.lockDoors();
        sb.addPassengers(7);
        sb.go();
        sb.go();
        sb.go();

        sb.resetMoney();
        System.out.println(sb);
    }
}
