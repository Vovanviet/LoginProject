package view;

import controller.LoginController;
import entity.Login;

import java.util.Scanner;

public class LoginConsole {
    private final Scanner sc;

    public LoginConsole() {
        this.sc = new Scanner(System.in);
    }

    int menu(){
        System.out.println("***********Welcome*************");
        System.out.println("1.Login\n2.Sign Up\n3.Exit ");
        int choice=readInt(1,3);
        return choice;
    }
    int readInt(int min,int max){
        int choice;
        while (true){

            try {
                choice=Integer.parseInt(sc.next());
                if (choice>=min&&choice<=max)break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return choice;
    }
    public void start(){

        while (true){
            int choice=menu();
            switch (choice){
                case 1:
                    LoginView();
                    break;
                case 2:
                    signUpAccount();
                    break;
                case 3:
                    System.out.println("Goodbye,see you again!!!");
                    System.exit(3);
                default:
                    throw new AssertionError();
            }
        }
    }
    private void LoginView(){
        try {
            Login login=new Login();
            System.out.println("Enter username:");
            login.setUsername(sc.next());
            System.out.println("Enter password:");
            login.setPassword(sc.next());
            LoginController loginController=new LoginController();
            loginController.CheckLogin(login);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void signUpAccount(){
        try {
            Login login=new Login();
            System.out.println("Enter name:");
            login.setUsername(sc.next());
            System.out.println("Enter password:");
            login.setPassword(sc.next());
            LoginController loginController=new LoginController();
            loginController.SignUp(login);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
