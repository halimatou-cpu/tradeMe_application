package use_cases.user.application;

import kernel.ApplicationEvent;
import use_cases.user.domain.UserId;

public class CreateUserEvent implements ApplicationEvent {
    private final UserId userId;

    public CreateUserEvent(UserId userId) {
        this.userId = userId;
    }
}
