import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.FileReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BGameOnPaper solver = new BGameOnPaper();        solver.solve(1, in, out);        out.close();    }     static class BGameOnPaper {        int[][] arr;        int n;        int m;         public void solve(int testNumber, Scanner sc, PrintWriter pw) {            n = sc.nextInt();            m = sc.nextInt();            arr = new int[n + 4][n + 4];            for (int i = 0; i < m; i++) {                int x = sc.nextInt(), y = sc.nextInt();                arr[x][y] = 1;                if (valid(x, y)) {                    pw.println(i + 1);                    return;                }            }            pw.println(-1);        }         private boolean valid(int x, int y) {            for (int i = Math.max(0, x - 2); i < Math.min(x + 3, n); i++)                loop:for (int j = Math.max(y - 2, 0); j < Math.min(y + 3, n); j++) {                    for (int step = 0; step < 3; step++)                        for (int k = 0; k < 3; k++)                            if (arr[i + step][j + k] == 0)                                continue loop;                    return true;                }            return false;        }     }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(FileReader r) {            br = new BufferedReader(r);        }         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 