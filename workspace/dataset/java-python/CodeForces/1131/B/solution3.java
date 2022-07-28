import java.util.*;import java.io.*; public class Main {    static FastScanner sc = new FastScanner(System.in);    static PrintWriter pw = new PrintWriter(System.out);    static StringBuilder sb = new StringBuilder();    public static void main(String[] args) throws Exception {        int n = sc.nextInt();        int a = 0;        int b = 0;        int bar = -1;        int ans = 0;        for(int i = 0; i < n; i++){            int na = sc.nextInt();            int nb = sc.nextInt();            ans += Math.max(0,Math.min(na,nb)-Math.max(Math.max(b,a)-1,bar));            a = na;            b = nb;            bar = Math.min(a,b);            //pw.println(ans);        }        pw.println(ans);        pw.flush();    }     static class GeekInteger {        public static void save_sort(int[] array) {            shuffle(array);            Arrays.sort(array);        }         public static int[] shuffle(int[] array) {            int n = array.length;            Random random = new Random();            for (int i = 0, j; i < n; i++) {                j = i + random.nextInt(n - i);                int randomElement = array[j];                array[j] = array[i];                array[i] = randomElement;            }            return array;        }                public static void save_sort(long[] array) {            shuffle(array);            Arrays.sort(array);        }         public static long[] shuffle(long[] array) {            int n = array.length;            Random random = new Random();            for (int i = 0, j; i < n; i++) {                j = i + random.nextInt(n - i);                long randomElement = array[j];                array[j] = array[i];                array[i] = randomElement;            }            return array;        }     }} class FastScanner {    private BufferedReader reader = null;    private StringTokenizer tokenizer = null;    public FastScanner(InputStream in) {        reader = new BufferedReader(new InputStreamReader(in));        tokenizer = null;    }     public String next() {        if (tokenizer == null || !tokenizer.hasMoreTokens()) {            try {                tokenizer = new StringTokenizer(reader.readLine());            } catch (IOException e) {                throw new RuntimeException(e);            }        }        return tokenizer.nextToken();    }     public String nextLine() {        if (tokenizer == null || !tokenizer.hasMoreTokens()) {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }        return tokenizer.nextToken("\n");    }     public long nextLong() {        return Long.parseLong(next());    }     public int nextInt() {        return Integer.parseInt(next());    }     public double nextDouble() {         return Double.parseDouble(next());    }        public String[] nextArray(int n) {        String[] a = new String[n];        for (int i = 0; i < n; i++)            a[i] = next();        return a;    }     public int[] nextIntArray(int n) {        int[] a = new int[n];        for (int i = 0; i < n; i++)            a[i] = nextInt();        return a;    }     public long[] nextLongArray(int n) {        long[] a = new long[n];        for (int i = 0; i < n; i++)            a[i] = nextLong();        return a;    }} class pair implements Comparable<pair> {    long x;    long y;     public pair(long x, long y) {        this.x = x;        this.y = y;    }     public String toString() {        return x + " " + y;    }     public boolean equals(Object o) {        if (o instanceof pair) {            pair p = (pair) o;            return p.x == x && p.y == y;        }        return false;    }     public int hashCode() {        return new Double(x).hashCode() * 31 + new Double(y).hashCode();    }     public int compareTo(pair other) {        if (this.x == other.x) {            return Long.compare(this.y, other.y);        }        return Long.compare(this.x, other.x);    }} class tuble implements Comparable<tuble> {    int x;    int y;    int z;     public tuble(int x, int y, int z) {        this.x = x;        this.y = y;        this.z = z;    }     public String toString() {        return x + " " + y + " " + z;    }     public boolean equals(Object o) {        if (o instanceof tuble) {            tuble p = (tuble) o;            return p.x == x && p.y == y && p.z == z;        }        return false;    }     public int hashCode() {        return new Double(x).hashCode() * 31 + new Double(y).hashCode() + new Double(z).hashCode() * 31 * 31;    }     public int compareTo(tuble other) {        if (this.x == other.x) {            if (this.y == other.y) {                return this.z - other.z;            }            return this.y - other.y;        } else {            return this.x - other.x;        }    }}
