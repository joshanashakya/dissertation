import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.InputMismatchException;import java.io.IOException;import java.util.Collections;import java.util.ArrayList;import java.io.InputStream; /** * Built using CHelper plug-in Actual solution is at the top * * @author dauom */public class Main {  public static void main(String[] args) {    InputStream inputStream = System.in;    OutputStream outputStream = System.out;    InputReader in = new InputReader(inputStream);    PrintWriter out = new PrintWriter(outputStream);    BPetyaAndDivisors solver = new BPetyaAndDivisors();    solver.solve(1, in, out);    out.close();  }   static class BPetyaAndDivisors {    public final void solve(int testNumber, InputReader in, PrintWriter out) {      ArrayList<Integer>[] divs = new ArrayList[(int) 1e5 + 1];      for (int i = 1; i < divs.length; i++) {        divs[i] = new ArrayList<>();      }       int n = in.nextInt();      for (int i = 0; i < n; i++) {        int x = in.nextInt();        int y = in.nextInt();        int ans = 0;        for (int j = 1; j * j <= x; j++) {          if (x % j == 0) {            if (none(divs[j], i - y, i - 1)) {              ++ans;            }            if (j * j != x && none(divs[x / j], i - y, i - 1)) {              ++ans;            }            divs[j].add(i);            if (j * j != x) {              divs[x / j].add(i);            }          }        }        out.println(ans);      }    }     private boolean none(ArrayList<Integer> d, int i, int j) {      if (d.isEmpty()) {        return true;      }      int start = Collections.binarySearch(d, i);      if (start < 0) {        start = -start - 1;      }      int end = Collections.binarySearch(d, j);      if (end < 0) {        end = -end - 2;      }      return (end - start + 1) == 0;    }  }   static final class InputReader {    private final InputStream stream;    private final byte[] buf = new byte[1 << 16];    private int curChar;    private int numChars;     public InputReader() {      this.stream = System.in;    }     public InputReader(final InputStream stream) {      this.stream = stream;    }     private final int read() {      if (this.numChars == -1) {        throw new UnknownError();      } else {        if (this.curChar >= this.numChars) {          this.curChar = 0;           try {            this.numChars = this.stream.read(this.buf);          } catch (IOException ex) {            throw new InputMismatchException();          }           if (this.numChars <= 0) {            return -1;          }        }         return this.buf[this.curChar++];      }    }     public final int nextInt() {      int c;      for (c = this.read(); isSpaceChar(c); c = this.read()) {}       byte sgn = 1;      if (c == 45) { // 45 == '-'        sgn = -1;        c = this.read();      }       int res = 0;       while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'        res *= 10;        res += c - 48; // 48 == '0'        c = this.read();        if (isSpaceChar(c)) {          return res * sgn;        }      }       throw new InputMismatchException();    }     private static final boolean isSpaceChar(final int c) {      return c == 32 || c == 10 || c == 13 || c == 9          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'    }  }}