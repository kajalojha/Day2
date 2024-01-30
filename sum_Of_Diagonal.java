package Avi_Training;
import java.util.*;
public class sum_Of_Diagonal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int i = 1;
        while(i<=num)
        {
          int j =1 ;
          int sum =0;
          while(j<=i)
          {
              sum = sum+j;
              System.out.print(j);
              if(j!= i){
                  System.out.print(" + ");
              }
              j++;
          }
            System.out.print(" = ");
            System.out.print(sum);
            System.out.println();
            i++;
        }
    }
}
