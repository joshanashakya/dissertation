import java.util.*;import java.io.*; public class cf_1 {    public static void main(String[] args) {        new Solution().solve();    }} class Solution {    public void solve() {        FastScanner fs = new FastScanner();        int tests = fs.nextInt();        for (int i=0; i < tests; i++) {            int length = fs.nextInt();            String word = fs.next();            char[] cArr = word.toCharArray();            Arrays.sort(cArr);            System.out.println(cArr);        }    }} class FastScanner {    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    private StringTokenizer st = new StringTokenizer("");        public String next() {        while (!st.hasMoreTokens())            try {                st=new StringTokenizer(br.readLine());            } catch (IOException e) {                e.printStackTrace();            }        return st.nextToken();    }        public int nextInt() {        return Integer.parseInt(next());    }        public int[] readArray(int n) {        int[] arr = new int[n];        for (int i=0; i<n; i++) {            arr[i] = nextInt();        }        return arr;    }        public long nextLong() {        return Long.parseLong(next());    }}