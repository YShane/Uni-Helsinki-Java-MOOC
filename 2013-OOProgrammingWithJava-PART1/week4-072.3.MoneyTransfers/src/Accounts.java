
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){
        
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        
        
    }
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A", 100.0); //VERY IMPORTANT: When creating an object, the parameters are given
        Account B = new Account("B", 0.0);   //to a method which then stores them as the said variable useing 'this'
        Account C = new Account("C", 0.0);  //In this case, the method Account
        
        
        Accounts.transfer(A,B,50.0);
        Accounts.transfer(B, C, 25.0);
    }


}
