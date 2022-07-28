import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.FilterInputStream;import java.io.BufferedInputStream;import java.io.InputStream; /** * @author khokharnikunj8 */ public class Main {    public static void main(String[] args) {        new Thread(null, new Runnable() {            public void run() {                new Main().solve();            }        }, "1", 1 << 26).start();    }     void solve() {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        ScanReader in = new ScanReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BCowProgram solver = new BCowProgram();        solver.solve(1, in, out);        out.close();    }     static class BCowProgram {        long[][] ans;        boolean[][] visited;        int[] ar;         long dfs(int l, int x, int n) {            if (x <= 0 || x > n) return 0;            if (visited[x][l % 2]) {                if (ans[x][l % 2] == 0) return -1;                return ans[x][l % 2];            }            visited[x][l % 2] = true;            long aa = dfs(l + 1, x + (l % 2 == 0 ? ar[x] : -ar[x]), n);            return ans[x][l % 2] = aa + (aa == -1 ? 0 : ar[x]);        }         public void solve(int testNumber, ScanReader in, PrintWriter out) {            int n = in.scanInt();            ar = new int[n + 1];            for (int i = 2; i <= n; i++) ar[i] = in.scanInt();            visited = new boolean[n + 1][2];            ans = new long[n + 2][2];             for (int i = 2; i <= n; i++) {                if (!visited[i][1]) {                    ar[1] = i - 1;                    visited[1][0] = false;                    visited[1][1] = false;                    ans[1][0] = 0;                    ans[1][1] = 0;                    dfs(0, 1, n);                }            }            for (int i = 2; i <= n; i++) out.println(ans[i][1] + (ans[i][1] == -1 ? 0 : i - 1));         }     }     static class ScanReader {        private byte[] buf = new byte[4 * 1024];        private int index;        private BufferedInputStream in;        private int total;         public ScanReader(InputStream inputStream) {            in = new BufferedInputStream(inputStream);        }         private int scan() {            if (index >= total) {                index = 0;                try {                    total = in.read(buf);                } catch (Exception e) {                    e.printStackTrace();                }                if (total <= 0) return -1;            }            return buf[index++];        }         public int scanInt() {            int integer = 0;            int n = scan();            while (isWhiteSpace(n)) n = scan();            int neg = 1;            if (n == '-') {                neg = -1;                n = scan();            }            while (!isWhiteSpace(n)) {                if (n >= '0' && n <= '9') {                    integer *= 10;                    integer += n - '0';                    n = scan();                }            }            return neg * integer;        }         private boolean isWhiteSpace(int n) {            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;            else return false;        }     }} 