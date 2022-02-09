package Kasidate.TicketMachine;

public class TicketMachine {
    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;

    TicketMachine(int numberOfTickets){
        this.numberOfTickets = numberOfTickets;
    }

    TicketMachine(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    TicketMachine(double ticketPrice, int numberOfTickets){
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public int getCustomerCoins() {
        return customerCoins;
    }
    public void receiveTicketsFromAdmin(int tickets){
        numberOfTickets += tickets;
    }
    public int giveAllCoinsToAdmin(){
        int giveCoin = numberOfCoins;
        numberOfCoins = 0;
        return giveCoin;
    }
    public void receiveCoinsFromCustomer(int coins){
        customerCoins += coins;
    }
    public int sellTicketsToCustomer(int tickets) {
        if ( tickets > numberOfTickets )
            return -1;
        int ticketCost = (int) Math.ceil(ticketPrice * tickets);
        if (customerCoins < ticketCost) return -2;
        numberOfTickets -= tickets;
        numberOfCoins += ticketCost;
        customerCoins -= ticketCost;
        return returnCoinsToCustomer();

    }
    public int returnCoinsToCustomer(){
        int oneCoin = customerCoins;
        customerCoins = 0;
        return oneCoin;
    }


    @Override
    public String toString() {
        return "TicketMachine{" +
                "ticketPrice=" + ticketPrice +
                ", " + numberOfTickets +
                " Tickets," + numberOfCoins +
                " Coin , customer " + customerCoins +
                " Coin}";
    }
}
