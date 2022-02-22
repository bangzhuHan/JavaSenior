package Thread.AccountExercsie;

public class Test {
    public static void main(String[] args) {
         Account account = new Account(0);
         Customer c1 = new Customer(account);
         Customer c2 = new Customer(account);
         Thread thread1 = new Thread(c1);
         Thread thread2 = new Thread(c2);
         thread1.setName("甲");
         thread2.setName("乙");
         thread1.start();
         thread2.start();
    }
}
