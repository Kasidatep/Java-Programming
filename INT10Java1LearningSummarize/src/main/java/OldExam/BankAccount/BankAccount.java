package OldExam.BankAccount;

public class BankAccount {
    long accountId;
    Person[] accountOwners;
    double balance;
    int accountOwnerCounting;

    BankAccount( Person[] firstPerson,int numberOfAccountOwners, double balance){
        this.accountId = 00;
        if (accountOwnerCounting > 5){
            this.accountOwners = new Person[5];
        }else {
            this.accountOwners = new Person[numberOfAccountOwners];
            this.accountOwners[numberOfAccountOwners] = null;
            accountOwnerCounting++;
            this.balance = balance;
        }
    }

    public boolean addAccountOwner(long idCard, String fName, String lName){
        if (accountOwnerCounting >= accountOwners.length){
            return false;
        } else {
            accountOwners[accountOwnerCounting] = new Person(idCard,fName,lName);
            accountOwnerCounting++;
            return true;
        }
    }

    public long getAccountId() {
        return accountId;
    }

    public Person[] getAccountOwners() {
        Person temp[]=new Person[accountOwnerCounting];
        for(int index=0;index<accountOwnerCounting;index++){
            temp[index]=accountOwners[index];
        }
        return temp;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount){
        if ( balance < amount || amount <= 0){
            return false;
        } balance -= amount;
        return true;
    }

    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        } balance += amount;
        return true;
    }

    public boolean transfer(BankAccount targetAccount, double amount){
        if (amount >= 0 && balance >= amount){
            withdraw(amount);
            targetAccount.deposit(amount);
            return true;
        }return false;
    }

    @Override
    public String toString() {
        StringBuilder accountString= new StringBuilder(accountId + "\n");
        for(int index=0;index<accountOwnerCounting;index++){
            accountString.append(accountOwners[index]+"\n");

        }
        accountString.append("balance=" + balance+"\n");

        return accountString.toString();
    }

}
