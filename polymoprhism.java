package polymorphism2;


class Payment {
 void makePayment(double amount) {
     System.out.println("Payment of $" + amount + " is processed using a generic method.");
 }
}

//Subclass 1: CreditCardPayment
class CreditCardPayment extends Payment {
 @Override
 void makePayment(double amount) {
     System.out.println("Payment of $" + amount + " is processed using Credit Card.");
 }
}

//Subclass 2: PayPalPayment
class PayPalPayment extends Payment {
 @Override
 void makePayment(double amount) {
     System.out.println("Payment of $" + amount + " is processed using PayPal.");
 }
}

//Subclass 3: BankTransferPayment
class BankTransferPayment extends Payment {
 @Override
 void makePayment(double amount) {
     System.out.println("Payment of $" + amount + " is processed using Bank Transfer.");
 }
}

public class polymoprhism {
 public static void main(String[] args) {
     // Parent class reference pointing to child class objects
     Payment payment;

     // CreditCardPayment
     payment = new CreditCardPayment();
     payment.makePayment(250.75);

     // PayPalPayment
     payment = new PayPalPayment();
     payment.makePayment(150.50);

     // BankTransferPayment
     payment = new BankTransferPayment();
     payment.makePayment(500.00);
 }
}
