
package controller;

import java.util.ArrayList;
import java.util.List;
import model.BudgetAccount;
import model.Deposits;
import model.Expenses;
import model.HibernateInterface;
import view.AddDepositView;
import view.AddExpenseView;
import view.CheckBalanceView;
import view.CreateAccountView;
import view.UpdateAccountView;




public class AccountManager {
    
    private ArrayList accounts;
    BudgetAccount bAccounts = new BudgetAccount();
    Deposits deposit = new Deposits();
    Expenses expense =  new Expenses();
    CreateAccountView createAccount = new CreateAccountView();
    UpdateAccountView updateAccount = new UpdateAccountView();
    AddDepositView addDepositView = new AddDepositView();
    AddExpenseView addExpenseView = new AddExpenseView();
    CheckBalanceView checkBalanceView = new CheckBalanceView();
    HibernateInterface hib = new HibernateInterface();

    
    
    // class methods
    public void createAccount(){
        createAccount.createAccount(bAccounts);
//        hib.updateAccount(bAccounts);
    }
    
    public void updateAccounts() {
        updateAccount.updateAccount(updateAccount);
    }

    public void addDepositV() {
        String account = addDepositView.chooseDeposit();
        double depositAmount = addDepositView.depositAmount();
        this.commitDeposit(account, depositAmount);
    }
    
    public void addExpenseV() {
        String account = addExpenseView.chooseExpense();
        double depositAmount = addExpenseView.expenseAmount();
        this.commitExpense(account, depositAmount);
    }
    
        public void commitDeposit(String account, double dep) {
        int primID = hib.getOneAccount(account);
        BudgetAccount acc = hib.getAccountsById(primID);
        hib.addDeposit(acc, dep);
    }
    
    public void commitExpense(String account, double exp) {
        int primID = hib.getOneAccount(account);
        BudgetAccount acc = hib.getAccountsById(primID);
        hib.addExpense(acc, exp);
    }

    public void checkBalanceV() {
        checkBalanceView.checkBalances();
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
