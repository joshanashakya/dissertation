
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main
{
    public static void sort(long a[])
    {
        Random ran = new Random();
        for (int i = 0; i <a.length; i++) {
            int r = ran.nextInt(a.length);
            long temp  = a[r];
            a[r] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }
   
    public static void main(String[] args) throws IOException
    {

        FastScanner input = new FastScanner();
        int n = input.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextLong();
            
        }
        sort(a);
        long c =1;
        while(Math.pow(c, n-1)<=Math.pow(10, 10))
        {
            c++;
        }
//        System.out.println(c);
        long min = Long.MAX_VALUE;
        for (int i = 1; i <=c; i++) {
            long now=0;
            for (int j = 0; j <n; j++) {
                now+= (long) Math.min(min, Math.abs(a[j]-Math.pow(i, j)));
            }
            min = Math.min(min, now);
        }
        System.out.println(min);

    }

    static class FastScanner
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next()
        {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {

            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException
        {
            return br.readLine();
        }
    }

}

