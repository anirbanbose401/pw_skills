import java.util.Scanner;
public class Question4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<=x;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
