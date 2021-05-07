package business.abstracts;

import entitites.concrete.User;

public interface UserValidationService {
    boolean registerValidate(User user);

    boolean loginValidate(User user);
}
