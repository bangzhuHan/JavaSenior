package Thread.ProducTest;
/**
* 线程通信的应用：经典例题：生产者/消费者问题
*
* 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
* 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员
* 会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品
* 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
*
* 分析：
* 1. 是否是多线程问题？是，生产者线程，消费者线程
* 2. 是否有共享数据？是，店员（或产品）
* 3. 如何解决线程的安全问题？同步机制,有三种方法
* 4. 是否涉及线程的通信？是
*
* @author shkstart
* @create 2019-02-15 下午 4:48
 */
public class Clerk {
    private int product;

    public Clerk(int product) {
        this.product = product;
    }

    //消费产品
    public synchronized void consumeProduct() {//监视器为this
        if(product > 0){
            System.out.println(Thread.currentThread().getName() + "--开始消费第" + product-- + "个产品");
            notify();
        }else {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //生产产品
    public synchronized void produceProduct() {

        if(product < 20){
            System.out.println(Thread.currentThread().getName() + "--开始生产第" + ++product + "个产品");
            notifyAll();//唤醒被wait的线程，若有多个线程被wait，就唤醒优先级最高的那个
        }else{
            try{
                wait();//进入阻塞状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
