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

public class BankAccount implements Comparable<BankAccount> {
    
    public BankAccount(String aName, int aBalance) {
        name = aName;
        balance = aBalance;
}
    
    public String getName() {
        return name;
    } 
    
    public int getBalance(){
        return balance;
    }
    
    public int compareTo(BankAccount other) {
        if (balance < other.balance) return -1;
        if (balance > other.balance) return 1;
        return 0;
    }
    
   
    private String name;
    private int balance;
    
    
}
