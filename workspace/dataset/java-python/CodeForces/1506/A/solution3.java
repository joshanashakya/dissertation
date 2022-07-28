
import java.util.Scanner;

/**
 * @author z003zp2f
 *
 */
public class StrangeTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        while (testCase > 0)
        {
            String input = sc.next();
            input += sc.nextLine();
            int i = 0;
            String[] split = input.split(" ");
            long m = Long.parseLong(split[i++]);
            long n = Long.parseLong(split[i++]);
            long x = Long.parseLong(split[i]);
            
            long p = x % m == 0 ? x / m : x / m + 1;
            long q = x % m == 0 ? m : x % m;
            
            long y = (q - 1) * n + p;
            System.out.println(y);
            testCase--;
        }
    }
}
