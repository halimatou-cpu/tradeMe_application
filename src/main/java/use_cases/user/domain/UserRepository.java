package use_cases.user.domain;

import kernel.Repository;

import java.util.List;

public interface UserRepository extends Repository<UserId, User> {

    UserId nextIdentity();

    User findById(UserId id);

    void add(User user);

    List<User> findAll();

    List<User> findByCity(String city);
}

