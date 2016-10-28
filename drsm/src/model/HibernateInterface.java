package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateInterface {
    
    
    public void updateAccount(BudgetAccount account) {
    
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
    
    public void updateDeposit(Deposits deposit) {
    
        //create a session factory in hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        //save the account object to the database
        session.save(deposit);
        //commit the transaction to the database
        session.getTransaction().commit();
        //close the session
        session.close();
        
    }
    
        public void updateExpense(Expenses expense) {
    
        //create a session factory in hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        //save the account object to the database
        session.save(expense);
        //commit the transaction to the database
        session.getTransaction().commit();
        //close the session
        session.close();
        
    }
        
    public static void main(String[] args) {
        BudgetAccount account = new BudgetAccount();
        account.setAccountName("travel");
        account.setAccountDesc("This account is used to budget travel for our family");
        account.setBalance(1265.32);
        
        Deposits deposit1 = new Deposits();
        Deposits deposit2 = new Deposits();
        deposit1.setAccount(account);
        deposit1.setDeposit(100.00);
        deposit2.setAccount(account);
        deposit2.setDeposit(859.32);
        
        Expenses expense1 = new Expenses();
        Expenses expense2 = new Expenses();
        expense1.setAccount(account);
        expense1.setExpense(200.00);
        expense2.setAccount(account);
        expense2.setExpense(158.38);
        
        account.getAccountDeposits().add(deposit1);
        account.getAccountDeposits().add(deposit2);
        account.getAccountExpenses().add(expense1);
        account.getAccountExpenses().add(expense2);
        
        //create a session factory in hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //create a session and open a seesion in the session factory
        Session session = sessionFactory.openSession();
        //create a new transaction
        session.beginTransaction();
        //save the account object to the database
        session.save(account);
        session.save(deposit1);
        session.save(deposit2);
        session.save(expense1);
        session.save(expense2);
        //commit the transaction to the database
        session.getTransaction().commit();
        //close the session
        session.close();
    }
    
}
