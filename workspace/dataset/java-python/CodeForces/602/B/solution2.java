import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String[] args)    {        FastScanner input = new FastScanner();         int n = input.nextInt();        int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();         }        int ans = 1;        int min = Integer.MAX_VALUE;        int max = Integer.MIN_VALUE;        int nextMinIndex = 0;        int nextMaxIndex=0;        int count = 0;        for (int i = 0; i < n; i++) {             if (a[i] <= min) {                nextMinIndex = i;                min = a[i];            }            if(a[i]>=max)            {                nextMaxIndex=i;                max = Math.max(max, a[i]);            }                        if (Math.abs(max - min) <= 1) {                 count++;                ans = Math.max(ans, count);                           } else {                count = 0;                min = Integer.MAX_VALUE;                max = Integer.MIN_VALUE;                i = Math.min(nextMaxIndex, nextMinIndex);            }        }        System.out.println(ans);     }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }