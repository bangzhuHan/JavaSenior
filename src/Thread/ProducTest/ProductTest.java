package Thread.ProducTest;

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(0);
        Producer producer = new Producer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);

        consumer1.setName("消费者1");
        consumer2.setName("消费者2");
        producer.setName("生产者1");


        consumer1.start();
        consumer2.start();
        producer.start();
    }
}
