 import java.io.DataInputStream;import java.io.FileInputStream;import java.io.IOException;import java.io.PrintWriter; public class Main {     static long mod = 998244353;    static long[][][] dp = new long[2][202][3];    public static void main(String[] args) throws IOException {        Reader in = new Reader();        PrintWriter out = new PrintWriter(System.out);        int n = in.nextInt();        int m = in.nextInt();        if (m == -1) {            for (int i = 1; i <= 200; i++)                dp[0][i][0] = 1;        } else dp[0][m][0] = 1;        for (int j = 1; j <= 200; j++) {            dp[1][j][0] = dp[1][j - 1][0] + dp[0][j][0];            dp[1][j][1] = dp[1][j - 1][1] + dp[0][j][1];            dp[1][j][2] = dp[1][j - 1][2] + dp[0][j][2];        }        for (int i = 2; i <= n; i++) {            m = in.nextInt();            if(m != -1){                long a = dp[0][m][0];                long b = dp[0][m][1];                long c = dp[0][m][2];                dp[0] = null;                dp[0] = new long[202][3];                dp[0][m][0] = a;                dp[0][m][1] = b;                dp[0][m][2] = c;                dp[0][m][0] = (dp[1][m - 1][0] + dp[1][m - 1][1] + dp[1][m - 1][2]) % mod;                dp[0][m][1] = ((dp[1][m][0] - dp[1][m - 1][0] + dp[1][m][1] - dp[1][m - 1][1] + dp[1][m][2] - dp[1][m - 1][2]) % mod + mod) % mod;                dp[0][m][2] = ((dp[1][200][1] - dp[1][m][1] + dp[1][200][2] - dp[1][m][2]) % mod + mod) % mod;            }else{                for (int j = 1; j <= 200; j++) {                    dp[0][j][0] = (dp[1][j - 1][0] + dp[1][j - 1][1] + dp[1][j - 1][2]) % mod;                    dp[0][j][1] = ((dp[1][j][0] - dp[1][j - 1][0] + dp[1][j][1] - dp[1][j - 1][1] + dp[1][j][2] - dp[1][j - 1][2]) % mod + mod) % mod;                    dp[0][j][2] = ((dp[1][200][1] - dp[1][j][1] + dp[1][200][2] - dp[1][j][2]) % mod + mod) % mod;                }            }            for (int j = 1; j <= 200; j++) {                dp[1][j][0] = (dp[1][j - 1][0] + dp[0][j][0]) % mod;                dp[1][j][1] = (dp[1][j - 1][1] + dp[0][j][1]) % mod;                dp[1][j][2] = (dp[1][j - 1][2] + dp[0][j][2]) % mod;            }        }        long ans = 0;        for (int j = 1; j <= 200; j++)            ans = (ans + dp[0][j][1] + dp[0][j][2]) % mod;        out.println(ans);        out.close();    }     static class Reader {        final private int BUFFER_SIZE = 1 << 16;        private DataInputStream din;        private byte[] buffer;        private int bufferPointer, bytesRead;         public Reader() {            din = new DataInputStream(System.in);            buffer = new byte[BUFFER_SIZE];            bufferPointer = bytesRead = 0;        }         public Reader(String file_name) throws IOException {            din = new DataInputStream(new FileInputStream(file_name));            buffer = new byte[BUFFER_SIZE];            bufferPointer = bytesRead = 0;        }         public String readLine() throws IOException {            byte[] buf = new byte[64]; // line length            int cnt = 0, c;            while ((c = read()) != -1) {                if (c == '\n')                    break;                buf[cnt++] = (byte) c;            }            return new String(buf, 0, cnt);        }         public int nextInt() throws IOException {            int ret = 0;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();            do {                ret = ret * 10 + c - '0';            } while ((c = read()) >= '0' && c <= '9');             if (neg)                return -ret;            return ret;        }         public long nextLong() throws IOException {            long ret = 0;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();            do {                ret = ret * 10 + c - '0';            }            while ((c = read()) >= '0' && c <= '9');            if (neg)                return -ret;            return ret;        }         public double nextDouble() throws IOException {            double ret = 0, div = 1;            byte c = read();            while (c <= ' ')                c = read();            boolean neg = (c == '-');            if (neg)                c = read();             do {                ret = ret * 10 + c - '0';            }            while ((c = read()) >= '0' && c <= '9');             if (c == '.') {                while ((c = read()) >= '0' && c <= '9') {                    ret += (c - '0') / (div *= 10);                }            }             if (neg)                return -ret;            return ret;        }         private void fillBuffer() throws IOException {            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);            if (bytesRead == -1)                buffer[0] = -1;        }         private byte read() throws IOException {            if (bufferPointer == bytesRead)                fillBuffer();            return buffer[bufferPointer++];        }         public void close() throws IOException {            if (din == null)                return;            din.close();        }    } }