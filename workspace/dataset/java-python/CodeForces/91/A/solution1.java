import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.StringTokenizer; public class CF91A_2 {    public static void main(String[] args) throws IOException {        FastScanner sc = new FastScanner();        PrintWriter pw = new PrintWriter(System.out);         char[] s1 = sc.nextToken().toCharArray(), s2 = sc.nextToken().toCharArray();        ArrayList<Integer>[] occs = new ArrayList[26];        Arrays.setAll(occs, i -> new ArrayList<Integer>());         for (int i = 0; i < s1.length; i++)            occs[s1[i] - 'a'].add(i);         int reps = 0;        int pos = s1.length - 1;        boolean possible = true;        for (char c : s2) {            ArrayList<Integer> o = occs[c - 'a'];            int nxt = binarySearch(pos, o);            if (nxt == -1) {                if (o.isEmpty()) {                    possible = false;                    break;                }                nxt = o.get(0);            }            if (nxt <= pos)                reps++;            pos = nxt;        }        pw.println(possible ? reps : -1);        pw.flush();    }     static int binarySearch(int pos, ArrayList<Integer> arr) {        int lo = 0, hi = arr.size() - 1;        while (lo <= hi) {            int mid = (lo + hi) / 2;            if (arr.get(mid) <= pos)                lo = mid + 1;            else                hi = mid - 1;        }        return lo < arr.size() ? arr.get(lo) : -1;    }     static class FastScanner {        BufferedReader in;        StringTokenizer st;         public FastScanner() {            this.in = new BufferedReader(new InputStreamReader(System.in));        }         public String nextToken() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(in.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(nextToken());        }         public long nextLong() {            return Long.parseLong(nextToken());        }         public double nextDouble() {            return Double.parseDouble(nextToken());        }         public void close() throws IOException {            in.close();        }    }}
