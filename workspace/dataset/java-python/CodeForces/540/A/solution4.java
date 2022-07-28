import java.util.*;import java.io.*;import java.math.*;import java.text.*; public class Main {    static PrintWriter out;    static Reader in;    public static void main(String[] args) throws IOException {        input_output();        //out = new PrintWriter(System.out);        //in = new Reader(new FileInputStream("card.in"));        Main solver = new Main();        solver.solve();        out.close();         out.flush();     }     static int INF = (int)1e9+2;    static int maxn = (int)1e6+5;    static int mod = (int)1e9+7;    static int n, m, q, t, k;    static double pi = 3.141592653589;     void solve() throws IOException{    	n = in.nextInt();     	int[][] arr = new int[n][2];     	for (int j = 0; j < 2; j++) {    		String s = in.next();    		for (int i = 0; i < n; i++) arr[i][j] = s.charAt(i)-'0';    	}     	int ans = 0, min = 0, max = 0;    	for (int i = 0; i < n; i++) {    		min = Math.min(arr[i][0], arr[i][1]);    		max = Math.max(arr[i][0], arr[i][1]);    		ans += Math.min(max-min, min+10-max);    	}     	out.println(ans);    }        static class Reader {         private InputStream mIs;        private byte[] buf = new byte[1024];        private int curChar;        private int numChars;            public Reader() {            this(System.in);        }            public Reader(InputStream is) {            mIs = is;        }            public int read() {            if (numChars == -1) {                throw new InputMismatchException();            }            if (curChar >= numChars) {                curChar = 0;                try {                    numChars = mIs.read(buf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (numChars <= 0) {                    return -1;                }            }            return buf[curChar++];        }            public String nextLine() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isEndOfLine(c));            return res.toString();        }            public String next() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            StringBuilder res = new StringBuilder();            do {                res.appendCodePoint(c);                c = read();            } while (!isSpaceChar(c));            return res.toString();        }            double nextDouble()        {            return Double.parseDouble(next());        }            public long nextLong() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            long res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }            public int nextInt() {            int c = read();            while (isSpaceChar(c)) {                c = read();            }            int sgn = 1;            if (c == '-') {                sgn = -1;                c = read();            }            int res = 0;            do {                if (c < '0' || c > '9') {                    throw new InputMismatchException();                }                res *= 10;                res += c - '0';                c = read();            } while (!isSpaceChar(c));            return res * sgn;        }            public boolean isSpaceChar(int c) {            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }            public boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }     }    static void input_output() throws IOException {        File f = new File("in.txt");        if(f.exists() && !f.isDirectory()) {             in = new Reader(new FileInputStream("in.txt"));        } else in = new Reader();        f = new File("out.txt");        if(f.exists() && !f.isDirectory()) {            out = new PrintWriter(new File("out.txt"));        } else out = new PrintWriter(System.out);    }}