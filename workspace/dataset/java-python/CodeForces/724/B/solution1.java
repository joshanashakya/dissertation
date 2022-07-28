//      これを翻訳している間、あなたはあなたの人生のいくつかの貴重な瞬間を無駄にしました  import javax.sound.midi.Sequence;import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Solution {    static PrintWriter fop = new PrintWriter(System.out);     static boolean ok(int [][]a) {        boolean ret = true;        for(int i = 0; i < a.length; ++i) {            ret &= ok(a[i]);        }        return ret;    }    static boolean ok(int []a) {        int c = 0;        for(int i = 0; i < a.length; ++i) {            if (a[i] != i) {                ++c;            }        }        return c <= 2;    }      public static void main(String[] args) {        FastScanner fsca = new FastScanner();            int n = fsca.nextInt() ;          int m = fsca.nextInt() ;          int a[][]= new int[n][m] ;        for (int i = 0; i <n ; i++)            for (int j = 0; j <m ; j++)                a[i][j] = fsca.nextInt()-1;             int dp[][] = new int[n][m] ;        for (int i = 0; i <n ; i++) {            for (int j = 0; j <m ; j++) {                dp[i][a[i][j]] = i ;            }        }         int tt[][] = new int[n][2] ;        for (int i = 0; i <n ; i++) {            int cnt = 0 ;            for (int j = 0; j <m ; j++) {                if (dp[i][j] == i|| dp[i][j] == -100)continue;                else {                    cnt++ ;                    if (cnt == 3){                        System.out.println("NO");                        return;                    }                    int in = dp[i][j] ;                    dp[i][j] = dp[i][in] = -100 ;                    tt[i][cnt-1] = i ;                 }             }        }          for(int i = 0; i < m; ++i) {            for(int j = i; j < m; ++j) {                for(int k = 0; k < n; ++k) {                    int tmp = a[k][i];                    a[k][i] = a[k][j];                    a[k][j] = tmp;                }                if (ok(a)) {                    System.out.println("YES");                    return;                }                for(int k = 0; k < n; ++k) {                    int tmp = a[k][i];                    a[k][i] = a[k][j];                    a[k][j] = tmp;                }            }        }        System.out.println("NO");                        fop.flush();        fop.close();      }    /*-----------------------------------------------------------------------------------------------------------------------------------------------*/    // template starts from here :     static long gcd(long a, long b) {        return (b == 0) ? a : gcd(b, a % b);    }     static int gcd(int a, int b) {        return (b == 0) ? a : gcd(b, a % b);    }      static final Random random = new Random();     static void ruffleSort(int[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n), temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }     static void ruffleSort(long[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n);            long temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }      static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[][] readMat(int n, int m) {            int a[][] = new int[n][m];            for (int i = 0; i < n; i++)                for (int j = 0; j < m; j++)                    a[i][j] = nextInt();            return a;        }        char[][] readCharMat(int n, int m) {            char a[][] = new char[n][m];            for (int i = 0; i < n; i++) {                String s = next();                for (int j = 0; j < m; j++)                    a[i][j] = s.charAt(j) ;            }            return a;        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }     static void print(int a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }     static void print(long a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }}        