//https://codeforces.com/problemset/problem/110/A import java.io.*;import java.util.*;  public class Main{    public static void main(String[] args) {        MyScanner sc = new MyScanner();        out = new PrintWriter(new BufferedOutputStream(System.out));              // Start writing your solution here. -------------------------------------        long l = sc.nextLong();         int numLucky = 0;        while(l > 0) {            long dig = l % 10L;            if (dig == 4 || dig == 7) {                numLucky++;            }            l = l / 10;        }        out.println(isNearlyLucky(numLucky) ? "YES" : "NO");        // Stop writing your solution here. -------------------------------------        out.close();    }    public static boolean isNearlyLucky(int n) {        if (n < 4) {            return false;        }        while(n > 0) {            if (n % 10 != 4 && n% 10 != 7)                 {                return false;            }            n = n / 10;        }        return true;    }       /*      int n      = sc.nextInt();        // read input as integer      long k     = sc.nextLong();       // read input as long      double d   = sc.nextDouble();     // read input as double      String str = sc.next();           // read input as String      String s   = sc.nextLine();       // read whole line as String       int result = 3*n;      out.println(result);                    // print via PrintWriter    */                        //-----------PrintWriter for faster output---------------------------------    public static PrintWriter out;          //-----------MyScanner class for faster input----------    public static class MyScanner {        BufferedReader br;        StringTokenizer st;         public MyScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine(){            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }     }    //--------------------------------------------------------}
