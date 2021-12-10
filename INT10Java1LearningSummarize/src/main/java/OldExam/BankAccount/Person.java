package OldExam.BankAccount;

public class Person {
    long idCard;
    String firstName;
    String lastName;

    Person(long idCard, String firstName, String lastName){
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getIdCard() {
        return idCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard=" + idCard +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
