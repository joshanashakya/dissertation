//      これを翻訳している間、あなたはあなたの人生のいくつかの貴重な瞬間を無駄にしました// secondThread orz             import java.io.*;        import java.math.BigDecimal;        import java.math.BigInteger;        import java.util.*;        import java.io.BufferedReader;        import java.io.IOException;        import java.io.InputStreamReader;                public class main2 {                    public static void main(String[] args) {                try {                            PrintWriter fop = new PrintWriter(System.out);                    FastScanner fsca = new FastScanner();                      char A[] = fsca.next().toCharArray() ;                    int dp[] = new int[26] ;                    for (char i : A)                        dp[i - 'a' ]++ ;                     Arrays.sort(dp);                    int ct = 0 ;                    for (int i = 0; i <26 ; i++) {                       if (dp[i] > 0)ct++ ;                    }                     if (ct >4 || ct <= 1){                        System.out.println("NO");                        return;                    }                    if (ct == 4){                        System.out.println("YES");                        return;                    }                     if (ct == 2){                        if (dp[25] >= 2 && dp[24] >=2 )                            System.out.println("YES");                        else System.out.println("NO");                        return;                    }                    if (ct == 3){                        if (dp[25] >= 2)                            System.out.println("YES");                        else System.out.println("NO");                        return;                     }                                          fop.flush();                    fop.close();                } catch (Exception e) {                    return;                }                    }            /*-----------------------------------------------------------------------------------------------------------------------------------------------*/        //            static void sieve(int n) {//                boolean[] flag = new boolean[n];////                for (int i = 2; i * i < n; i++) {//                    if (flag[i])//                        continue;//                    else//                        for (int j = i * i; j <= n; j += i) {//                            flag[j] = true;//                        }//                }//            }//////            static int gcd(int a, int b) {//                if (b > a) {//                    int tenp = b;//                    b = a;//                    a = tenp;//                }//                int temp = 0;//                while (b != 0) {//                    a %= b;//                    temp = b;//                    b = a;//                    a = temp;//                }//                return a;//            }////            static long gcd_long(long a, long b) {//                if (b > a) {//                    long tenp = b;//                    b = a;//                    a = tenp;//                }//                long temp = 0;//                while (b != 0) {//                    a %= b;//                    temp = b;//                    b = a;//                    a = temp;//                }//                return a;//            }                    static final Random random = new Random();                static void ruffleSort(int[] a) {                int n = a.length;//shuffle, then sort                for (int i = 0; i < n; i++) {                    int oi = random.nextInt(n), temp = a[oi];                    a[oi] = a[i];                    a[i] = temp;                }                Arrays.sort(a);            }                    static class FastScanner {                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                StringTokenizer st = new StringTokenizer("");                    String next() {                    while (!st.hasMoreTokens())                        try {                            st = new StringTokenizer(br.readLine());                        } catch (IOException e) {                            e.printStackTrace();                        }                    return st.nextToken();                }                    int nextInt() {                    return Integer.parseInt(next());                }                    int[] readArray(int n) {                    int[] a = new int[n];                    for (int i = 0; i < n; i++) a[i] = nextInt();                    return a;                }                    long[] readLongArray(int n) {                    long[] a = new long[n];                    for (int i = 0; i < n; i++)                        a[i] = nextLong();                    return a;                }                    long nextLong() {                    return Long.parseLong(next());                }            }                }                                
