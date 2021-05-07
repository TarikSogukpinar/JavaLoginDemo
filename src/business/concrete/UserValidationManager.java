package business.concrete;

import business.abstracts.UserValidationService;
import entitites.concrete.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationManager implements UserValidationService {

    public static final Pattern Email_Regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

    @Override
    public boolean registerValidate(User user) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());

        if (user.getFirstName().length() < 2 || user.getLastName().length() < 2 || user.getEmail().length() < 2 || user.getPassword().length() < 6) {
            return false;
        }
        if (user.getFirstName() == null || user.getLastName() == null || user.getEmail() == null || user.getPassword() == null) {
            return false;
        }

        if (!matcher.matches()) {
            return false;

        }

        return true;


    }


    @Override
    public boolean loginValidate(User user) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        if (user.getFirstName().length() < 2 || user.getEmail().length() < 2) {

            return false;

        }
        if (user.getFirstName() == null || user.getEmail() == null) {
            return false;
        }
        if (!matcher.matches()) {
            return false;

        }
        return true;
    }
}
