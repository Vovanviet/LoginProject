package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    public static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
            Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();

        }
        return sessionFactory;
    }
}
