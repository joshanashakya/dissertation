import java.io.*;import java.util.Arrays;import java.util.StringJoiner;import java.util.StringTokenizer;import java.util.function.Function; public class Main {     static int N;    static char[] T;    static String[] W;     public static void main(String[] args) {        FastScanner sc = new FastScanner(System.in);        N = sc.nextInt();         T = new char[N];        W = new String[N];        for (int i = 0; i < N; i++) {            T[i] = sc.next().charAt(0);            W[i] = sc.next();        }         System.out.println(solve());    }     static int solve() {        int could = 0;        for (int i = 0; i < 26; i++) {            could |= 1 << i;        }        int never = 0;        int correct = toSet(W[N-1]);        int exceed = 0;        for (int i = 0; i < N-1; i++) {            char t = T[i];            String w = W[i];            if( t == '!' ) {                if( Integer.bitCount(could) == 1 ) {                    exceed++;                 } else {                    could &= toSet(w);                }             } else if( t == '.' ) {                never |= toSet(w);                // 1 0 -> 1                // 1 1 -> 0                // 0 1 -> 0                // 0 0 -> 0                could &= ~never;             } else if( t == '?' ) {                // wrong guess                if( Integer.bitCount(could) == 1 ) {                    exceed++;                 } else {                    // got shock and study                    never |= toSet(w);                    could &= ~never;                }            }             // debug(Integer.toBinaryString(could), Integer.toBinaryString(never), exceed);        }        return exceed;    }     static int toSet(String w) {        int s = 0;        for (int i = 0; i < w.length(); i++) {            int c = w.charAt(i) - 'a';            s |= 1 << c;        }        return s;    }     @SuppressWarnings("unused")    static class FastScanner {        private BufferedReader reader;        private StringTokenizer tokenizer;         FastScanner(InputStream in) {            reader = new BufferedReader(new InputStreamReader(in));            tokenizer = null;        }         String next() {            if (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         String nextLine() {            if (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    return reader.readLine();                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken("\n");        }         long nextLong() {            return Long.parseLong(next());        }         int nextInt() {            return Integer.parseInt(next());        }         int[] nextIntArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         int[] nextIntArray(int n, int delta) {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt() + delta;            return a;        }         long[] nextLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }    }     static <A> void writeLines(A[] as, Function<A, String> f) {        PrintWriter pw = new PrintWriter(System.out);        for (A a : as) {            pw.println(f.apply(a));        }        pw.flush();    }     static void writeLines(int[] as) {        PrintWriter pw = new PrintWriter(System.out);        for (int a : as) pw.println(a);        pw.flush();    }     static void writeLines(long[] as) {        PrintWriter pw = new PrintWriter(System.out);        for (long a : as) pw.println(a);        pw.flush();    }     static int max(int... as) {        int max = Integer.MIN_VALUE;        for (int a : as) max = Math.max(a, max);        return max;    }     static int min(int... as) {        int min = Integer.MAX_VALUE;        for (int a : as) min = Math.min(a, min);        return min;    }     static void debug(Object... args) {        StringJoiner j = new StringJoiner(" ");        for (Object arg : args) {            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));            else j.add(arg.toString());        }        System.err.println(j.toString());    }}
