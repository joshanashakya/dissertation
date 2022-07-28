import java.io.*;import java.util.StringTokenizer; /** * Created by Katushka on 11.03.2020. */public class TellYourWorld {    static int[] readArray(int size, InputReader in) {        int[] a = new int[size];        for (int i = 0; i < size; i++) {            a[i] = in.nextInt();        }        return a;    }     static long[] readLongArray(int size, InputReader in) {        long[] a = new long[size];        for (int i = 0; i < size; i++) {            a[i] = in.nextLong();        }        return a;    }     public static void main(String[] args) throws FileNotFoundException {        InputReader in = new InputReader(System.in);        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));         int n = in.nextInt();        int[] a = readArray(n, in);         int third = check(a, 0, 1);        if (third == 0) {            out.println("Yes");        } else if (third == -1) {            out.println("No");        } else {            int res1 = check(a, 0, third - 1);            if (res1 == 0) {                out.println("Yes");            } else {                res1 = check(a, 1, third - 1);                if (res1 == 0) {                    out.println("Yes");                } else {                    out.println("No");                }            }        }         out.close();    }     private static int check(int[] a, int i1, int i2) {        int k1 = -1;        int k2 = -1;        for (int i = 0; i < a.length; i++) {            if ((i - i1) * (a[i2] - a[i1]) != (a[i] - a[i1]) * (i2 - i1)) {                if (k1 == -1) {                    k1 = i;                } else if (k2 == -1) {                    k2 = i;                    if ((a[i2] - a[i1]) * (k2 - k1) != (a[k2] - a[k1]) * (i2 - i1)) {                        return k1 + 1;                    }                } else {                    if ((i - k1) * (a[k2] - a[k1]) != (a[i] - a[k1]) * (k2 - k1)) {                        return k1 + 1;                    }                }            }        }        if (k1 == -1 && k2 == -1) {            return -1;        } else {            return 0;        }    }      private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public String nextString() {            try {                return reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public char nextChar() {            return next().charAt(0);        }    }}
