import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        ADeathNote solver = new ADeathNote();        solver.solve(1, in, out);        out.close();    }     static class ADeathNote {        int n;        int m;         public void readInput(Scanner sc) {            n = sc.nextInt();            m = sc.nextInt();        }         public void solve(int testNumber, Scanner sc, PrintWriter pw) {            int q = 1;            while (q-- > 0) {                readInput(sc);                long prev = 0;                long sum = 0;                for (int i = 0; i < n; i++) {                    sum += sc.nextInt();                    pw.print(sum / m - prev + " ");                    prev += sum / m - prev;                }            }        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() {            try {                while (st == null || !st.hasMoreTokens())                    st = new StringTokenizer(br.readLine());                return st.nextToken();            } catch (Exception e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 