import java.io.*;  import java.util.*;    public class Main {    static PrintWriter out = new PrintWriter(System.out);     public static void solve()throws Exception{       int n = in.nextInt();       int m = in.nextInt() ;       int freq[]= new int[m];        for(int i = 0 ; i < n; ++i)           freq[in.nextInt() - 1]++;          long ans = ((long)n *(n- 1)) / 2;        for(int i = 0; i < m; ++i){           ans -= ((long)freq[i] * (freq[i] - 1)) /2 ;       }        out.println(ans);    }     public static void main(String args[]) throws Exception{        in.init(System.in);        solve();        out.close();    }     public static class in {        static BufferedReader reader;        static StringTokenizer tokenizer;         static void init(InputStream input) {            reader = new BufferedReader(new InputStreamReader(input));            tokenizer = new StringTokenizer("");        }         static String next() throws IOException {            while (!tokenizer.hasMoreTokens())                tokenizer = new StringTokenizer(reader.readLine());            return tokenizer.nextToken();        }         static int nextInt() throws IOException {            return Integer.parseInt(next());        }         static double nextDouble() throws IOException {            return Double.parseDouble(next());        }         static long nextLong() throws IOException {            return Long.parseLong(next());        }    }}       
