import java.io.*;import java.util.*; import static java.lang.Integer.*; public class Main {    static int N = (int)Math.sqrt(100000);    static boolean[] isPrime;    static ArrayList<Integer> prime;    public static void main(String[] args) throws IOException {        FastReader in = new FastReader(System.in);        PrintWriter pw = new PrintWriter(System.out);        sieve();        int n = in.nextInt(), k = in.nextInt();        pw.println(primeFactor(n, k));        pw.close();    }    static void sieve() {        isPrime = new boolean[N + 5];        prime = new ArrayList<>();        Arrays.fill(isPrime, true);        isPrime[0] = isPrime[1] = false;        for (int i = 2; i * i <= N; i++) {            if (!isPrime[i])continue;            for (int j = i * i; j <= N; j+=i) {                isPrime[j] = false;            }        }        for (int i = 2; i <= N; i++) if (isPrime[i]) prime.add(i);    }    static String primeFactor(int n, int k) {        ArrayList<Integer> factor = new ArrayList<>();        int temp = n;        for (int i = 0; i < prime.size() && prime.get(i) * prime.get(i) <= n; i++) {            if (temp < prime.get(i)) break;            int p = prime.get(i);            if (temp % p == 0) {                while (temp % p == 0) {                    temp /= p;                    factor.add(p);                }            }        }        if (temp > 1) factor.add(temp);        if (factor.size() < k) return -1+"";        String res = "";        for (int i = 0; i < k - 1; i++) {            res = res + factor.get(i) + " ";        }        int ex = 1;        for (int i = k - 1; i < factor.size(); i++) {            ex *= factor.get(i);        }        return res + ex;    }     static void debug(Object... obj) {        System.err.println(Arrays.deepToString(obj));    }     static class FastReader {        InputStream is;        private byte[] inbuf = new byte[1024];        private int lenbuf = 0, ptrbuf = 0;         public FastReader(InputStream is) {            this.is = is;        }         public int readByte() {            if (lenbuf == -1) throw new InputMismatchException();            if (ptrbuf >= lenbuf) {                ptrbuf = 0;                try {                    lenbuf = is.read(inbuf);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (lenbuf <= 0) return -1;            }            return inbuf[ptrbuf++];        }         public boolean isSpaceChar(int c) {            return !(c >= 33 && c <= 126);        }         private boolean isEndOfLine(int c) {            return c == '\n' || c == '\r' || c == -1;        }         public int skip() {            int b;            while ((b = readByte()) != -1 && isSpaceChar(b)) ;            return b;        }         public String next() {            int b = skip();            StringBuilder sb = new StringBuilder();            while (!(isSpaceChar(b))) {                sb.appendCodePoint(b);                b = readByte();            }            return sb.toString();        }          public String nextLine() {            int c = skip();            StringBuilder sb = new StringBuilder();            while (!isEndOfLine(c)) {                sb.appendCodePoint(c);                c = readByte();            }            return sb.toString();        }         public int nextInt() {            int num = 0, b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }            while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public long nextLong() {            long num = 0;            int b;            boolean minus = false;            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;            if (b == '-') {                minus = true;                b = readByte();            }             while (true) {                if (b >= '0' && b <= '9') {                    num = (num << 3) + (num << 1) + (b - '0');                } else {                    return minus ? -num : num;                }                b = readByte();            }        }         public double nextDouble() {            return Double.parseDouble(next());        }         public char[] next(int n) {            char[] buf = new char[n];            int b = skip(), p = 0;            while (p < n && !(isSpaceChar(b))) {                buf[p++] = (char) b;                b = readByte();            }            return n == p ? buf : Arrays.copyOf(buf, p);        }         public char readChar() {            return (char) skip();        }    } } 				     	   		    		 	 	 		