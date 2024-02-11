package programs;
class Shape
{
    public void draw()
    {
        System.out.println("Drawing a shape");

    }
    public void erase()
    {
        System.out.println("Erasing a Shape");

    }
    public void call()
    {
        draw();
        erase();
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Circle");

    }
    public void erase()
    {
        System.out.println("Erasing a Circle");

    }
    public void call()
    {
        draw();
        erase();
    }
}
class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Triangle");

    }
    public void erase()
    {
        System.out.println("Erasing a Triangle");

    }
    public void call()
    {
        draw();
        erase();
    }
}
class Square extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Square");

    }
    public void erase()
    {
        System.out.println("Erasing a Square");

    }
    public void call()
    {
        draw();
        erase();
    }
}
public class ShapeInheritance {
    public static void main(String[] args) {
        Shape sh=new Shape();
        Circle c = new Circle();
        Triangle t=new Triangle();
        Square sq= new Square();
        sh.draw();
        sh.erase();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        sq.draw();
        sq.erase();
        System.out.println("Alternative Faster Method");
        sh.call();
        c.call();
        t.call();
        sq.call();


    }
}
