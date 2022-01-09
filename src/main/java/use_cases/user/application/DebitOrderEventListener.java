package use_cases.user.application;

import kernel.EventListener;

public class DebitOrderEventListener implements EventListener<DebitOrderEvent> {

    @Override
    public void listenTo(DebitOrderEvent event) {
        System.out.println("Listening DebitOrderEvent");
    }
}
