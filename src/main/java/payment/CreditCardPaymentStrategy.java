package payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public void pay(double price) {
        System.out.println("Card payment completed! ( -" + price + "$ )");
    }
}
