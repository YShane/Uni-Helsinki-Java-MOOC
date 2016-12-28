/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }
    
    public void payEconomical(){
        double price = 2.50;
        if(balance<price){
            
        }
        else{
            
        
        balance = balance - price;
        }
    }
    
    public void payGourmet(){
        double price = 4.0;
        if(balance < price){
            
        }
        else{
        balance = balance- price;
        }
    }
    public void loadMoney(double amount){
       if(amount>0){ 
        double balance1 = balance + amount;
        if(balance1>150.0){
            
            balance = 150;
        }
        else{
            balance = balance1;
        }
       }
    }
    public String toString() {
          return "The card has " + this.balance + " euros";
    }

}
