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

public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Joel Johnson", 8000));
        accounts.add(new BankAccount("James Davis", 1000));
        accounts.add(new BankAccount("Cynthia Bailey", 4000));
        accounts.add(new BankAccount("Lori Gunther", 6500));
        
        BankingSystem customers = new BankingSystem(accounts);
        
        System.out.println("Original List\n");
        for (BankAccount acc : customers.viewAccounts())
         System.out.println(acc.getName() + " " + acc.getBalance());    
        
        customers.sortByBalance();
         System.out.println("\nSorted by Balance: Increasing\n");      
         for (BankAccount acc : customers.viewAccounts())
         System.out.println(acc.getName() + " " + acc.getBalance());  
        
    }
    
}
