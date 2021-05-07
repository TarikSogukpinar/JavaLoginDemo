package core.concrete;

import core.abstracts.RegisterService;

public class GoogleRegisterAdapter implements RegisterService {
    @Override
    public void registerToGoogle(String email, String password) {
        System.out.println("Google ile kayit olma basarili: "+email);

    }

    @Override
    public void loginToGoogle(String email, String password) {
        System.out.println("Giris basarili: "+email);
    }
}
