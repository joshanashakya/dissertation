import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Template
{
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String readln() throws IOException
    {
        String line = input.readLine();
        return line;
    }

    public static void main(String[] args) throws IOException
    {

//        test();
        solution();
    }

    public static void test() throws IOException {
        int t = Integer.parseInt(readln());
    }

    public static void solution() throws IOException {
        String [] nm = readln().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int cur = 1;
        while (m > 0) {
            if (m >= cur) {
                m -= cur;
            } else {
                System.out.println(m);
                return;
            }

            if (cur != n) {
                cur++;
            } else {
                cur = 1;
            }
        }
        System.out.println(m);
    }

}

