import java.io.*;import java.util.*; public class Main {     boolean nc(int x1, int y1, int r1, int x2, int y2, int r2) {        boolean ans = true;        double Ro = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);        if (getSqrt(Ro, 100) + r1 <= r2 || getSqrt(Ro, 100) + r2 <= r1) {            return true;        }        if (getSqrt(Ro, 100) >= r1 + r2) {            return true;        }        return false;    }     boolean inBlack(double x, double y, int x1, int y1, int r1, int r2) {        if ((x - x1) * (x - x1) + (y - y1) * (y - y1) > r1 * r1)            if ((x - x1) * (x - x1) + (y - y1) * (y - y1) < r2 * r2) return true;        return false;    }     void solve() throws IOException {        int x1 = readInt(), y1 = readInt(), r1 = readInt(), R1 = readInt(), x2 = readInt(), y2 = readInt(), r2 = readInt(), R2 = readInt();        int ans = 0;        if (nc(x1, y1, r1, x2, y2, r2) && nc(x1, y1, r1, x2, y2, R2)) {            double x = x1;            double y_ = 0, y = 0;            double x_ = x1 + r1;            y = y1 + r1;            y_ = y1;            if (inBlack(x, y, x2, y2, r2, R2) || inBlack(x_, y_, x2, y2, r2, R2))                ans--;            ans++;        }        if (nc(x1, y1, R1, x2, y2, r2) && nc(x1, y1, R1, x2, y2, R2)) {            double x = x1, x_ = x1 + R1;            double y = y1 - R1;            double y_ = y1;            if (inBlack(x, y, x2, y2, r2, R2) ||inBlack(x_, y_, x2, y2, r2, R2))                ans--;            ans++;        }        if (nc(x1, y1, r1, x2, y2, r2) && nc(x1, y1, R1, x2, y2, r2)) {            double x = x2, x_ = x2+r2;            double y = y2 - r2;            double y_ = y2;            if (inBlack(x, y, x1, y1, r1, R1) || inBlack(x_, y_, x1, y1, r1, R1))                ans--;            ans++;        }        if (nc(x1, y1, r1, x2, y2, R2) && nc(x1, y1, R1, x2, y2, R2)) {            double x = x2, x_ = x2+R2;            double y = y2 - R2;            double y_ = y2;            if (inBlack(x, y, x1, y1, r1, R1) || inBlack(x_, y_, x1, y1, r1, R1))                ans--;            ans++;        }        out.print(ans);    }     int gcd(int a, int b) {        if (b == 0) return a;        return gcd(b, a % b);    }     double getSqrt(double x, int itr) {        double l = 0;        double r = x;        double m;        while (itr-- > 0) {            m = (l + r) / 2;            if (m * m > x) r = m;            else l = m;        }        return l;    }     public static void main(String[] args) throws IOException {        new Main().run();    }     BufferedReader in;    PrintWriter out;    StringTokenizer tok;     Main() throws FileNotFoundException {        try {            in = new BufferedReader(new FileReader("input.txt"));            out = new PrintWriter("output.txt");        } catch (Exception e) {            in = new BufferedReader(new InputStreamReader(System.in));            out = new PrintWriter(System.out);        }        tok = new StringTokenizer("");    }     void run() throws IOException {        solve();        out.close();    }      class Fenwik {        private long[] t;        private int length;         Fenwik(int[] a) {            this.length = a.length + 100;            this.t = new long[length];            for (int i = 0; i < a.length; ++i) this.inc(i, a[i]);        }         void inc(int i, int delta) {            for (; i < this.length; i = i | (i + 1)) t[i] += delta;        }         long getSum(int r) {            long sum = 0;            for (; r >= 0; r = (r & (r + 1)) - 1) sum += this.t[r];            return sum;        }     }     String delimiter = " ";     String readLine() throws IOException {        return in.readLine();    }     String readString() throws IOException {        while (!tok.hasMoreTokens()) {            String nextLine = readLine();            if (null == nextLine) return null;            tok = new StringTokenizer(nextLine);        }        return tok.nextToken(delimiter);    }     int readInt() throws IOException {        return Integer.parseInt(readString());    }     long readLong() throws IOException {        return Long.parseLong(readString());    }     double readDouble() throws IOException {        return Double.parseDouble(readString());    }     int[] readIntArray(int b) {        int a[] = new int[b];        for (int i = 0; i < b; i++)            try {                a[i] = readInt();            } catch (IOException e) {                e.printStackTrace();            }        return a;    }     int[] readIntArrayWithDec(int b) {        int a[] = new int[b];        for (int i = 0; i < b; i++)            try {                a[i] = readInt() - 1;            } catch (IOException e) {                e.printStackTrace();            }        return a;    }     int[] readSortedIntArray(int size) throws IOException {        Integer[] array = new Integer[size];        for (int index = 0; index < size; ++index) array[index] = readInt();        Arrays.sort(array);        int[] sortedArray = new int[size];        for (int index = 0; index < size; ++index) sortedArray[index] = array[index];        return sortedArray;    }     int[] sortedIntArray(int size, int[] array) throws IOException {        for (int index = 0; index < size; ++index) array[index] = readInt();        Arrays.sort(array);        int[] sortedArray = new int[size];        for (int index = 0; index < size; ++index) sortedArray[index] = array[index];        return sortedArray;    }     int minInt(int... values) {        int min = Integer.MAX_VALUE;        for (int value : values) min = Math.min(min, value);        return min;    }     int maxInt(int... values) {        int max = Integer.MIN_VALUE;        for (int value : values) max = Math.max(max, value);        return max;    }     long minLong(long... values) {        long min = Long.MAX_VALUE;        for (long value : values) min = Math.min(min, value);        return min;    }     long maxLong(long... values) {        long max = Long.MIN_VALUE;        for (long value : values) max = Math.max(max, value);        return max;    }     boolean checkIndex(int index, int size) {        return (0 <= index && index < size);    }     double abs(double a) {        if (a < 0) return -a;        return a;    }}
