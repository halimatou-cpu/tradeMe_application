package use_cases.user.domain;

import kernel.Entity;

import java.util.Objects;

public final class User implements Entity<UserId> {
    private final UserId id;
    private final String lastname;
    private final String firstname;
    private final UserEmail email;
    private Address address;

    public User(UserId id, String lastname, String firstname, UserEmail email, Address address) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.address = address;
    }

    public UserId getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }

    public void changeAddress(Address address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id)
                && Objects.equals(lastname, user.lastname)
                && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, firstname, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public UserId id() {
        return id;
    }
}
