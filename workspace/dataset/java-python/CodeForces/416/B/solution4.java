import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String[] args)    {        FastScanner input = new FastScanner();        int pictures = input.nextInt();       int painters = input.nextInt();       int a[][] = new int[pictures+1][painters+1];        for (int i = 1; i <=pictures; i++) {            for (int j = 1; j <=painters; j++) {                a[i][j] =Math.max(a[i][j-1], a[i-1][j])+ input.nextInt();                            }        }               for (int i = 1; i <=pictures; i++) {            System.out.print(a[i][painters]+" ");        }        System.out.println("");    }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
