public class String {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("### [9] Demo of String Reproduction ###");

        // -------------------------------------------------
        // Reproducing a new string from an old one
        // toUpperCase(), toLowerCase(), repeat(), replace()
        String work = "Love is a better Master than Duty."; // -- Albert Einstein
        System.out.println("String [" + work + "]");
        System.out.println("   toUpperCase(): [" + work.toUpperCase() + "]");
        System.out.println("   toLowerCase(): [" + work.toLowerCase() + "]");
        System.out.println("   the original : [" + work + "] does not change");
        String master = "Master";
        String boss = "Boss";
        System.out.printf("[%s] repeat 5 times = [%s]%n", master, master.repeat(5));
        System.out.printf("Replacing [%s] with [%s] =%n   [%s]%n", master, boss, work.replace(master, boss));
        System.out.println("The original does not change\n   [" + work + "]");
    }
}
