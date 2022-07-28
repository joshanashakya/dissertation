import java.io.*;import java.util.*;import java.util.regex.Matcher; public class Main {     public static void main(String[] args) throws IOException {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(in, out);        out.close();    }     private static class TaskB {         static final long max = 1000000000000000000L;        static final double eps = 0.000001;        static int n, m;        int year, month, day;         void solve(InputReader in, PrintWriter out) throws IOException {             String f = in.nextLine();            String bday = in.nextLine();             String sf[] = f.split("\\.");             year = Integer.valueOf(sf[2]);            month = Integer.valueOf(sf[1]);            day = Integer.valueOf(sf[0]);             sf = bday.split("\\.");             int a = Integer.valueOf(sf[0]);            int b = Integer.valueOf(sf[1]);            int c = Integer.valueOf(sf[2]);             if (check(a, b, c)) {                out.println("YES");                return;            }            if (check(a, c, b)) {                out.println("YES");                return;            }            if (check(b, a, c)) {                out.println("YES");                return;            }            if (check(b, c, a)) {                out.println("YES");                return;            }            if (check(c, a, b)) {                out.println("YES");                return;            }            if (check(c, b, a)) {                out.println("YES");                return;            }             out.println("NO");         }         private boolean check(int y, int m, int d) {             if (m > 12) return false;            if (d > 31) return false;            if (m == 2 && d > 29) return false;            if (m == 2 && d == 29 && y % 4 != 0) return false;            if (m == 4 && d > 30) return false;            if (m == 6 && d > 30) return false;            if (m == 9 && d > 30) return false;            if (m == 11 && d > 30) return false;                         if (year - y > 18) return true;            else if (year - y == 18) {                if (m < month) return true;                else if (month == m) {                    if (d <= day) return true;                    else return false;                } else return false;            } else return false;         }         class Edge {            int a, b;             Edge(int a, int b) {                this.a = a;                this.b = b;            }        }         double segment(double x1, double y1, double x2, double y2) {            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));        }         long gcd(long a, long b) {            if (b == 0) return a;            return gcd(b, a % b);        }         long lcm(long a, long b) {            return (a * b) / gcd(a, b);        }     }     private static class InputReader {        StringTokenizer st;        BufferedReader br;         public InputReader(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public InputReader(FileReader s) throws FileNotFoundException {            br = new BufferedReader(s);        }         public String next() {            while (st == null || !st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public String nextLine() {            try {                return br.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public double nextDouble() {            return Double.parseDouble(next());        }         public boolean ready() {            try {                return br.ready();            } catch (IOException e) {                throw new RuntimeException(e);            }        }    }}
