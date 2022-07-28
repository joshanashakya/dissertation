import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, InputReader in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int q = in.nextInt();            int[][] mat = new int[n][m];            cmd[] cmds = new cmd[q];            for (int i = 0; i < q; i++) {                int type = in.nextInt();                if (type == 3) cmds[i] = new cmd(type, in.nextInt() - 1, in.nextInt() - 1, in.nextInt());                else if (type == 2) cmds[i] = new cmd(type, 0, in.nextInt() - 1, 0);                else cmds[i] = new cmd(type, in.nextInt() - 1, 0, 0);            }            for (int i = q - 1; i >= 0; i--) {                if (cmds[i].t == 1) {                    right(mat, cmds[i].r);                } else if (cmds[i].t == 2) {                    down(mat, cmds[i].c);                } else if (cmds[i].t == 3) {                    set(mat, cmds[i].r, cmds[i].c, cmds[i].x);                }            }            for (int i = 0; i < n; i++) {                for (int j = 0; j < m; j++) {                    out.print(mat[i][j] + " ");                }                out.println();            }        }         void right(int[][] mat, int r) {            int end = mat[r][mat[r].length - 1];            for (int i = mat[r].length - 1; i > 0; i--) {                mat[r][i] = mat[r][i - 1];            }            mat[r][0] = end;        }         void down(int[][] mat, int c) {            int end = mat[mat.length - 1][c];            for (int i = mat.length - 1; i > 0; i--) {                mat[i][c] = mat[i - 1][c];            }            mat[0][c] = end;        }         void set(int[][] mat, int r, int c, int x) {            mat[r][c] = x;        }         class cmd {            int t;            int r;            int c;            int x;             cmd(int t1, int r1, int c1, int x1) {                t = t1;                r = r1;                c = c1;                x = x1;            }         }     }     static class InputReader {        private StringTokenizer tokenizer;        private BufferedReader reader;         public InputReader(InputStream inputStream) {            reader = new BufferedReader(new InputStreamReader(inputStream));        }         private void fillTokenizer() {            if (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (Exception e) {                    throw new RuntimeException(e);                }            }        }         public String next() {            fillTokenizer();            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }     }} 