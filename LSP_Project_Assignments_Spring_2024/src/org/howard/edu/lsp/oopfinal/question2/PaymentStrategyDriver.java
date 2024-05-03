package org.howard.edu.lsp.oopfinal.question2;

// PaymentStrategyDriver class
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Creating instances of payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        // Creating ShoppingCart instance
        ShoppingCart cart = new ShoppingCart();

        // Setting payment strategy and checking out
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50.0);

        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}
