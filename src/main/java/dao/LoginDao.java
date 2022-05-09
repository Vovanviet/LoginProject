package dao;

import entity.Login;

public interface LoginDao {
    void checkLogin(Login login);
    void createAccount(Login login);
}
