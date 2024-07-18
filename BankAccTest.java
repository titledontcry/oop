package lab1_practice;

public class BankAccTest {
    public static void main(String[] args) {
        BankAcc account1 = new BankAcc("Account1");
        
        Date date = new Date(1, 11, 2015);
        BankAcc account2 = new BankAcc("Account2", 500, date);
        
        account1.deposit(1000);
        
        account2.tranfer(account1, 300);
        
        account2.withdraw(300);
        
        System.out.println(account1.getInfo());
        System.out.println("Account1 Balance: " + account1.getBalance());
        
        System.out.println(account2.getInfo());
        System.out.println("Account2 Balance: " + account2.getBalance());
    }
}
