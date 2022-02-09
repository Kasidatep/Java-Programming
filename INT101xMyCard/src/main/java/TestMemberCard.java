
public class TestMemberCard {
    public static void main(String[] args) {
        MemberCard2 mc2=new MemberCard2(123);
        mc2.buy(100000);
        System.out.println(mc2.redeem());
    }
}
