package Avi_Training;
import java.util.Scanner;
public class power
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base");
        int base = sc.nextInt();
        System.out.println("Enter the value of power");
        int pow = sc.nextInt();
        int sum =1;
        for(int i =1 ; i<= pow;i++)
        {
            sum = base*sum;
        }
        System.out.println(sum);


    }
}
