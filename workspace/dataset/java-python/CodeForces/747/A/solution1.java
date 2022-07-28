import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ADisplaySize solver = new ADisplaySize();        solver.solve(1, in, out);        out.close();    }     static class ADisplaySize {        int n;         public void readInput(Scanner sc) {            n = sc.nextInt();        }         public void solve(int testNumber, Scanner sc, PrintWriter pw) {            int q = 1;            while (q-- > 0) {                readInput(sc);                String ans = "1 " + n;                for (int i = 1; i * i <= n; i++) {                    if (n % i == 0) {                        ans = i + " " + n / i;                    }                }                pw.println(ans);            }        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() {            try {                while (st == null || !st.hasMoreTokens())                    st = new StringTokenizer(br.readLine());                return st.nextToken();            } catch (Exception e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 
