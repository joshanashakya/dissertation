import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.io.BufferedWriter;import java.io.Writer;import java.io.OutputStreamWriter;import java.util.InputMismatchException;import java.io.IOException;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Alex */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        TaskA solver = new TaskA();        solver.solve(1, in, out);        out.close();    }    static class TaskA {        char incr(char c) {            c++;            if(c > 'z') c = 'a';            return c;        }         public void solve(int testNumber, InputReader in, OutputWriter out) {            int n = in.readInt();            char[][] res = new char[n][4];            if(n % 2 == 1) {                res[0][0] = res[0][1] = 'a';                char cur = 'b';                for(int i = 1; i < n; i += 2) {                    for(int row = 0; row < 2; row++) {                        res[i][row] = res[i + 1][row] = cur;                        cur = incr(cur);                    }                }                cur = 'a';                if(cur == res[n - 1][1]) cur++;                res[n - 1][2] = res[n - 1][3] = cur;                for(int i = n - 2; i >= 0; i -= 2) {                    for(int row = 2; row < 4; row++) {                        while(cur == res[i][row - 1] || cur == res[i - 1][row - 1] || cur == res[i + 1][row])                            cur = incr(cur);                        res[i][row] = res[i - 1][row] = cur;                    }                }            } else {                char cur = 'a';                for(int i = 0; i < n; i += 2) {                    while(i > 0 && res[i - 1][0] == cur) cur = incr(cur);                    res[i][0] = res[i + 1][0] = cur;                }                while(cur == res[0][0]) cur = incr(cur);                res[0][1] = res[0][2] = cur;                for(int i = 1; i < n - 1; i += 2) {                    for(int row = 1; row <= 2; row++) {                        while(res[i - 1][row] == cur || res[i][row - 1] == cur || res[i + 1][row - 1] == cur)                            cur = incr(cur);                        res[i][row] = res[i + 1][row] = cur;                    }                }                while(cur == res[n - 1][0] || cur == res[n - 2][1] || cur == res[n - 2][2]) cur = incr(cur);                res[n - 1][1] = res[n - 1][2] = cur;                for(int i = 0; i < n; i += 2) {                    while((i > 0 && res[i - 1][3] == cur) ||                            res[i][2] == cur || res[i + 1][2] == cur) cur = incr(cur);                    res[i][3] = res[i + 1][3] = cur;                }            }            for(int row = 0; row < 4; row++) {                for(int col = 0; col < n; col++) {                    out.print(res[col][row]);                }                out.printLine();            }              boolean[][] visited = new boolean[n][4];            for(int i = 0; i < n; i++) {                for(int j = 0; j < 4; j++) {                    int temp = dfs(i, j, visited, res);                    if(temp != 0 && temp != 2) throw new RuntimeException(Integer.toString(temp));                }            }        }         int dfs(int i, int j, boolean[][] visited, char[][] res) {            if(visited[i][j]) return 0;            visited[i][j] = true;            int ans = 1;            for(int k = 0; k < 4; k++) {                int ii = MiscUtils.DX4[k] + i, jj = MiscUtils.DY4[k] + j;                if(!MiscUtils.isValidCell(ii, jj, visited.length, 4)) continue;                if(res[i][j] != res[ii][jj]) continue;                ans += dfs(ii, jj, visited, res);            }            return ans;        }     }     static class MiscUtils {        public static final int[] DX4 = {1, 0, -1, 0};        public static final int[] DY4 = {0, -1, 0, 1};         public static boolean isValidCell(int row, int column, int rowCount, int columnCount) {            return row >= 0 && row < rowCount && column >= 0 && column < columnCount;        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if(numChars == -1)                throw new InputMismatchException();            if(curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch(IOException e) {                    throw new InputMismatchException();                }                if(numChars <= 0)                    return -1;            }            return buf[curChar++];        }         public int readInt() {            int c = read();            while(isSpaceChar(c))                c = read();            int sgn = 1;            if(c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if(c < '0' || c > '9')                    throw new InputMismatchException();                res *= 10;                res += c - '0';                c = read();            } while(!isSpaceChar(c));            return res * sgn;        }         public boolean isSpaceChar(int c) {            if(filter != null)                return filter.isSpaceChar(c);            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void printLine() {            writer.println();        }         public void print(char i) {            writer.print(i);        }         public void close() {            writer.close();        }     }} 