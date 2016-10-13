package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="BUDGET_ACCOUNTS")   // defines the name of the database table
public class BudgetAccount implements Serializable{
    
    // variables
    @Id                          // defines the primary key for the database
    @Column (name="ACCOUNT_ID") // defines the name of the database column
    private int accountId;
    
    @Column (name="ACCOUNT_NAME") // defines the name of the database column
    private String accountName;
    
    @Column (name="ACCOUNT_DESCRIPTION") // defines the name of the database column
    private String accountDesc;
    
    @Column (name="ACCOUNT_DEPOSIT") // defines the name of the database column
    private double deposit;
    
    @Column (name="ACCOUNT_EXPENSE") // defines the name of the database column
    private double expense;
    
    @Column (name="ACCOUNT_BALANCE") // defines the name of the database column
    private double balance;
    
    @Column (name="ACCOUNT_TRANSACTIONS") // defines the name of the database column
    private ArrayList transactions;
    
    
    // default constructor
    public BudgetAccount() {
        
    }
    
    
    //getters
    public int getAccountId() {
        return accountId;
    }

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
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

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

    // hachCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.accountId;
        hash = 97 * hash + Objects.hashCode(this.accountName);
        hash = 97 * hash + Objects.hashCode(this.accountDesc);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.deposit) ^ (Double.doubleToLongBits(this.deposit) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.expense) ^ (Double.doubleToLongBits(this.expense) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.transactions);
        return hash;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BudgetAccount other = (BudgetAccount) obj;
        if (this.accountId != other.accountId) {
            return false;
        }
        if (Double.doubleToLongBits(this.deposit) != Double.doubleToLongBits(other.deposit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.expense) != Double.doubleToLongBits(other.expense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        if (!Objects.equals(this.accountName, other.accountName)) {
            return false;
        }
        if (!Objects.equals(this.accountDesc, other.accountDesc)) {
            return false;
        }
        if (!Objects.equals(this.transactions, other.transactions)) {
            return false;
        }
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "BudgetAccount{" + "accountId=" + accountId + ", accountName=" + accountName + ", accountDesc=" + accountDesc + ", deposit=" + deposit + ", expense=" + expense + ", balance=" + balance + ", transactions=" + transactions + '}';
    }
    
    
 
}
