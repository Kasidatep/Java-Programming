package MoneyExchanger;

public class MoneyExchanger {
    private double exchangeRate;
    private int foreignUnits;
    private int collectedBaht;
    private int customerBaht;

    MoneyExchanger(int foreignUnits){
        this.foreignUnits = foreignUnits;
    }

    MoneyExchanger(double exchangeRate){
        this.exchangeRate =exchangeRate;
    }

    MoneyExchanger(double exchangeRate, int foreignUnits){
        this.exchangeRate =exchangeRate;
        this.foreignUnits =foreignUnits;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public int getForeignUnits() {
        return foreignUnits;
    }

    public int getCollectedBaht() {
        return collectedBaht;
    }

    public int getCustomerBaht() {
        return customerBaht;
    }

    public void  receiveForeignUnitsFromAdmin(int foreignUnits){
        this.foreignUnits = foreignUnits;
    }
    public int  giveAllCollectedBahtToAdmin() {
        int giveBaht = collectedBaht;
        collectedBaht = 0;
        return  giveBaht;
    }
    public void receiveBahtFromCustomer(int baht){
        collectedBaht = baht;
    }
    public int exchangeToForeignUnitsForCustomer(int foreignUnits) {
        if (this.foreignUnits < foreignUnits) return -1;
        int requiredBaht = (int) Math.ceil(foreignUnits / exchangeRate);
        if (customerBaht < requiredBaht) return -2;
        this.foreignUnits -= foreignUnits;
        collectedBaht += requiredBaht;
        customerBaht -= requiredBaht;
        return returnBahtToCustomer();
    }

    public int returnBahtToCustomer() {
        int returnedBaht = customerBaht;
        customerBaht = 0;
        return returnedBaht;
    }

    @Override
    public String toString() {
        return "MoneyExchanger{" +
                "Rate=" + exchangeRate +
                ", foreign=" + foreignUnits +
                ", collected= " + collectedBaht +
                " Baht, customer=" + customerBaht +
                " Baht}";
    }
}
