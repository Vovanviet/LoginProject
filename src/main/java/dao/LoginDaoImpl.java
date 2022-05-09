package dao;

import entity.Login;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class LoginDaoImpl implements LoginDao{
    @Override
    public void checkLogin(Login login) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query=session.createQuery("select username,password from Login where username=:l_user and password=:l_pass");
            query.setParameter("l_user",login.getUsername());
            query.setParameter("l_pass",login.getPassword());
            session.getTransaction().commit();
            System.out.println("Login Success");

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void createAccount(Login login) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(login);
            session.getTransaction().commit();
            System.out.println(login.getUsername()+"Create success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
