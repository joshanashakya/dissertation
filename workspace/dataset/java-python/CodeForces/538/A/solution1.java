    import java.io.*;    import java.math.BigDecimal;    import java.util.ArrayDeque;    import java.util.Arrays;    import java.util.InputMismatchException;    import java.util.Queue;    import java.io.*;    import java.lang.reflect.Array;    import java.math.BigInteger;    import java.util.*;    import java.io.BufferedReader;    import java.io.IOException;    import java.util.Collections;    import java.io.InputStreamReader;    import java.util.logging.SimpleFormatter;          public class Main1 {         static String solver(String s){             if (s.startsWith("CODEFORCES"))                return "YES" ;            if (s.startsWith("C") && s.endsWith("ODEFORCES"))                return "YES" ;            if (s.startsWith("CO") && s.endsWith("DEFORCES"))                return "YES" ;            if (s.startsWith("COD") && s.endsWith("EFORCES"))                return "YES" ;            if (s.startsWith("CODE") && s.endsWith("FORCES"))                return "YES" ;            if (s.startsWith("CODEF") && s.endsWith("ORCES"))                return "YES" ;            if (s.startsWith("CODEFO") && s.endsWith("RCES"))                return "YES" ;            if (s.startsWith("CODEFOR") && s.endsWith("CES"))                return "YES" ;            if (s.startsWith("CODEFORC") && s.endsWith("ES"))                return "YES" ;            if (s.startsWith("CODEFORCE") && s.endsWith("S"))                return "YES" ;            if (s.endsWith("CODEFORCES"))                return "YES" ;            return "NO" ;         }                public static void main(String[] args) {                  FastScanner in = new FastScanner();                PrintWriter out = new PrintWriter(System.out);                 String s = in.next() ;                System.out.println(solver(s));                               out.flush();                out.close();             }              private static int countDigits(long l) {                if (l >= 1000000000000000000L) return 19;                if (l >= 100000000000000000L) return 18;                if (l >= 10000000000000000L) return 17;                if (l >= 1000000000000000L) return 16;                if (l >= 100000000000000L) return 15;                if (l >= 10000000000000L) return 14;                if (l >= 1000000000000L) return 13;                if (l >= 100000000000L) return 12;                if (l >= 10000000000L) return 11;                if (l >= 1000000000L) return 10;                if (l >= 100000000L) return 9;                if (l >= 10000000L) return 8;                if (l >= 1000000L) return 7;                if (l >= 100000L) return 6;                if (l >= 10000L) return 5;                if (l >= 1000L) return 4;                if (l >= 100L) return 3;                if (l >= 10L) return 2;                return 1;            }                  static void updateRangeLazy(int tree[] , int lazy[] , int ss ,int se , int l , int r , int increment , int index){                 if (lazy[index] != 0 ){                    tree[index] += lazy[index];                     if (ss != se){                        lazy[2*index]  +=  lazy[index];                        lazy[2*index + 1]  +=  lazy[index];                    }                    lazy[index ] = 0 ;                }                 if (ss > r && se< l )                    return;                 if (ss >= l && se <= r) {                    tree[index] += increment;                      if (ss != se) {                        lazy[2 * index] += increment;                        lazy[2 * index + 1] += increment;                    }                    return;                }                 int mid = (ss + se)/2 ;                  tree[index] =  Math.min( tree[2*index], tree[2*index + 1] ) ;             }                static class FastOutput implements AutoCloseable, Closeable, Appendable {                private static final int THRESHOLD = 32 << 10;                private final Writer os;                private StringBuilder cache = new StringBuilder(THRESHOLD * 2);                 public FastOutput append(CharSequence csq) {                    cache.append(csq);                    return this;                }                 public FastOutput append(CharSequence csq, int start, int end) {                    cache.append(csq, start, end);                    return this;                }                 private void afterWrite() {                    if (cache.length() < THRESHOLD) {                        return;                    }                    flush();                }                 public FastOutput(Writer os) {                    this.os = os;                }                 public FastOutput(OutputStream os) {                    this(new OutputStreamWriter(os));                }                 public FastOutput append(char c) {                    cache.append(c);                    afterWrite();                    return this;                }                 public FastOutput append(long c) {                    cache.append(c);                    afterWrite();                    return this;                }                 public FastOutput append(String c) {                    cache.append(c);                    afterWrite();                    return this;                }                 public FastOutput println() {                    return append(System.lineSeparator());                }                 public FastOutput flush() {                    try {    //            boolean success = false;    //            if (stringBuilderValueField != null) {    //                try {    //                    char[] value = (char[]) stringBuilderValueField.get(cache);    //                    os.write(value, 0, cache.length());    //                    success = true;    //                } catch (Exception e) {    //                }    //            }    //            if (!success) {                        os.append(cache);    //            }                        os.flush();                        cache.setLength(0);                    } catch (IOException e) {                        throw new UncheckedIOException(e);                    }                    return this;                }                 public void close() {                    flush();                    try {                        os.close();                    } catch (IOException e) {                        throw new UncheckedIOException(e);                    }                }                 public String toString() {                    return cache.toString();                }             }                   static class FastScanner {                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                StringTokenizer st = new StringTokenizer("");                 String next() {                    while (!st.hasMoreTokens())                        try {                            st = new StringTokenizer(br.readLine());                        } catch (IOException e) {                            e.printStackTrace();                        }                    return st.nextToken();                }                 int nextInt() {                    return Integer.parseInt(next());                }                 int[] readArray(int n) {                    int[] a = new int[n];                    for (int i = 0; i < n; i++) a[i] = nextInt();                    return a;                }                  long nextLong() {                    return Long.parseLong(next());                }            }          }       
