package Thread.AccountExercsie;

public class Customer extends Thread{
    private Account account;
    //private double money ;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            account.deposit(1000);
        }
    }
}
