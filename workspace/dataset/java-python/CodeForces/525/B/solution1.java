  import java.io.*;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Main1 {     static class pair implements Comparable<pair>    {        int a;        int b;        public pair(int a,int b)        {            this.a=a;            this.b=b;        }        @Override        public int compareTo(pair o) {            // TODO Auto-generated method stub            if(this.a-o.a!=0)                return this.a-o.a;            else                return this.b-o.b;        }      }      public static void main(String[] args) {         try {              FastScanner in = new FastScanner();            PrintWriter out = new PrintWriter(System.out);            char A[] = in.next().toCharArray() ;           int n = A.length ;           int dp[] = new int[n] ;           int q = in.nextInt() ;            while (q-- >0 )                dp[in.nextInt()-1]++ ;             for (int i = 0; i < n/2 ; i++) {                 if (dp[i]%2 != 0){                    char curr = A[i] ;                    A[i] = A[n-i-1] ;                    A[n-i-1] = curr ;                }                dp[i+1] += dp[i] ;            }            System.out.println(new String(A));                                out.flush();            out.close();          } catch (Exception e) {            return;        }      }               static int gcd(int a, int b) {                if (b > a) {                    int tenp = b;                    b = a;                    a = tenp;                }                int temp = 0;                while (b != 0) {                    a %= b;                    temp = b;                    b = a;                    a = temp;                }                return a;            }             static long gcd_long(long a, long b) {                if (b > a) {                    long tenp = b;                    b = a;                    a = tenp;                }                long temp = 0;                while (b != 0) {                    a %= b;                    temp = b;                    b = a;                    a = temp;                }                return a;            }                  static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }          long nextLong() {            return Long.parseLong(next());        }    }  }        
