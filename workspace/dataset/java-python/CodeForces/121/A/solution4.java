import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*; public class Main{     public static void main(String[] args) throws IOException    {        FastScanner input = new FastScanner();        long l = input.nextLong();        long r = input.nextLong();        long store [] = new long[1025];        for (int i = 2; i <=1024 ; i++) {            if(i%2==0)            {                store[i] = 10*store[i/2]+4;                            }            else             {                store[i] = 10*store[i/2]+7;            }        }//        System.out.println(store[1024]);//        System.out.println(Arrays.toString(store));     int c=2;        while(l>store[c])        {            c++;        }           long sum =0;        while(l<=r)        {                        sum+=((Math.min(store[c], r)-l+1)*store[c]);            l= store[c]+1;            c++;                                }        System.out.println(sum);                }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }    } }
