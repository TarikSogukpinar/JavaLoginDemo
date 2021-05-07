public class MenuNav {
    public static void Menu() throws InterruptedException {
        String format = "[Sisteme giriş yapılıyor...]" + "%d%%\r";
        for (int i = 0; i <= 100; i++) {
            System.out.printf(format, i);
            Thread.sleep(25);
        }


        System.out.format("---------------------------------------------------%n");
        System.out.format("| Login System - Lütfen Giriş Yapınız  |%n");
        System.out.format("---------------------------------------------------%n");


    }
}
