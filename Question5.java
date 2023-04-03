// Q5 - Write a Java program to swap two numbers with the help of a third variable.

public class Question5 
{
    public static void main(String[] args) 
    {
        int x=1, y=2;
        System.out.println("x = "+x+" and y = "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x = "+x+" and y = "+y);
    }
    
}
