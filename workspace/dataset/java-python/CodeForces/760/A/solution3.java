import java.io.*;import java.util.*; import static java.lang.Math.*; import java.time.YearMonth; public class Task {    public static void main(String[] args) throws IOException {        Reader reader = new Reader();        PrintWriter out = new PrintWriter(System.out);         int m = reader.nextInt();        int d = reader.nextInt();         m = YearMonth.of(2017, m).lengthOfMonth();        m -= 8 - d;        int c = 1;        while (m > 0) {            m -= 7;            ++c;        }         out.println(c);         reader.close();        out.close();    }} class Reader {    private BufferedReader bufferedReader;    private StringTokenizer tokenizer;     public Reader() {        bufferedReader = new BufferedReader(new InputStreamReader(System.in), 32786);    }     public void close() throws IOException {        bufferedReader.close();    }     public String next() throws IOException {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(bufferedReader.readLine());        }         return tokenizer.nextToken();    }     public int nextInt() throws IOException {        return Integer.parseInt(next());    }     public long nextLong() throws IOException {        return Long.parseLong(next());    }}