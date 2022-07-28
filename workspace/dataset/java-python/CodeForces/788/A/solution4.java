import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.io.OutputStream;import java.io.Writer;import java.util.InputMismatchException;import java.io.IOException;import java.io.File;import java.io.FileNotFoundException;import java.io.InputStream; /** * Built using CHelper plug-in Actual solution is at the top * * @author MaxHeap */public class Main {   public static void main(String[] args) {    InputStream inputStream = System.in;    OutputStream outputStream = System.out;    InputReader in = new InputReader(inputStream);    OutputWriter out = new OutputWriter(outputStream);    AFunctionsAgain solver = new AFunctionsAgain();    solver.solve(1, in, out);    out.close();  }   static class AFunctionsAgain {     public void solve(int testNumber, InputReader in, OutputWriter out) {      int n = in.nextInt();      int[] a = in.nextIntArray(n);      long[] diffs1 = new long[n - 1];      long[] diffs2 = new long[n - 1];      int pt1 = 0, pt2 = 0;      int sig = -1;      for (int i = 0; i + 1 < n; ++i) {        diffs1[pt1++] = Math.abs(a[i] - a[i + 1]) * sig;        diffs2[pt2++] = Math.abs(a[i] - a[i + 1]) * sig * -1;        sig *= -1;      }      out.println(Math.max(          maxIn(diffs1, pt1),          maxIn(diffs2, pt2)      ));    }     private long maxIn(long[] a, int pt1) {      long best = 0;      long cur = 0;      for (int i = 0; i < pt1; ++i) {        cur += a[i];        if (cur < 0) {          cur = 0;        }        best = Math.max(cur, best);      }      return best;    }   }   static class OutputWriter extends PrintWriter {     public OutputWriter(OutputStream out) {      super(out);    }     public OutputWriter(Writer out) {      super(out);    }     public OutputWriter(File file) throws FileNotFoundException {      super(file);    }     public void close() {      super.close();    }   }   static class InputReader {     private InputStream stream;    private static final int DEFAULT_BUFFER_SIZE = 1 << 16;    private static final int EOF = -1;    private byte[] buf = new byte[DEFAULT_BUFFER_SIZE];    private int curChar;    private int numChars;     public InputReader(InputStream stream) {      this.stream = stream;    }     public int read() {      if (this.numChars == EOF) {        throw new UnknownError();      } else {        if (this.curChar >= this.numChars) {          this.curChar = 0;           try {            this.numChars = this.stream.read(this.buf);          } catch (IOException ex) {            throw new InputMismatchException();          }           if (this.numChars <= 0) {            return EOF;          }        }         return this.buf[this.curChar++];      }    }     public int nextInt() {      int c;      for (c = this.read(); isSpaceChar(c); c = this.read()) {      }       byte sgn = 1;      if (c == 45) {        sgn = -1;        c = this.read();      }       int res = 0;       while (c >= 48 && c <= 57) {        res *= 10;        res += c - 48;        c = this.read();        if (isSpaceChar(c)) {          return res * sgn;        }      }       throw new InputMismatchException();    }     public static boolean isSpaceChar(int c) {      return c == 32 || c == 10 || c == 13 || c == 9 || c == EOF;    }     public int[] nextIntArray(int n) {      int[] arr = new int[n];      for (int i = 0; i < n; i++) {        arr[i] = nextInt();      }      return arr;    }   }} 