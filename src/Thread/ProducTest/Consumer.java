package Thread.ProducTest;

 class Consumer extends Thread{
     private Clerk clerk;
     public Consumer(Clerk clerk){
         this.clerk = clerk;
     }

     @Override
     public void run() {
         System.out.println("开始消费产品...");
         while(true){
             try {
                 Thread.sleep(20);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             clerk.consumeProduct();
         }
     }
 }
