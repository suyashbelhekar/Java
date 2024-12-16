import java.util.Scanner;
public class Voting
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("age is "+age);
        if(age>18)
        {
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("you are minor");
        }
        
    }
}