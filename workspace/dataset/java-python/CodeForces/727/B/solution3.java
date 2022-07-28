import java.io.*;import java.nio.file.Files;import java.nio.file.Path;import java.nio.file.Paths;import java.nio.file.StandardCopyOption;import java.util.*;import java.util.function.Function;import java.util.function.Predicate;import java.util.stream.Collectors;import java.util.stream.Stream; import static java.util.stream.Collectors.*;import static java.util.stream.Collectors.counting;import static java.util.stream.Collectors.groupingBy;import static java.util.stream.Collectors.partitioningBy; public class Main {    public static void main(String[] args) throws IOException {        InputStream inputStream = System.in;//        InputStream inputStream = new FileInputStream("dijkstra.in");        OutputStream outputStream = System.out;//        OutputStream outputStream = new FileOutputStream("dijkstra.out");         InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        Answer solver = new Answer();        solver.solve(in, out);        out.close();    }} class Answer {    public void solve(InputReader in, PrintWriter out) throws IOException {        String s = in.next();         long sum = 0;        for (int i = 0; i < s.length(); ) {            while ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {                i++;            }            StringBuilder sb = new StringBuilder();            while (i < s.length() &&                    ('0' <= s.charAt(i) && s.charAt(i) <= '9' || s.charAt(i) == '.')) {                sb.append(s.charAt(i));                i++;            }             String price = sb.toString();            int lenPrice = price.length();            boolean withKop = lenPrice >= 3 && price.charAt(lenPrice - 3) == '.';             sb = new StringBuilder();            for (int j = 0; j < price.length(); j++) {                if (price.charAt(j) != '.') {                    sb.append(price.charAt(j));                }            }             long tmp = Long.parseLong(sb.toString());            if (!withKop) {                tmp *= 100;            }             sum += tmp;        }         int kop = (int) (sum % 100);        sum /= 100;        StringBuilder sb = new StringBuilder();        if (sum == 0) {            sb.append("0");        } else {            int k = 0;            while (sum != 0) {                sb.append(sum % 10);                k++;                if (k == 3 && sum > 9) {                    sb.append(".");                    k = 0;                }                sum /= 10;            }            sb = sb.reverse();        }        if (0 < kop && kop < 10) {            sb.append(".0");            sb.append(kop);        } else if (kop >= 10)  {            sb.append(".");            sb.append(kop);        }        out.println(sb.toString());    }} class InputReader {    private BufferedReader reader;    private StringTokenizer tokenizer;     InputReader(InputStream stream) {        reader = new BufferedReader(new InputStreamReader(stream), 32768);        tokenizer = null;    }     public String next() {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            try {                tokenizer = new StringTokenizer(reader.readLine());            } catch (IOException e) {                throw new RuntimeException(e);            }        }        return tokenizer.nextToken();    }     public int nextInt() {        return Integer.parseInt(next());    }     public long nextLong() {        return Long.parseLong(next());    }     public int[] nextArrayInt(int count) {        int[] a = new int[count];        for (int i = 0; i < count; i++) {            a[i] = nextInt();        }        return a;    }     public long[] nextArrayLong(int count) {        long[] a = new long[count];        for (int i = 0; i < count; i++) {            a[i] = nextLong();        }        return a;    }}  
