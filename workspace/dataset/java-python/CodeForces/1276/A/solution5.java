 import java.io.*;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Main1 {         public static void main(String[] args) {         try {              FastScanner in = new FastScanner();            PrintWriter out = new PrintWriter(System.out);              int t = in.nextInt() ;            while (t-- > 0){                int ct = 0 ;                char A[] = in.next().toCharArray() ;                 StringBuilder sb = new StringBuilder() ;                 for (int i=4; i<A.length; i++) {                    if (A[i-4]=='t' && A[i-3]=='w' && A[i-2]=='o' && A[i-1]=='n' && A[i] =='e') {                        A[i-2] = 'X';                        sb.append((i-1) + " ") ;                        ct++;                    }                }                for (int i=2; i<A.length; i++) {                    if ((A[i - 2] == 't' && A[i - 1] == 'w' && A[i] == 'o') || (A[i - 2] == 'o' && A[i - 1] == 'n' && A[i] == 'e')) {                        A[i - 1] = 'X';                        ct++;                        sb.append((i) + " ") ;                    }                }                 System.out.println(ct);                System.out.println(sb);                     }                                 out.flush();            out.close();          } catch (Exception e) {            return;        }      }       static int gcd(int a, int b) {        if (b > a) {            int tenp = b;            b = a;            a = tenp;        }        int temp = 0;        while (b != 0) {            a %= b;            temp = b;            b = a;            a = temp;        }        return a;    }     static long gcd_long(long a, long b) {        if (b > a) {            long tenp = b;            b = a;            a = tenp;        }        long temp = 0;        while (b != 0) {            a %= b;            temp = b;            b = a;            a = temp;        }        return a;    }                  static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }          long nextLong() {            return Long.parseLong(next());        }    }  }       
