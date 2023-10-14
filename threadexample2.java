class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
             System.out.println(Thread.currentThread().getName() + " : " + i);                     

        }
    }
}
public class threadexample2
  {
     public static void main(String ar[])
     {
        MyThread thread1=new MyThread();
        thread1.setName("Praveen");
        MyThread thread2=new MyThread();
        thread2.setName("hari");


        thread1.start();
        thread2.start();
     }
  }
