import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str=sc.next();
            sc.close();
            if(str.length()<=7)
                System.out.println("NO");
            else{
                String check1="1111111";
                String check2="0000000";
                if(str.contains(check1) || str.contains(check2))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        } catch (Exception e) {
            return;
        }
    }
}

