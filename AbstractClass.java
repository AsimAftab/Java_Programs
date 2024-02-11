package programs;

import java.util.Scanner;


abstract class demo {
    abstract void input();

    abstract void write();
}

class cir extends demo {
    double area, perimeter, r;

    void input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r = ip.nextInt();
        perimeter = 2 * Math.PI * r;
        area = Math.PI * (r * r);

    }

    void write() {
        System.out.println("Area of Circle:"+area);
        System.out.println("Perimeter of Circle: "+perimeter);
    }

}
class tri extends demo{
    double s,area,perimeter,a,b,c;
    void input()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the sides of triangle(a,b,c): ");
        a=ip.nextInt();
        b=ip.nextInt();
        c=ip.nextInt();
        s=(a+b+c)/2;
        perimeter=a+b+c;
        //Herons Formula for Area of Triangle
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }
    void write()
    {
        System.out.println("Perimeter of Triangle: "+perimeter);
        System.out.println("Area of Triangle: "+area);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        //Create object with reference to Abstract Class
        demo cc = new cir();
        demo tt= new tri();
        cc.input();
        cc.write();
        tt.input();
        tt.write();

    }
}
