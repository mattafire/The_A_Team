
package controller;

import java.util.ArrayList;
import model.BudgetAccount;
import model.Deposits;
import model.Expenses;
import model.HibernateInterface;
import view.AddDepositView;
import view.CreateAccountView;
import view.UpdateAccountView;




public class AccountManager {
    
    private ArrayList accounts;
    BudgetAccount bAccounts = new BudgetAccount();
    Deposits deposit = new Deposits();
    Expenses expense =  new Expenses();
    CreateAccountView createAccount = new CreateAccountView();
    UpdateAccountView updateAccount = new UpdateAccountView();
    AddDepositView addDeposit = new AddDepositView();
    HibernateInterface hib = new HibernateInterface();

    
    
    // class methods
    public void createAccount(){
        createAccount.createAccount(bAccounts);
        hib.updateAccount(bAccounts);
    }
    
    public void updateAccounts() {
        updateAccount.updateAccount(updateAccount);
    }

    public void addDeposit() {
        addDeposit.addDeposit(bAccounts, deposit);
    }
    
    public void deleteAccount() {
        
    }
    
    // getters
    public ArrayList getAccounts() {
        return accounts;
    }

    // setters
    public void setAccounts(ArrayList accounts) {
        this.accounts = accounts;
    }
    
}
