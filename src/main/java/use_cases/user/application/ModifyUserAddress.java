package use_cases.user.application;

import kernel.Command;
import use_cases.user.exposition.AddressResponse;

public class ModifyUserAddress implements Command {
    public final int userId;
    public final AddressResponse address;

    public ModifyUserAddress(int userId, AddressResponse address) {
        this.userId = userId;
        this.address = address;
    }
}
