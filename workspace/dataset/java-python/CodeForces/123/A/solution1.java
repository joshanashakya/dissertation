import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.BufferedWriter;import java.util.Set;import java.util.InputMismatchException;import java.io.IOException;import java.util.HashSet;import java.io.Writer;import java.io.OutputStreamWriter;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * * @author El-Bishoy */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        OutputWriter out = new OutputWriter(outputStream);        Taskddd solver = new Taskddd();        solver.solve(1, in, out);        out.close();    }     static class Taskddd {        public void solve(int testNumber, InputReader in, OutputWriter out) {             char[] str = in.nextString().toCharArray();              if (str.length <= 3) {                out.println("YES");                out.println(String.valueOf(str));                return;             }              char[] outStr = new char[str.length + 1];            int n = str.length;            int[] freq = new int[26];             for (int i = 0; i < str.length; i++) {                freq[str[i] - 'a']++;            }              int max = -1;            int argMax = -1;            for (int i = 0; i < freq.length; i++) {                if (max < freq[i]) {                    max = freq[i];                    argMax = i;                 }            }             char maxChar = (char) (argMax + 'a');             boolean[] sieve = MathUtils.Mathematics.sieveOfEratosthenes(n);            int l = n / 2;             Set<Integer> invalidIndices = new HashSet<>();            int numOfPrimesInTheSecondHalf = 0;            for (int i = l + 1; i <= n; i++) {                if (sieve[i]) {                    numOfPrimesInTheSecondHalf++;                    invalidIndices.add(i);                }            }             int neededMAx = n - (numOfPrimesInTheSecondHalf + 1);            if (max >= neededMAx) {                out.println("YES");                //print the solution                 //distribute max char                 //distribute other chars                  invalidIndices.add(1);                int ptrFreq = 0;                int ptrOut = 1;                for (; ptrOut < outStr.length; ) {                     if (invalidIndices.contains(ptrOut)) {                         //if chars available to take                        if (freq[ptrFreq] != 0) {                             if (ptrFreq == argMax && freq[argMax] == neededMAx) {                                ptrFreq++;                                continue;                            }                            outStr[ptrOut] = (char) (ptrFreq + 'a');                            freq[ptrFreq]--;                            ptrOut++;                        }                        else {                            ptrFreq++;                        }                    }                    else ptrOut++;                }                  for (int i = 2; i < outStr.length; i++) {                    if (outStr[i] == '\u0000')                        outStr[i] = maxChar;                }                 String s = String.valueOf(outStr);                out.println(s.substring(1));            }            else                out.println("NO");         }     }     static class OutputWriter {        private final PrintWriter writer;         public OutputWriter(OutputStream outputStream) {            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));        }         public OutputWriter(Writer writer) {            this.writer = new PrintWriter(writer);        }         public void print(Object... objects) {            for (int i = 0; i < objects.length; i++) {                if (i != 0) {                    writer.print(' ');                }                writer.print(objects[i]);            }        }         public void println(Object... objects) {            print(objects);            writer.println();        }         public void close() {            writer.close();        }     }     static class InputReader {        private InputStream stream;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;        private InputReader.SpaceCharFilter filter;         public InputReader(InputStream stream) {            this.stream = stream;        }         public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = stream.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }         public String nextString() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                if (Character.isValidCodePoint(c)) {                    res.appendCodePoint(c);                }                c = read();            } while (!isSpaceChar(c));            return res.toString();        }         public boolean isSpaceChar(int c) {            if (filter != null) {                return filter.isSpaceChar(c);            }            return isWhitespace(c);        }         public static boolean isWhitespace(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         public interface SpaceCharFilter {            public boolean isSpaceChar(int ch);         }     }     static class MathUtils {        public static class Mathematics {            public static boolean[] sieveOfEratosthenes(int n) {                 boolean[] prime = new boolean[n + 1];                Arrays.fill(prime, true);                prime[0] = prime[1] = false;                for (int p = 2; p * p <= n; p++) {                    // If prime[p] is not changed, then it is a prime                    if (prime[p]) {                        // Update all multiples of p                        for (int i = p * p; i <= n; i += p)                            prime[i] = false;                    }                }                 return prime;            }         }     }}