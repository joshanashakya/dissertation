import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.util.StringTokenizer; /** * Created by Katushka on 27.01.2020. */public class ShortProgram {    public static void main(String[] args) {        InputReader in = new InputReader(System.in);         int n = in.nextInt();        int a0 = 0;        int a1 = 1023;        for (int i = 0; i < n; i++) {            int ch = in.nextChar();            int x = in.nextInt();            if (ch == '|') {                a0 |= x;                a1 |= x;            } else if (ch == '&') {                a0 &= x;                a1 &= x;            } else {                a0 ^= x;                a1 ^= x;            }        }        int x1 = 0;        int x2 = 0;        int d = 1;        for (int i = 0; i < 10; i++) {            int b0 = a0 % 2;            int b1 = a1 % 2;             if (b0 == 0 && b1 == 0) {             } else if (b0 == 1 && b1 == 0) {                x1 += d;                x2 += d;            } else if (b0 == 0 && b1 == 1) {                x1 += d;            } else {                x2 += d;            }             d *= 2;             a0 /= 2;            a1 /= 2;        }        System.out.println(2);        System.out.println("& " + x1);        System.out.println("^ " + x2);     }     private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    final String str = reader.readLine();                    tokenizer = new StringTokenizer(str);                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public String nextString() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public char nextChar() {            return next().charAt(0);        }    }}