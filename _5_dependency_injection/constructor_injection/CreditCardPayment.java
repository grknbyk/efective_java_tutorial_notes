package _5_dependency_injection.constructor_injection;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with credit card.");
    }
}