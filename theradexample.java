class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try
             {
               Thread.sleep(1000); 
             } 
            catch (InterruptedException e) 
            {
              //  e.printStackTrace();
            }
        }
    }
}

public class theradexample{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");
        MyThread thread2 = new MyThread();
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
