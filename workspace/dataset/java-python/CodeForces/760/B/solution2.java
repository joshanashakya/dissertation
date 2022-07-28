import java.io.*;import java.util.*; import static java.lang.Math.*; public class Task {    public static void main(String[] args) throws IOException {        Reader reader = new Reader();        PrintWriter out = new PrintWriter(System.out);         int n = reader.nextInt();        int m = reader.nextInt();        int k = reader.nextInt();        int x = 0;        int lo = 1;        int hi = m;        while (lo <= hi) {            int mid = (lo + hi) / 2;             long p = mid;            long sum = p;            long y1 = n - k;            long y2 = k - 1;             if (y1 > p - 1) {                sum += y1 + (p - 1) * p / 2 - (p - 1);            } else {                sum += p * y1 - y1 * (y1 + 1) / 2;            }             if (y2 > p - 1) {                sum += y2 + (p - 1) * p / 2 - (p - 1);            } else {                sum += p * y2 - y2 * (y2 + 1) / 2;            }             if (sum <= m) {                x = max(x, mid);                lo = mid + 1;            } else {                hi = mid - 1;           }        }         out.println(x);         reader.close();        out.close();    }} class Reader {    private BufferedReader bufferedReader;    private StringTokenizer tokenizer;     public Reader() {        bufferedReader = new BufferedReader(new InputStreamReader(System.in), 32786);    }     public void close() throws IOException {        bufferedReader.close();    }     public String next() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(bufferedReader.readLine());        }         return tokenizer.nextToken();    }     public int nextInt() throws IOException {        return Integer.parseInt(next());    }     public long nextLong() throws IOException {        return Long.parseLong(next());    }}
