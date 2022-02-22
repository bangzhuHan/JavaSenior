package Thread.BankLock;

public class Test {
    public static void main(String[] args) {
        BanckLock banckLock = new BanckLock();
        Thread t1 = new Thread(banckLock);
        Thread t2 = new Thread(banckLock);
        Thread t3 = new Thread(banckLock);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }

}
