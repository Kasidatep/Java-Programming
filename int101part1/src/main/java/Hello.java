
public class Hello {
    private static String firstStatement; // firstStatement is shared among all instances of this class
    private String greetingMessage; // each object has its own version of greetingMessage
    
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();

        h1.setGreetingMessage("Sawaddee");
        h1.setFirstStatement("How are you?"); // set the value that shares among all instances

        h2.setGreetingMessage("Good morning");
        h2.setFirstStatement("Sabuy Dee Mai?"); // set the value that shares among all instances

        System.out.println("h1: " + h1.getGreetingMessage() + ", " + h1.getFirstStatement());
        System.out.println("h2: " + h2.getGreetingMessage() + ", " + h2.getFirstStatement());
        
        System.out.println(h1);
        System.out.println(h2);
    }
    
    public static void setFirstStatement(String statement) { firstStatement = statement; }
    public static String getFirstStatement() { return firstStatement; }
    
    public void setGreetingMessage(String greet) { greetingMessage = greet; } // setter
    public String getGreetingMessage() { return greetingMessage; } // getter
    
    @Override
    public String toString() { return getGreetingMessage() + ", " + getFirstStatement(); }
}
