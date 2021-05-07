package core.abstracts;

public interface RegisterService {
    void registerToGoogle(String email, String password);

    void loginToGoogle(String email, String password);
}
