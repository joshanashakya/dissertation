//package codechef;

import java.util.*;
import java.io.*;
public class CodeChef
{
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int fact(int n)
    {
        int fact = 1;
        for(int i = 1; i<=n; i++) fact*=i;
        return fact;
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]); 
            int count = 0;
            for(int i = 0; i<n-1; i++)
            {
                String st = br.readLine();
                if(st.charAt(m-1)=='R') count++;
            }
            String st = br.readLine();
            for(int i = 0; i<m; i++)
            {
                if(st.charAt(i)=='D') count++;
            }
            System.out.println(count);
        }
    }
}
