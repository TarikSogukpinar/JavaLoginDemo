package business.concrete;

import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import entitites.concrete.User;


public class UserManager implements UserService {
    UserValidationService userValidationService;


    public UserManager(UserValidationService userValidationService) {
        super();
        this.userValidationService = userValidationService;
    }


    @Override
    public boolean register(User user) {

        if (!userValidationService.registerValidate(user)) {
            return false;
        }

        return true;

    }

    @Override
    public boolean login(User user) {
        if (!userValidationService.loginValidate(user)) {
            return false;
        }

        return true;

    }
}
