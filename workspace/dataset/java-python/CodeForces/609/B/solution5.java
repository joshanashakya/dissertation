import java.io.*;  import java.util.*;    public class Main {    public static Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in), 640000));    public static PrintWriter out = new PrintWriter(System.out);          public static void solve()throws Exception{       int n = in.nextInt() ;       int m = in.nextInt() ;       int freq[]= new int[m];        long totalBooks = 0 ;       for(int i = 0 ; i < n; ++i){           freq[in.nextInt() - 1]++;           totalBooks++ ;       }         long ans = (totalBooks *( totalBooks- 1)) / 2;        for(int i = 0; i < m; ++i){           ans -= ((long)freq[i] * (freq[i] - 1)) /2 ;       }        out.println(ans);    }     public static void main(String args[]) throws Exception{         solve();        out.close();    }}     