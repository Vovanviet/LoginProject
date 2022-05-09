package services;

import dao.LoginDao;
import dao.LoginDaoImpl;
import entity.Login;

public class LoginServicesImpl implements LoginServices
{
    @Override
    public void checkLogin(Login login) {
        LoginDao loginDao=new LoginDaoImpl();
        loginDao.checkLogin(login);
    }

    @Override
    public void signUp(Login login) {
        LoginDao loginDao=new LoginDaoImpl();
        loginDao.createAccount(login);
    }

}
