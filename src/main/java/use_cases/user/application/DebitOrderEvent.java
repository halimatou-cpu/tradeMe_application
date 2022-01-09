package use_cases.user.application;

import kernel.ApplicationEvent;

import java.util.Date;

public class DebitOrderEvent implements ApplicationEvent {
    public Date debitDate;

    public DebitOrderEvent(){
        this.debitDate = new Date();
    }
}
