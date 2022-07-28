//      これを翻訳している間、あなたはあなたの人生のいくつかの貴重な瞬間を無駄にしました  import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Solution {    static PrintWriter fop = new PrintWriter(System.out);     static int index_counter(int a[] , String s[] , String tt , int max){        int n = a.length ;        int in = 0 ;        int sum = 0 ;        for (int i = 0; i <n ; i++) {            if (s[i].equals(tt))                sum += a[i] ;            if (sum >= max)                return i ;        }        return -1 ;    }        public static void main(String[] args) {         FastScanner fsca = new FastScanner();        int n = fsca.nextInt() ;        String s[] = new String[n] ;        int a[] = new int[n] ;         HashMap<String  , Integer> map = new HashMap<>() ;        for (int i = 0; i <n ; i++) {            s[i] = fsca.next();            a[i] = fsca.nextInt() ;            map.put( s[i] , map.getOrDefault(s[i] , 0) + a[i] ) ;        }        int max = -1 ;        int min_in = 1000000 ;        for (String i : map.keySet()){            max = Math.max(max , map.get(i)) ;        }        String ans = "" ;        for(String i : map.keySet()){            if (map.get(i) == max){                int temp = index_counter(a ,s ,i , max) ;                if (temp < min_in){                    min_in = temp ;                    ans = new String(i) ;                }            }         }        System.out.println(ans);                           fop.flush();        fop.close();      }    /*-----------------------------------------------------------------------------------------------------------------------------------------------*/      static long gcd(long a, long b) {        return (b == 0) ? a : gcd(b, a % b);    }     static int gcd(int a, int b) {        return (b == 0) ? a : gcd(b, a % b);    }      static final Random random = new Random();     static void ruffleSort(int[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n), temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }     static void ruffleSort(long[] a) {        int n = a.length;//shuffle, then sort        for (int i = 0; i < n; i++) {            int oi = random.nextInt(n);            long temp = a[oi];            a[oi] = a[i];            a[i] = temp;        }        Arrays.sort(a);    }      static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[][] readMat(int n, int m) {            int a[][] = new int[n][m];            for (int i = 0; i < n; i++)                for (int j = 0; j < m; j++)                    a[i][j] = nextInt();            return a;        }         char[][] readCharMat(int n, int m) {            char a[][] = new char[n][m];            for (int i = 0; i < n; i++) {                String s = next();                for (int j = 0; j < m; j++)                    a[i][j] = s.charAt(j);            }            return a;        }          int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }     static void print(int a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }     static void print(long a[], int n) {        for (int i = 0; i < n; i++)            fop.append((a[i]) + " ");        // fop.append("\n") ;    }}        