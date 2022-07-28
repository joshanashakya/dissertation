 import java.io.DataInputStream;import java.io.FileInputStream;import java.io.IOException; import static java.lang.System.in; public class Chess {    private static final int MOD = (int) (1E9 + 7);    static FastReader scanner = new FastReader();     public static void main(String[] args) throws IOException {        // Write your solution here        int t = 1;        //t = parseInt(scanner.nextLine());        while (t-- > 0) {            solve();        }    }     private static void solve() throws IOException {        boolean isPoss = true;        for (int i = 0; i < 8; i++) {            String s = scanner.nextLine();            int W = 0,B = 0;            for(char c : s.toCharArray()){                if(c == 'W')W++;                if(c == 'B')B++;            }            if(W != B) isPoss = false;            if(i % 2 == 0){                if(s.contains("BB")){                    isPoss = false;                }            }            else{                if(s.contains("WW")){                    isPoss = false;                }            }        }        if(isPoss){            System.out.println("YES");        }        else{            System.out.println("NO");        }    }     private static int gcd(int a, int b) {        if (b == 0)            return a;        return gcd(b, a % b);    }     private static int[] sieveOfEratosthenes(int n) {        // Create a boolean array "prime[0..n]" and initialize all entries it as true. A value in prime[i] will        // finally be false if i is Not a prime, else true.        boolean prime[] = new boolean[n + 1];        for (int i = 0; i <= n; i++)            prime[i] = true;        int cnt = 0;        for (int p = 2; p * p <= n; p++) {            // If prime[p] is not changed, then it is a prime            if (prime[p]) {                // Update all multiples of p                for (int i = p * p; i <= n; i += p)                    prime[i] = false;            }        }        // Print all prime numbers        for (int i = 2; i <= n; i++) {            if (prime[i]) {                cnt++;            }        }        int arr[] = new int[cnt];        int j = 0;        for (int i = 2; i <= n; i++) {            if (prime[i]) {                arr[j++] = i;            }        }        return arr;    }     static class FastReader {        final private int BUFFER_SIZE = 1 << 16;        private DataInputStream din;        private byte[] buffer;        private int bufferPointer, bytesRead;         public FastReader() {            din = new DataInputStream(in);            buffer = new byte[BUFFER_SIZE];            bufferPointer = bytesRead = 0;        }         public FastReader(String file_name) throws IOException {            din = new DataInputStream(new FileInputStream(file_name));            buffer = new byte[BUFFER_SIZE];            bufferPointer = bytesRead = 0;        }         //Method to read String values        public String nextLine() throws IOException {            byte[] buf = new byte[1000000]; // line length            int cnt = 0, c;            while ((c = read()) != -1) {                if (c == '\n')                    break;                buf[cnt++] = (byte) c;            }            return new String(buf, 0, cnt).trim();        }         //Method to read Integer values        public int nextInt() throws IOException {            int ret = 0;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();            do {                ret = ret * 10 + c - '0';            } while ((c = read()) >= '0' && c <= '9');             if (neg)                return -ret;            return ret;        }         //Method to read Long values        public long nextLong() throws IOException {            long ret = 0;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();            do {                ret = ret * 10 + c - '0';            }            while ((c = read()) >= '0' && c <= '9');            if (neg)                return -ret;            return ret;        }         //Method to read Double data type values        public double nextDouble() throws IOException {            double ret = 0, div = 1;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();             do {                ret = ret * 10 + c - '0';            }            while ((c = read()) >= '0' && c <= '9');             if (c == '.') {                while ((c = read()) >= '0' && c <= '9') {                    ret += (c - '0') / (div *= 10);                }            }             if (neg)                return -ret;            return ret;        }         private void fillBuffer() throws IOException {            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);            if (bytesRead == -1)                buffer[0] = -1;        }         private byte read() throws IOException {            if (bufferPointer == bytesRead)                fillBuffer();            return buffer[bufferPointer++];        }         public void close() throws IOException {            if (din == null)                return;            din.close();        }    }}
