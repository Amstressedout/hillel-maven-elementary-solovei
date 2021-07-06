package homework_three.entities;

public class Client {

    private String clientID;
    private String surname;
    private String clientAccountID;
    private double sum;

    public Client(String clientID, String surname, String clientAccountID, double sum) {
        this.clientID = clientID;
        this.surname = surname;
        this.clientAccountID = clientAccountID;
        this.sum = sum;
    }

    public Client() {

    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientAccountID() {
        return clientAccountID;
    }

    public void setClientAccountID(String clientAccountID) {
        this.clientAccountID = clientAccountID;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", surname='" + surname + '\'' +
                ", clientAccountID='" + clientAccountID + '\'' +
                ", sum=" + sum +
                '}';
    }
}
