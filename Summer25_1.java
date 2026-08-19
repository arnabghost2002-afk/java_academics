abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    void display() {
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;
    String cardHolderName;

    CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    void processPayment() {
        double charge = 20;
        System.out.println("Credit Card Charge: " + charge);
    }

    @Override
    void display() {
        System.out.println("Credit Card Payment");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: " + amount);
        processPayment();
        System.out.println();
    }
}

class MobilePayment extends Payment {
    String mobileNumber;
    String provider;

    MobilePayment(double amount, String mobileNumber, String provider) {
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    void processPayment() {
        double charge = 10;
        System.out.println("Mobile Charge: " + charge);
    }

    @Override
    void display() {
        System.out.println("Mobile Payment");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Provider: " + provider);
        System.out.println("Amount: " + amount);
        processPayment();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Payment[] payments = new Payment[2];

        payments[0] = new CreditCardPayment(
            1000, "12345", "Arnab"
        );

        payments[1] = new MobilePayment(
            2000, "01712345678", "bKash"
        );

        for (Payment p : payments) {
            p.display();
        }
    }
}
