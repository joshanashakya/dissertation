import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String[] args)    {        FastScanner input = new FastScanner();         int a = input.nextInt();        int b = input.nextInt();        int c = input.nextInt();         if (a >= b && a >= c) {            for (int i = 0; i <=Math.min(b, c) ; i++) {                if(a==((b-i)+(c-i)))                {                    System.out.println((b-i)+" "+i+" "+(c-i));                    return;                }            }            System.out.println("Impossible");                    } else if (b >= a && b >= c) {            for (int i = 0; i <=Math.min(a, c) ; i++) {                if(b==((a-i)+(c-i)))                {                    System.out.println((a-i)+" "+(c-i)+" "+i);                    return;                }            }            System.out.println("Impossible");                    } else if (c >= a && c >= b) {                         for (int i = 0; i <=Math.min(a, b) ; i++) {                if(c==((a-i)+(b-i)))                {                    System.out.println(i+" "+(b-i)+" "+(a-i));                    return;                }            }            System.out.println("Impossible");        }     }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
