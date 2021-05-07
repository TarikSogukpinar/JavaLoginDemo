package core.concrete;

import entitites.concrete.User;

import java.util.Random;

public class MailSenderManager {
    public static void confirmMail(User user) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 7;

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();

        System.out.println("Üyeliğini Doğrulamak için :" + " " + "google.com/:" + randomString);
    }

    public static void sendMail(User user) {
        System.out.println("Mail Gönderildi");
    }

}
