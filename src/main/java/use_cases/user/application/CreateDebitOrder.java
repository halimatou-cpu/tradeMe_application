package use_cases.user.application;

import kernel.ApplicationEvent;

public class CreateDebitOrder{
    private final double cardNumber;

    public CreateDebitOrder(double cardNumber){
        this.cardNumber = cardNumber;
    }
}
