//      これを翻訳している間、あなたはあなたの人生のいくつかの貴重な瞬間を無駄にしました//  DO something instead of nothing import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Solution {    static PrintWriter fop = new PrintWriter(System.out);        public static void main(String[] args) {        FastScanner fsca = new FastScanner();         int n = fsca.nextInt() ;        int tt = fsca.nextInt() ;        int a[] = fsca.readArray(n) ;        ruffleSort(a);         if (n == 1){            System.out.println(0);            return;        }         long  min= Long.MAX_VALUE ;         for (int i = 2; i <n-2 ; i++) {             long temp = 2L*Math.abs(a[i] - a[n-1]) + 2L *Math.abs(a[i] - a[0]) ;            long cc = Math.max(2L*(a[1] -a[0]) , 2L*(a[n-1] - a[n-2]));            temp -= cc ;            temp += Math.abs(tt - a[i]) ;            min = Math.min(min , temp) ;         }         min = Math.min(min ,  Math.abs(a[0] - a[n-2])  + Math.abs(tt - a[0])    ) ;        min = Math.min(min ,  Math.abs(a[1] - a[n-1])  + Math.abs(tt - a[1])    ) ;        min = Math.min(min , Math.abs(a[n-1] - a[1]) + Math.abs(tt - a[n-1]) ) ;       min = Math.min(min , Math.abs(a[n-2] - a[0]) + Math.abs(tt - a[n-2]) ) ;          System.out.println(min);                fop.flush();        fop.close();      }    /*-----------------------------------------------------------------------------------------------------------------------------------------------*/      static long gcd(long a, long b) {        return (b == 0) ? a : gcd(b, a % b);    }     ;     static int gcd(int a, int b) {        return (b == 0) ? a : gcd(b, a % b);    }      static final Random random = new Random();     static void ruffleSort(int[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n), temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }     static void ruffleSort(long[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n);            long temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }      static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[][] readMat(int n, int m) {            int a[][] = new int[n][m];            for (int i = 0; i < n; i++)                for (int j = 0; j < m; j++)                    a[i][j] = nextInt();            return a;        }         char[][] readCharMat(int n, int m) {            char a[][] = new char[n][m];            for (int i = 0; i < n; i++) {                String s = next();                for (int j = 0; j < m; j++)                    a[i][j] = s.charAt(j);            }            return a;        }          int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }     static void print(int a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }     static void print(long a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }}        