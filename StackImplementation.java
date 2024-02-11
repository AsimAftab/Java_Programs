package programs;

import java.util.Scanner;

public class StackImplementation {
    static final int STACK_SIZE = 5;

    public static void main(String[] args) {
        int choice, ele, top = -1;
        int[] stack = new int[STACK_SIZE];
        Scanner ip = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit");
            System.out.println("Enter your choice: ");
            choice = ip.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item to be pushed to stack");
                    ele = ip.nextInt();
                    top = push(stack, top, ele);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong Input!");
            }


        }
    }

    private static int push(int[] stack, int top, int item) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow");
            return top;
        }
        stack[++top] = item;
        return top;
    }

    private static int pop(int[] stack, int top)
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return top;
        }
        System.out.println("The element which is popped from stack is: "+stack[top--]);
        return top;
    }
    private static void display(int[] stack,int top)
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }
}
