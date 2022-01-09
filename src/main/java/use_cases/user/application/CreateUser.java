package use_cases.user.application;

import kernel.Command;
import use_cases.user.domain.Address;
import use_cases.user.domain.UserEmail;

@SuppressWarnings("all")
public final class CreateUser implements Command {

    public final String lastname;
    public final String firstname;
    public final Address address;
    public final UserEmail email;

    public CreateUser(String lastname, String firstname, Address address, UserEmail email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.email = email;
    }
}
