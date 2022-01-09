package use_cases.user.application;

import kernel.EventListener;

public class RenewDebitOrderListener implements EventListener<RenewDebitOrderEvent> {
    @Override
    public void listenTo(RenewDebitOrderEvent event) {
        System.out.print("listening RenewDebitOrderEvent");
    }
}
