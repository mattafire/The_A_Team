package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateInterface {
    
    
    public void updateDatabase(BudgetAccount account) {
    
        //create a session factory in hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        //save the account object to the database
        session.save(account);
        //commit the transaction to the database
        session.getTransaction().commit();
        //close the session
        session.close();
        
    }
    
}
