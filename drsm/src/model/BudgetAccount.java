package model;

import java.io.Serializable;
import java.util.ArrayList;

public class BudgetAccount implements Serializable{
    
    // variables
    private String accountName;
    private String accountDesc;
    private double deposit;
    private double expense;
    private double balance;
    private ArrayList transactions;
    
    
    // default constructor
    public BudgetAccount() {
        
    }
    
    
    //getters
    public String getAccountName() {
        return accountName;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getExpense() {
        return expense;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList getTransactions() {
        return transactions;
    }
    
    // setters
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }
 
}
