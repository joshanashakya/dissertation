/*Keep solving problems.*/ import java.util.*;import java.io.*; public class CFA {    BufferedReader br;    PrintWriter out;    StringTokenizer st;    boolean eof;    private static final long MOD = 1000 * 1000 * 1000 + 7;    private static final int[] dx = {0, -1, 0, 1};    private static final int[] dy = {1, 0, -1, 0};    private static final String yes = "Yes";    private static final String no = "No";    String wrong = "No solution";    void solve() throws IOException {        String str = nextString();        if (str.charAt(str.length() - 1) == '@') {            outln(wrong);            return;        }        List<String> res = new ArrayList<>();        String[] arr = str.split("@");        int n = arr.length;        for (int i = 0; i < n; i++) {            if (i == 0 || i == n - 1) {                if (arr[i].length() < 1) {                    outln(wrong);                    return;                }            }            else {                if (arr[i].length() < 2) {                    outln(wrong);                    return;                }            }        }         for (int i = 0; i < n - 1; i++) {            String cur = "";            if (i == 0) {                cur += arr[i] + "@";            }            else {                cur += arr[i].substring(1) + "@";            }             if (i == n - 2) {                cur += arr[i + 1];            }            else {                cur += arr[i + 1].charAt(0);            }            res.add(cur);        }         if (res.isEmpty()) {            outln(wrong);            return;        }        for (int i = 0; i < res.size() - 1; i++) {            out(res.get(i) + ",");        }        out(res.get(res.size() - 1));    }     void shuffle(int[] a) {        int n = a.length;        for(int i = 0; i < n; i++) {            int r = i + (int) (Math.random() * (n - i));            int tmp = a[i];            a[i] = a[r];            a[r] = tmp;        }    }     long gcd(long a, long b) {        while(a != 0 && b != 0) {            long c = b;            b = a % b;            a = c;        }        return a + b;    }     private void outln(Object o) {        out.println(o);    }    private void out(Object o) {        out.print(o);    }    private void formatPrint(double val) {        System.out.format("%.9f%n", val);    }    public CFA() throws IOException {        br = new BufferedReader(new InputStreamReader(System.in));        out = new PrintWriter(System.out);        solve();        out.close();    }    public static void main(String[] args) throws IOException {        new CFA();    }     public long[] nextLongArr(int n) throws IOException{        long[] res = new long[n];        for(int i = 0; i < n; i++)            res[i] = nextLong();        return res;    }    public int[] nextIntArr(int n) throws IOException {        int[] res = new int[n];        for(int i = 0; i < n; i++)            res[i] = nextInt();        return res;    }    public String nextToken() {        while (st == null || !st.hasMoreTokens()) {            try {                st = new StringTokenizer(br.readLine());            } catch (Exception e) {                eof = true;                return null;            }        }        return st.nextToken();    }    public String nextString() {        try {            return br.readLine();        } catch (IOException e) {            eof = true;            return null;        }    }    public int nextInt() throws IOException {        return Integer.parseInt(nextToken());    }    public long nextLong() throws IOException {        return Long.parseLong(nextToken());    }    public double nextDouble() throws IOException {        return Double.parseDouble(nextToken());    }}