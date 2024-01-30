package Avi_Training;

public class unique_Char {
    public static void main(String[] args) {
        String str = "absbcba";
        String g = "";
        int i, j;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch == ch1)
                {
                    count++;
                }
            }
            if(count ==1)
            {
                System.out.println(ch);

            }

        }

    }
}
