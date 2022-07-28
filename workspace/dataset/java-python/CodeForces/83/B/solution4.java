import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.io.FilterInputStream;import java.io.BufferedInputStream;import java.util.Comparator;import java.util.ArrayList;import java.io.InputStream; /** * @author khokharnikunj8 */ public class Main {    public static void main(String[] args) {        new Thread(null, new Runnable() {            public void run() {                new Main().solve();            }        }, "1", 1 << 26).start();    }     void solve() {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        ScanReader in = new ScanReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        BDoctor solver = new BDoctor();        solver.solve(1, in, out);        out.close();    }     static class BDoctor {        public void solve(int testNumber, ScanReader in, PrintWriter out) {            int n = in.scanInt();            long k = in.scanLong();            if (k == 0) {                for (int i = 0; i < n; i++) {                    out.print((i + 1) + " ");                }                return;            }            long[] ar = new long[n];            for (int i = 0; i < n; i++) ar[i] = ((in.scanLong()) << 31) | (i + 1);            CodeHash.Radix_Sort(ar);            ArrayList<Integer> ans = new ArrayList<>();            long done = 0;            for (int i = 0; i < n && k > 0; i++) {                long value = (ar[i] >> 31) - done;                if (k > value * (n - i)) {                    k -= value * (n - i);                    done += value;                } else {                    long how_much = k / (n - i);                    done += how_much;                    k %= (n - i);                    int[][] temp = new int[n - i][2];                    for (int j = i; j < n; j++) {                        temp[j - i][0] = (int) (ar[j] & ((1l << 31) - 1));                        temp[j - i][1] = j;                    }                    Arrays.sort(temp, new Comparator<int[]>() {                         public int compare(int[] o1, int[] o2) {                            return o1[0] - o2[0];                        }                    });                    for (int j = i + (int) k; j < n; j++) {                        if ((ar[temp[j - i][1]] >> 31) - done > 0)                            ans.add((int) (ar[temp[j - i][1]] & ((1l << 31) - 1)));                    }                    for (int j = i; j < i + k; j++) {                        if ((ar[temp[j - i][1]] >> 31) - done - 1 > 0)                            ans.add((int) (ar[temp[j - i][1]] & ((1l << 31) - 1)));                    }                    k = 0;                }            }            if (k > 0) {                out.println(-1);                return;            }            for (int i : ans) out.print(i + " ");         }     }     static class CodeHash {        public static void Radix_Sort(long a[]) {             long multiplier = 1, len = a.length;            long max = Long.MIN_VALUE;            long b[] = new long[(int) len];            int bucket[];            for (int i = 0; i < len; i++) if (max < a[i]) max = a[i];            while (max / multiplier > 0) {                bucket = new int[10];                for (int i = 0; i < len; i++) bucket[(int) ((a[i] / multiplier) % 10)]++;                for (int i = 1; i < 10; i++) bucket[i] += (bucket[i - 1]);                for (int i = (int) len - 1; i >= 0; i--) b[--bucket[(int) ((a[i] / multiplier) % 10)]] = a[i];                for (int i = 0; i < len; i++) a[i] = b[i];                multiplier *= 10;            }        }     }     static class ScanReader {        private byte[] buf = new byte[4 * 1024];        private int index;        private BufferedInputStream in;        private int total;         public ScanReader(InputStream inputStream) {            in = new BufferedInputStream(inputStream);        }         private int scan() {            if (index >= total) {                index = 0;                try {                    total = in.read(buf);                } catch (Exception e) {                    e.printStackTrace();                }                if (total <= 0) return -1;            }            return buf[index++];        }         public int scanInt() {            int integer = 0;            int n = scan();            while (isWhiteSpace(n)) n = scan();            int neg = 1;            if (n == '-') {                neg = -1;                n = scan();            }            while (!isWhiteSpace(n)) {                if (n >= '0' && n <= '9') {                    integer *= 10;                    integer += n - '0';                    n = scan();                }            }            return neg * integer;        }         private boolean isWhiteSpace(int n) {            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;            else return false;        }         public long scanLong() {            long integer = 0;            int n = scan();            while (isWhiteSpace(n)) n = scan();            int neg = 1;            if (n == '-') {                neg = -1;                n = scan();            }            while (!isWhiteSpace(n)) {                if (n >= '0' && n <= '9') {                    integer *= 10;                    integer += n - '0';                    n = scan();                }            }            return neg * integer;        }     }} 
