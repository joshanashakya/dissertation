import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*; public class Main{     public static void main(String[] args) throws IOException    {        FastScanner input = new FastScanner();        int n = input.nextInt();        StringBuilder ans = new StringBuilder();        int current=1;                for (int i = 1; i <n; i++) {            current+=i;            if(current!=n)            {                ans.append(current%n+" ");                 current=current%(n);            }                        else            {                 ans.append(current+" ");            }                                  }        System.out.println(ans);    }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }    } }