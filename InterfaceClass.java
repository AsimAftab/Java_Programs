package programs;
interface resizable{
    void resizeWidth(int Width);
    void resizeHeight(int Height);
}
class Rectangle implements resizable
{
    private int Height;
    private int Width;
    Rectangle(int height,int Width)
    {
        this.Height=height;
        this.Width=Width;
    }
    @Override
    public void resizeWidth(int Width) {
        this.Width=Width;
    }
    @Override
    public void resizeHeight(int Height){
        this.Height=Height;
    }
    public void resize()
    {
        System.out.println("Height: "+Height+" Width: "+Width);
    }


}
public class InterfaceClass
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(100,150);
        r.resize();
        r.resizeHeight(50);
        r.resizeWidth(20);
        r.resize();
    }
}
