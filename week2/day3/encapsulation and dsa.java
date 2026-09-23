here it has the code for encapsulation and control methods how to access the privat edayta within the class using that methods like getter and setter 
  public class BankAccount { 
    // Private variable can only be accessed via methods
    private double balance; 

    // Corrected method parameter and logic
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
        } 
    } 

    // Changed return type from void to double
    public double getBalance() { 
        return balance; 
    } 

    public static void main(String[] args) { 
        // Object creation must happen inside a method like main
        BankAccount bank = new BankAccount(); 
        
        // Deposit money using the public method
        bank.deposit(5000); 
        
        // Retrieve and print the balance
        System.out.println(bank.getBalance()); 
    } 
}
