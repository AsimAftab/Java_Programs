package programs;
class Mythread implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"i is "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Thread t1=new Thread(mythread);
        Thread t2=new Thread(mythread);
        Thread t3=new Thread(mythread);
        t1.start();
        t2.start();
        t3.start();
    }
}
