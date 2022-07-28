import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.IOException;import java.util.InputMismatchException;import java.io.InputStream; /** * Built using CHelper plug-in Actual solution is at the top * * @author dauom */public class Main {  public static void main(String[] args) {    InputStream inputStream = System.in;    OutputStream outputStream = System.out;    InputReader in = new InputReader(inputStream);    PrintWriter out = new PrintWriter(outputStream);    ATreasure solver = new ATreasure();    solver.solve(1, in, out);    out.close();  }   static class ATreasure {    public final void solve(int testNumber, InputReader in, PrintWriter out) {      char[] s = in.nextCharArray();      int bang = 0, open = 0;      for (char c : s) {        if (c == '#') {          ++bang;        } else if (c == '(') {          ++open;        }      }      int closed = s.length - open - bang;      if (closed + bang > open) {        out.println(-1);        return;      }       int[] count = new int[bang];      Arrays.fill(count, 1);      count[bang - 1] += open - closed - bang;       int balance = 0, i = 0;      for (char c : s) {        if (c == '#') {          balance -= count[i++];        } else if (c == '(') {          balance++;        } else if (c == ')') {          balance--;        }        if (balance < 0) {          out.println(-1);          return;        }      }       for (int x : count) {        out.println(x);      }    }  }   static final class InputReader {    private final InputStream stream;    private final byte[] buf = new byte[1 << 16];    private int curChar;    private int numChars;     public InputReader() {      this.stream = System.in;    }     public InputReader(final InputStream stream) {      this.stream = stream;    }     private final int read() {      if (this.numChars == -1) {        throw new UnknownError();      } else {        if (this.curChar >= this.numChars) {          this.curChar = 0;           try {            this.numChars = this.stream.read(this.buf);          } catch (IOException ex) {            throw new InputMismatchException();          }           if (this.numChars <= 0) {            return -1;          }        }         return this.buf[this.curChar++];      }    }     public final String next() {      int c;      while (isSpaceChar(c = this.read())) {}       StringBuilder result = new StringBuilder();      result.appendCodePoint(c);       while (!isSpaceChar(c = this.read())) {        result.appendCodePoint(c);      }       return result.toString();    }     private static final boolean isSpaceChar(final int c) {      return c == 32 || c == 10 || c == 13 || c == 9          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'    }     public final char[] nextCharArray() {      return next().toCharArray();    }  }}