import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main{              public static void main(String args[])    {        FastScanner input = new FastScanner();        int tc = input.nextInt();        while (tc-- > 0) {         int n = input.nextInt();    long a[] = new long[n];    long sum =0;    long mx = Long.MIN_VALUE;        for (int i = 0; i < n; i++) {            a[i] = input.nextLong();            sum+=a[i];            mx = Math.max(mx, a[i]);        }        long k =(long) Math.max(mx, Math.ceil((sum*1.0)/(n-1))) ;//        System.out.println(k);        long ans=Long.MAX_VALUE;        System.out.println(((n-1)*k)-sum);           }    }          static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
