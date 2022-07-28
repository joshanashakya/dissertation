import java.io.*;import java.util.*;import java.util.List;  /** * Created by Katushka on 11.03.2020. */public class Main {     static void sortArray(int[] a) {        Random random = new Random();         for (int i = 0; i < a.length; i++) {            int randomPos = random.nextInt(a.length);            int t = a[i];            a[i] = a[randomPos];            a[randomPos] = t;        }        Arrays.sort(a);    }     static int[] readArray(int size, InputReader in, boolean subOne) {        int[] a = new int[size];        for (int i = 0; i < size; i++) {            a[i] = in.nextInt() + (subOne ? -1 : 0);        }        return a;    }     static long[] readLongArray(int size, InputReader in) {        long[] a = new long[size];        for (int i = 0; i < size; i++) {            a[i] = in.nextLong();        }        return a;    }     private static final boolean DEBUG = false;    private static final long MOD = 1000000007;      private static int[] getBinary(long a, int size) {        int[] result = new int[size];        for (int i = 0; i < size; i++) {            result[i] = (int) ((a >> i) & 1);        }        return result;    }     private static long fastPow(long x, long y, long mod) {        if (x == 1) {            return 1;        }        if (y == 0) {            return 1;        }        long p = fastPow(x, y / 2, mod) % mod;        p = p * p % mod;        if (y % 2 == 1) {            p = p * x % mod;        }        return p;    }     private static long inv(long x, long mod) {        return fastPow(x, mod - 2, mod);     }     private static long addMod(long x, long y, long mod) {        long res = x + y;        if (res >= mod) {            return res - mod;        }        return res;    }     private static long multMod(long x, long y, long mod) {        long res = x * y;        if (res >= mod) {            return res % mod;        }        return res;    }     private static long subMod(long x, long y, long mod) {        long res = x - y;        if (res < 0) {            return res + mod;        }        return res;    }     public static final Comparator<int[]> PAIR_COMPARATOR = (o1, o2) -> {        if (o1[0] == o2[0]) {            return Long.compare(o1[1], o2[1]);        }        return Long.compare(o1[0], o2[0]);    };     public static void main(String[] args) throws FileNotFoundException {//        InputReader in = new InputReader(new FileInputStream("input.txt"));//        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("seating.out")));         InputReader in = new InputReader(System.in);        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));         int n = in.nextInt();        int m = in.nextInt();        List<Integer> atk = new ArrayList<>();        TreeSet<int[]> atkSet = new TreeSet<>(PAIR_COMPARATOR);        List<Integer> def = new ArrayList<>();        TreeSet<int[]> defSet = new TreeSet<>(PAIR_COMPARATOR);         for (int i = 0; i < n; i++) {            String s = in.nextWord();            int k = in.nextInt();            if (s.equals("ATK")) {                atk.add(k);                atkSet.add(new int[]{k, i});            } else {                def.add(k);                defSet.add(new int[]{k, i});            }        }         List<Integer> my = new ArrayList<>();        TreeSet<int[]> mySet = new TreeSet<>(PAIR_COMPARATOR);        for (int i = 0; i < m; i++) {            int k = in.nextInt();            my.add(k);            mySet.add(new int[]{k, i});        }         Collections.sort(my);        Collections.sort(atk);        Collections.sort(def);         boolean canWin = true;         for (int i = def.size() - 1; i >= 0; i--) {            Integer k = def.get(i);            int[] ceiling = mySet.ceiling(new int[]{k + 1, i});            if (ceiling == null) {                canWin = false;                break;            }            mySet.remove(ceiling);        }         long ans = 0;        if (canWin) {            for (int i = atk.size() - 1; i >= 0; i--) {                Integer k = atk.get(i);                int[] ceiling = mySet.ceiling(new int[]{k, i});                if (ceiling == null) {                    canWin = false;                    break;                }                ans += ceiling[0] - k;                mySet.remove(ceiling);            }            if (canWin) {                for (int[] ints : mySet) {                    ans += ints[0];                }            }        }         long curAns = 0;        int k = my.size() - 1;        for (Integer a : atk) {            if (k >=0 && my.get(k) > a) {                curAns += my.get(k) - a;                k--;            }        }         out.println(Math.max(curAns, ans));        out.close();     }     private static void outputLayer(int[][] ans, int n, PrintWriter out) {        for (int i = 0; i < n; i++) {            StringBuilder str = new StringBuilder();            for (int j = 0; j < n; j++) {                str.append(ans[i][j] == 1 ? "b" : "w");            }            out.println(str);         }//        out.println("\n");    }      private static void outputArray(long[] ans, PrintWriter out, boolean addOne) {        StringBuilder str = new StringBuilder();        for (int i = 0; i < ans.length; i++) {            long an = ans[i] + (addOne ? 1 : 0);            str.append(an).append('\t');        }        out.println(str);        out.flush();    }     private static void outputArray(List<Long> ans, PrintWriter out) {        StringBuilder str = new StringBuilder();        for (long an : ans) {            str.append(an).append(' ');        }        out.println(str);        out.flush();    }      private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public String nextString() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public char nextChar() {            return next().charAt(0);        }         public String nextWord() {            return next();        }         private List<Integer>[] readTree(int n) {            List<Integer>[] result = new ArrayList[n];            for (int i = 0; i < n; i++) {                result[i] = new ArrayList<>();            }            for (int i = 0; i < n - 1; i++) {                int u = nextInt() - 1;                int v = nextInt() - 1;                result[u].add(v);                result[v].add(u);            }            return result;        }     }}
