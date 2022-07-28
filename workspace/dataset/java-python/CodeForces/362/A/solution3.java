import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Scanner; /** * Built using CHelper plug-in * Actual solution is at the top * * @author mthai */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        CF_362A solver = new CF_362A();        solver.solve(1, in, out);        out.close();    }     static class CF_362A {        public void solve(int testNumber, Scanner input, PrintWriter out) {            ShortScanner in = new ShortScanner(input);            int t = in.i();            while (t-- > 0) {                char[][] b = new char[9][9];                for (int i = 1; i <= 8; ++i) {                    char[] tmp = in.c();                    for (int j = 1; j <= 8; ++j) {                        b[i][j] = tmp[j - 1];                    }                }                 int x1 = 0, y1 = 0, x2 = 0, y2 = 0;                L1:                for (int i = 1; i <= 8; ++i) {                    for (int j = 1; j <= 8; ++j) {                        if (b[i][j] == 'K') {                            x1 = i;                            y1 = j;                            break L1;                        }                    }                }                for (int i = 1; i <= 8; ++i) {                    for (int j = 1; j <= 8; ++j) {                        if (b[i][j] == 'K' && (i != x1 || j != y1)) {                            x2 = i;                            y2 = j;                        }                    }                }                 int[][] move1 = new int[9][9], move2 = new int[9][9];                go(move1, x1, y1, 0);                go(move2, x2, y2, 0);                boolean ok = false;                L2:                for (int i = 1; i <= 8; ++i) {                    for (int j = 1; j <= 8; ++j) {                        if (Math.abs(move1[i][j] - move2[i][j]) % 2 == 0 && b[i][j] != '#'                                && move1[i][j] * move2[i][j] > 0) {                            out.println("YES");                            ok = true;                            break L2;                        }                    }                }                if (!ok) out.println("NO");            }        }         void go(int[][] move, int x, int y, int cnt) {            if (x <= 0 || x > 8 || y <= 0 || y > 8) return;            if (move[x][y] != 0 && move[x][y] <= cnt + 1) return; // visited            move[x][y] = cnt + 1;            go(move, x - 2, y - 2, move[x][y]);            go(move, x - 2, y + 2, move[x][y]);            go(move, x + 2, y - 2, move[x][y]);            go(move, x + 2, y + 2, move[x][y]);        }         class ShortScanner {            Scanner in;             ShortScanner(Scanner in) {                this.in = in;            }             int i() {                return in.nextInt();            }             char[] c() {                return in.next().toCharArray();            }         }     }}
