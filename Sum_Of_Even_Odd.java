package Avi_Training;
import java .util.Scanner;
public class Sum_Of_Even_Odd
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        int even = 0 , odd = 0;
        while(num!=0)
        {

            int r = num%10;
            num = num/10;
            if(r % 2 ==0 )
            {
                even+=r;
            }
            else{
                odd+=r;
            }
        }
        System.out.println("sum of even number : " + even);
        System.out.println("sum of odd number : " + odd);


       }
    }

