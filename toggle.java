package Avi_Training;

public class toggle
{
    public static void main(String [] args )
    {
        String str = "KaJal#*";
        String g = "";
        for(int i = 0 ;i<str.length() ; i++)
        {
            char ch  = str.charAt(i);
            if(ch>=97 && ch<=122)//  for smaller
            {
                g = g + (char) (ch-32);
            }
            else if(ch>=65 && ch<=90) // for capital
            {
                g = g + (char) (ch+32);
            }
            else{
                g = g+ ch;
            }
        }
        System.out.println(g);
    }
}
