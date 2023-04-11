import java.util.*;;
public class Question1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String n = sc.next();
        int roll = sc.nextInt();
        String interest = sc.next();

        System.out.println("Name: "+ name+" "+n+
        "\nRoll Number: "+roll+
        "\nField of interest: "+interest);
        sc.close();
    }
}