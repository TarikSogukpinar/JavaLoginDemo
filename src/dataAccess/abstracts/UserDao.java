package dataAccess.abstracts;

import entitites.concrete.User;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(User user);
}
