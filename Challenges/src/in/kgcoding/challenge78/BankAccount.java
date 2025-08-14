package in.kgcoding.challenge78;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.printf("Hello %s, Your money is successfully withdrawn.\nRemaining balance in your account is %f\n",this.accountHolderName,this.balance);
        } else {
            System.out.println("No sufficient balance in your account");
        }
    }
        public void deposit(double amount){
           if(amount>=100){
               this.balance=this.balance+amount;
               System.out.printf("Your money is successfully deposited\nTotal balance in your account is: %f\n",this.balance);
        }
           else{
               System.out.println("Deposit amount should be greater than or equal to 100");
           }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bank of Chakresh: ");
        BankAccount acc1=new BankAccount(12345,"Chakresh Doddi",50000);
        acc1.withdraw(10500);
        acc1.withdraw(39500);
        acc1.withdraw(100);
    }
}
