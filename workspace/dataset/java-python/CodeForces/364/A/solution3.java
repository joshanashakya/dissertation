import java.util.*;import java.io.*;import java.math.*; public class Main {    static PrintWriter out;    static Reader in;    public static void main(String[] args) throws IOException {        //out = new PrintWriter(new File("out.txt"));        //PrintWriter out = new PrintWriter(System.out);        //in = new Reader(new FileInputStream("in.txt"));        //Reader in = new Reader();        input_output();        Main solver = new Main();        solver.solve();        out.flush();        out.close();     }     static long INF = (long)1e16;    static int maxn = (int)1e6+5;    static int mod= 998_244_353;    static int n, m, q, k, t;     void solve() throws IOException{        int a = in.nextInt();        String s = in.next();        n = s.length();         int[] cnt = new int[maxn];        int[] sum = new int[n];        sum[0] = s.charAt(0)-'0';        for (int i = 1; i < n; i++) sum[i] = sum[i-1]+s.charAt(i)-'0';         int tmp;        for (int i = 0; i < n; i++) {            for (int j = i; j < n; j++) {                tmp = sum[j];                if (i != 0) tmp -= sum[i-1];                cnt[tmp]++;            }        }         if (a == 0) {            long all = (long)(n*(n+1))/2L;            long notzero = all-cnt[0], zero = cnt[0];            long ans = zero*notzero*2L+zero*zero;            out.println(ans);            return;        }         long ans = 0;        for (int i = 1; i <= Math.sqrt(a); i++) {            if (a%i == 0) {                if (i >= maxn || a/i >= maxn) continue;                if (i != a/i) ans += (long)cnt[i]*cnt[a/i]*2L;                else ans += (long)cnt[i]*cnt[a/i];            }        }         out.println(ans);    }     //<>     static class Reader {         private InputStream mIs;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;            public Reader() {            this(System.in);        }            public Reader(InputStream is) {            mIs = is;        }            public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = mIs.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }            public String nextLine() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }            public String next() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }            double nextDouble()        {            return Double.parseDouble(next());        }            public long nextLong() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }            public int nextInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }            public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }            public boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    static void input_output() throws IOException {        File f = new File("in.txt");        if(f.exists() && !f.isDirectory()) {             in = new Reader(new FileInputStream("in.txt"));        } else in = new Reader();        f = new File("out.txt");        if(f.exists() && !f.isDirectory()) {            out = new PrintWriter(new File("out.txt"));        } else out = new PrintWriter(System.out);    }}