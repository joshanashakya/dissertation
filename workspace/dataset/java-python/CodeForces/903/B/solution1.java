import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.math.BigDecimal;import java.math.RoundingMode;import java.util.*; import javax.lang.model.type.IntersectionType;import javax.swing.text.html.CSS;public class codeforces {        public static void main(String[] args) {        PrintWriter out = new PrintWriter(System.out);        InputReader sc = new InputReader(System.in);        int h1=sc.nextInt();        int a1=sc.nextInt();        int c1=sc.nextInt();        int h2=sc.nextInt();        int a2=sc.nextInt();        int i=0,strike=0,heal=0;        while(h2>0)        {            if(h1<=a2){                if(h2<=a1)                {                    h2-=a1;                    strike++;                }                else                {                    h1=h1-a2+c1;                    heal++;                }            }            else{                h2-=a1;                h1-=a2;                strike++;            }            i++;        }            System.out.println(i);        for( i=1;i<=heal;i++)            System.out.println("HEAL");        for( i=1;i<=strike;i++)            System.out.println("STRIKE");            }        static class InputReader {        private InputStream in;        private byte[] buffer = new byte[1024];        private int curbuf;        private int lenbuf;        public InputReader(InputStream in) {            this.in = in;            this.curbuf = this.lenbuf = 0;        }        public boolean hasNextByte() {            if (curbuf >= lenbuf) {                curbuf = 0;                try {                    lenbuf = in.read(buffer);                } catch (IOException e) {                    throw new InputMismatchException();                }                if (lenbuf <= 0)                    return false;            }            return true;        }         private int readByte() {            if (hasNextByte())                return buffer[curbuf++];            else                return -1;        }         private boolean isSpaceChar(int c) {            return !(c >= 33 && c <= 126);        }         private void skip() {            while (hasNextByte() && isSpaceChar(buffer[curbuf]))                curbuf++;        }         public boolean hasNext() {            skip();            return hasNextByte();        }         public String next() {            if (!hasNext())                throw new NoSuchElementException();            StringBuilder sb = new StringBuilder();            int b = readByte();            while (!isSpaceChar(b)) {                sb.appendCodePoint(b);                b = readByte();            }            return sb.toString();        }         public int nextInt() {            if (!hasNext())                throw new NoSuchElementException();            int c = readByte();            while (isSpaceChar(c))                c = readByte();            boolean minus = false;            if (c == '-') {                minus = true;                c = readByte();            }            int res = 0;            do {                if (c < '0' || c > '9')                    throw new InputMismatchException();                res = res * 10 + c - '0';                c = readByte();            } while (!isSpaceChar(c));            return (minus) ? -res : res;        }         public long nextLong() {            if (!hasNext())                throw new NoSuchElementException();            int c = readByte();            while (isSpaceChar(c))                c = readByte();            boolean minus = false;            if (c == '-') {                minus = true;                c = readByte();            }            long res = 0;            do {                if (c < '0' || c > '9')                    throw new InputMismatchException();                res = res * 10 + c - '0';                c = readByte();            } while (!isSpaceChar(c));            return (minus) ? -res : res;        }         public double nextDouble() {            return Double.parseDouble(next());        }         public int[] nextIntArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public long[] nextLongArray(int n) {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         public char[][] nextCharMap(int n, int m) {            char[][] map = new char[n][m];            for (int i = 0; i < n; i++)                map[i] = next().toCharArray();            return map;        }    }}class SegTree<S> {    final int MAX;     final int N;    final java.util.function.BinaryOperator<S> op;    final S E;     final S[] data;     @SuppressWarnings("unchecked")    public SegTree(int n, java.util.function.BinaryOperator<S> op, S e) {        this.MAX = n;        int k = 1;        while (k < n) k <<= 1;        this.N = k;        this.E = e;        this.op = op;        this.data = (S[]) new Object[N << 1];        java.util.Arrays.fill(data, E);    }     public SegTree(S[] dat, java.util.function.BinaryOperator<S> op, S e) {        this(dat.length, op, e);        build(dat);    }     private void build(S[] dat) {        int l = dat.length;        System.arraycopy(dat, 0, data, N, l);        for (int i = N - 1; i > 0; i--) {            data[i] = op.apply(data[i << 1 | 0], data[i << 1 | 1]);        }    }     public void set(int p, S x) {        exclusiveRangeCheck(p);        data[p += N] = x;        p >>= 1;        while (p > 0) {            data[p] = op.apply(data[p << 1 | 0], data[p << 1 | 1]);            p >>= 1;        }    }     public S get(int p) {        exclusiveRangeCheck(p);        return data[p + N];    }     public S prod(int l, int r) {        if (l > r) {            throw new IllegalArgumentException(                    String.format("Invalid range: [%d, %d)", l, r)            );        }        inclusiveRangeCheck(l);        inclusiveRangeCheck(r);        S sumLeft = E;        S sumRight = E;        l += N; r += N;        while (l < r) {            if ((l & 1) == 1) sumLeft = op.apply(sumLeft, data[l++]);            if ((r & 1) == 1) sumRight = op.apply(data[--r], sumRight);            l >>= 1; r >>= 1;        }        return op.apply(sumLeft, sumRight);    }     public S allProd() {        return data[1];    }     public int maxRight(int l, java.util.function.Predicate<S> f) {        inclusiveRangeCheck(l);        if (!f.test(E)) {            throw new IllegalArgumentException("Identity element must satisfy the condition.");        }        if (l == MAX) return MAX;        l += N;        S sum = E;        do {            l >>= Integer.numberOfTrailingZeros(l);            if (!f.test(op.apply(sum, data[l]))) {                while (l < N) {                    l = l << 1;                    if (f.test(op.apply(sum, data[l]))) {                        sum = op.apply(sum, data[l]);                        l++;                    }                }                return l - N;            }            sum = op.apply(sum, data[l]);            l++;        } while ((l & -l) != l);        return MAX;    }     public int minLeft(int r, java.util.function.Predicate<S> f) {        inclusiveRangeCheck(r);        if (!f.test(E)) {            throw new IllegalArgumentException("Identity element must satisfy the condition.");        }        if (r == 0) return 0;        r += N;        S sum = E;        do {            r--;            while (r > 1 && (r & 1) == 1) r >>= 1;            if (!f.test(op.apply(data[r], sum))) {                while (r < N) {                    r = r << 1 | 1;                    if (f.test(op.apply(data[r], sum))) {                        sum = op.apply(data[r], sum);                        r--;                    }                }                return r + 1 - N;            }            sum = op.apply(data[r], sum);        } while ((r & -r) != r);        return 0;    }     private void exclusiveRangeCheck(int p) {        if (p < 0 || p >= MAX) {            throw new IndexOutOfBoundsException(                    String.format("Index %d out of bounds for the range [%d, %d).", p, 0, MAX)            );        }    }     private void inclusiveRangeCheck(int p) {        if (p < 0 || p > MAX) {            throw new IndexOutOfBoundsException(                    String.format("Index %d out of bounds for the range [%d, %d].", p, 0, MAX)            );        }    }}class MathLib{    static int LowerBound(int a[], int x) { // x is the target value or key        int l=-1,r=a.length;        while(l+1<r) {            int m=(l+r)>>>1;            if(a[m]>=x) r=m;            else l=m;        }        return r;    }    static int UpperBound(int a[], int x) {// x is the key or target value        int l=-1,r=a.length;        while(l+1<r) {            int m=(l+r)>>>1;            if(a[m]<=x) l=m;            else r=m;        }        return l+1;    }    private static long safe_mod(long x, long m){        x %= m;        if(x<0) x += m;        return x;    }     private static long[] inv_gcd(long a, long b){        a = safe_mod(a, b);        if(a==0) return new long[]{b,0};         long s=b, t=a;        long m0=0, m1=1;        while(t>0){            long u = s/t;            s -= t*u;            m0 -= m1*u;            long tmp = s; s = t; t = tmp;            tmp = m0; m0 = m1; m1 = tmp;        }        if(m0<0) m0 += b/s;        return new long[]{s,m0};    }     public static long gcd(long a, long b){        a = java.lang.Math.abs(a);        b = java.lang.Math.abs(b);        return inv_gcd(a, b)[0];    }    public static long lcm(long a, long b){        a = java.lang.Math.abs(a);        b = java.lang.Math.abs(b);        return a / gcd(a,b) * b;    }     public static long pow_mod(long x, long n, int m){        assert n >= 0;        assert m >= 1;        if(m == 1)return 0L;        x = safe_mod(x, m);        long ans = 1L;        while(n > 0){            if((n&1) == 1) ans = (ans * x) % m;            x = (x*x) % m;            n >>>= 1;        }        return ans;    }     public static long[] crt(long[] r, long[] m){        assert(r.length == m.length);        int n = r.length;         long r0=0, m0=1;        for(int i=0; i<n; i++){            assert(1 <= m[i]);            long r1 = safe_mod(r[i], m[i]), m1 = m[i];            if(m0 < m1){                long tmp = r0; r0 = r1; r1 = tmp;                tmp = m0; m0 = m1; m1 = tmp;            }            if(m0%m1 == 0){                if(r0%m1 != r1) return new long[]{0,0};                continue;            }             long[] ig = inv_gcd(m0, m1);            long g = ig[0], im = ig[1];             long u1 = m1/g;            if((r1-r0)%g != 0) return new long[]{0,0};             long x = (r1-r0) / g % u1 * im % u1;             r0 += x * m0;            m0 *= u1;            if(r0<0) r0 += m0;            //System.err.printf("%d %d\n", r0, m0);        }        return new long[]{r0, m0};    }    public static long floor_sum(long n, long m, long a, long b){        long ans = 0;        if(a >= m){            ans += (n-1) * n * (a/m) / 2;            a %= m;        }        if(b >= m){            ans += n * (b/m);            b %= m;        }         long y_max = (a*n+b) / m;        long x_max = y_max * m - b;        if(y_max == 0) return ans;        ans += (n - (x_max+a-1)/a) * y_max;        ans += floor_sum(y_max, a, m, (a-x_max%a)%a);        return ans;    }     public static java.util.ArrayList<Long> divisors(long n){        java.util.ArrayList<Long> divisors = new ArrayList<>();        java.util.ArrayList<Long> large = new ArrayList<>();         for(long i=1; i*i<=n; i++) if(n%i==0){            divisors.add(i);            if(i*i<n) large.add(n/i);        }        for(int p=large.size()-1; p>=0; p--){            divisors.add(large.get(p));        }        return divisors;    }}