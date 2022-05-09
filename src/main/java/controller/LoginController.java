package controller;

import entity.Login;
import services.LoginServices;
import services.LoginServicesImpl;

public class LoginController {
    public void CheckLogin(Login login){
        LoginServices loginServices=new LoginServicesImpl();
        loginServices.checkLogin(login);
    }
    public void SignUp(Login login){
        LoginServices loginServices=new LoginServicesImpl();
        loginServices.signUp(login);
    }
}
