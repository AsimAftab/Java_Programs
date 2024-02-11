package programs;
class ExtendableThreads extends Thread
{
    ExtendableThreads()
    {
        super("Using Thread Class");
        System.out.println("Child Thread: "+this);
        start();
    }
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Exiting Child Thread...");
    }
}
public class ThreadUsingExtendThreadClass {
    public static void main(String[] args)/* throws InterruptedException*/ {
    ExtendableThreads childThread = new ExtendableThreads();
  /*  childThread.join();*/
    try
    {
        for(int k=5;k>0;k--)
        {
            System.out.println("Running Main Thread: "+k);
            Thread.sleep(1000);
        }
    }catch (InterruptedException e)
    {
        System.out.println(e.getMessage());

    }
        System.out.println("Exiting Main Thread");
    }
}
