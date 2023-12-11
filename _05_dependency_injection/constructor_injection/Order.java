package _5_dependency_injection.constructor_injection;

public class Order {
    private PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
