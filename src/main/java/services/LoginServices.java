package services;

import entity.Login;

public interface LoginServices {
    void checkLogin(Login login);
    void signUp(Login login);
}
