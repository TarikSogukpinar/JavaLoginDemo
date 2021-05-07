
import business.concrete.UserManager;
import business.concrete.UserValidationManager;
import business.constants.Message;
import core.abstracts.RegisterService;
import core.concrete.GoogleRegisterAdapter;
import core.concrete.MailSenderManager;
import entitites.concrete.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager(new UserValidationManager());


        giveMessage(Message.menu1);
        giveMessage(Message.menu2);
        giveMessage(Message.menu3);

        int inputUserAnswer = scanner.nextInt();
        switch (inputUserAnswer) {

            case 1:
                registerMenu(scanner, userManager);
                break;
            case 2:
                loginMenu(scanner, userManager);
                break;
            case 3:
                googleLoginMenu();
                break;
            default:
                giveMessage(Message.youDontHaveChoose);
        }

    }

    private static void googleLoginMenu() {
        RegisterService registerService = new GoogleRegisterAdapter();
        registerService.registerToGoogle("google@google.com", "123456");
        registerService.loginToGoogle("google@google.com", "123456");
    }

    private static void loginMenu(Scanner scanner, UserManager userManager) {
        giveMessage(Message.firstName);
        String firstNameLogin = scanner.next();
        giveMessage(Message.email);
        String emailLogin = scanner.next();
        User user1 = new User(firstNameLogin, emailLogin);
        boolean loginValidate = userManager.login(user1);
        if (loginValidate) {
            giveMessage(Message.loginSuccess);
            MailSenderManager.sendMail(user1);

        } else {
            giveMessage(Message.loginFailed);
        }
    }

    private static void registerMenu(Scanner scanner, UserManager userManager) {
        giveMessage(Message.firstName);
        String firstNameRegister = scanner.next();
        giveMessage(Message.lastName);
        String lastNameRegister = scanner.next();
        giveMessage(Message.email);
        String emailRegister = scanner.next();
        giveMessage(Message.password);
        String passwordRegister = scanner.next();
        User user = new User(firstNameRegister, lastNameRegister, emailRegister, passwordRegister);
        boolean usersRegister = userManager.register(user);
        if (usersRegister) {
            giveMessage(Message.registerSuccess);
            MailSenderManager.confirmMail(user);
        } else {
            giveMessage(Message.registerFailed);
        }
    }

    public static void giveMessage(String msg) {
        System.out.println(msg);
    }
}
