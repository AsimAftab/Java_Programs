package programs;



class MyException extends Exception
{
    private int ex;
    MyException(int b)
    {
        ex=b;
    }
    public String toString()//Already Present in Exception Class
    {
        return "My Exception: Number is not divided by " + ex;
    }


}

public class ExceptionHandling {
    static int c;

    static void divide(int a,int b) throws MyException
    {
        if(b<=0)
        {
            throw new MyException(b);
        }
            c=a/b;
            System.out.println("Divison:  "+c);
        }



    public static void main(String[] args) {
    try
    {
        divide(10,0);
    }catch (Exception me)
    {
        System.out.println(me);
    }
    finally {
        if(c==0)
        {
            System.out.println("Result: Infinity");
        }
    }
    }
}

