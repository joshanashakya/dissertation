import java.io.BufferedReader;import java.io.File;import java.io.FileWriter;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String args[])    {        FastScanner input = new FastScanner();        int n = input.nextInt();        int k = input.nextInt()*2;        int a[] = new int[n*2];        int j=1;        for (int i = 0; i < 2*n; i+=2,j++) {                          a[i]= (j)*2;               a[i+1] = (j)*2-1;        }//        System.out.println(Arrays.toString(a));        int i=2;        int last = 2*n-1;        while(i<=k)        {            int temp  = a[last];            a[last] = a[last-1];            a[last-1] = temp;            i+=2;            last-=2;        }        for (int l : a) {            System.out.print(l+" ");        }        System.out.println("");    }         static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }