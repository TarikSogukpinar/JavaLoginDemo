package business.abstracts;

import entitites.concrete.User;

public interface UserService {
    boolean register(User user);

    boolean login(User user);
}
