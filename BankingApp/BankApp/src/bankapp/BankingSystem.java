/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author joejohnson
 */
import java.util.*;

public class BankingSystem {
    
    public BankingSystem(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    public ArrayList<BankAccount> viewAccounts() {
        return accounts;
    }
    
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    
    public void removeAccount(int i) {
        accounts.remove(i);
    }
    
    public void sortByBalance() {
        Collections.sort(accounts);
    }
    
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
}
