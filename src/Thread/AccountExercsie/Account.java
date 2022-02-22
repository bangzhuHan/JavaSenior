package Thread.AccountExercsie;

public class Account  {
    private double balance = 0; //共享数据

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱
    public synchronized void deposit(double amt){//synchronized要加载void前
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额为:" + balance);
        }

    }
    //另一种方式



}

