import java.util. *;import java.io. *;import java.math. *; public


class Main {static PrintWriter pw = new PrintWriter(System.out);     public static void main(String[] args) throws IOException, InterruptedException {Scanner sc = new Scanner(System.in );        int t = sc.nextInt();        w:


    while (
            t - - > 0) {int n = sc.nextInt(), m = sc.nextInt();            char[] s = sc.next().toCharArray(), f = sc.next().toCharArray();            pair[] q = new pair[m]; for (int i = 0; i < q.length; i++) {q[i] = new pair(sc.nextInt(), sc.nextInt());}            int N = 1;
while (
        N < n)                N <<= 1; // padding            int[] in = new int[N + 1]; for (int i = 1; i <= n; i++) in[i] = f[i - 1] - '0';            SegmentTree st = new SegmentTree( in ); for (int i = m - 1; i >= 0; i--) {int a = st.query(q[i].x, q[i].y), len = q[i].y - q[i].x + 1, b = len - a; if (a > len / 2) {st.update_range(q[i].x, q[i].y, 1);} else if (b > len / 2) {st.update_range(q[i].x, q[i].y, 0);} else {pw.println("NO");
continue
w;}}            for (int i = 0; i < n; i++) { if (st.query(i + 1, i + 1) != s[
    i] - '0') {pw.println("NO");                    continue w;}}            pw.println("YES");}        pw.close();}     static


class SegmentTree {// 1-based DS, OOP         int N; // the number of elements in the array as a power of 2 (i.e.after padding)        int[] array, sTree, lazy;         SegmentTree(int[] in ) {array = in;            N = in.length - 1;            sTree = new int[N << 1]; // no.of nodes = 2 * N - 1, we add one to cross out index zero            lazy = new int[N << 1];            Arrays.fill(lazy, -1);            build(1, 1, N);}         void build(int node, int b, int e) // O(n)        {if (b == e)                sTree[node] = array[b]; else {int mid = b + e >> 1;                build(node << 1, b, mid);                build(node << 1 | 1, mid + 1, e);                sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];}}         void update_point(int index, int val) // O(log n)        {index += N - 1;            sTree[index] += val;


while (
        index > 1) {index >>= 1;                sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];}}         void update_range(int i, int j, int val) // O(log n)        {update_range(1, 1, N, i, j, val);}         void update_range(int node, int b, int e, int i, int j, int val) {if (i > e | | j < b) return; if (b >= i & & e <= j) {sTree[node] = (e - b + 1) * val;                lazy[node] = val;} else {int mid = b + e >> 1;                propagate(node, b, mid, e);                update_range(node << 1, b, mid, i, j, val);                update_range(node << 1 | 1, mid + 1, e, i, j, val);                sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];} }         void propagate(int node, int b, int mid, int e) {if (lazy[node] != -1) {lazy[node << 1] = lazy[node];                lazy[node << 1 | 1] = lazy[node];                sTree[node << 1] = (mid - b + 1) * lazy[node];                sTree[node << 1 | 1] = (e - mid) * lazy[node];}            lazy[node] = -1;}         int query(int i, int j) {return query(1, 1, N, i, j);}         int query(int node, int b, int e, int i, int j) // O(log n)        {if (i > e | | j < b) return 0; if (b >= i & & e <= j) return sTree[node];            int mid = b + e >> 1;            propagate(node, b, mid, e);            int q1 = query(node << 1, b, mid, i, j);            int q2 = query(node << 1 | 1, mid + 1, e, i, j); return q1 + q2; } }     public static


class pair implements Comparable < pair > {int x;        int y;         public pair(int x, int y) {this.x = x;            this.y = y;}         public String toString() {


return x + " " + y;}         public
int
compareTo(pair
other) { if (this.x == other.x)
{
return Long.compare(this.y, other.y);}            return Long.compare(this.x, other.x);}}     static


class FenwickTree {// one-based DS         int n;        int[] ft;         FenwickTree(int size) {n = size;            ft = new int[n + 1];}         int rsq(int b) // O(log n)        {int sum = 0;


while (
        b > 0) {sum += ft[b];                b -= b & -b;} // min? return sum;}         int rsq(int a, int b) {return rsq(b) - rsq(a - 1);}         void point_update(int k, int val) // O(log n), update = increment        {while (k <= n) {ft[k] += val;                k += k & -k;} // min?}}     public static


class tuble implements Comparable < tuble > {int x;        int y;        int z;         public tuble(int x, int y, int z) {this.x = x;            this.y = y;            this.z = z;}         public String toString() {


return x + " " + y + " " + z;}         public
int
compareTo(tuble
other) { if (this.x == other.x)
{ if (this.y == other.y)
return this.z - other.z;
return this.y - other.y;} else {
return this.x - other.x;}}}     static


class Scanner {StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {br = new BufferedReader(new InputStreamReader(s));}         public Scanner(FileReader r) {br = new BufferedReader(r);}         public String next() throws IOException {


while (st == null | |
!st.hasMoreTokens())                st = new StringTokenizer(br.readLine()); return st.nextToken();}         public int nextInt() throws IOException {return Integer.parseInt(next());}         public long nextLong() throws IOException {return Long.parseLong(next());}         public String nextLine() throws IOException {return br.readLine();}         public double nextDouble() throws IOException {String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0; if (x.charAt(0) == '-') {neg = true;                start++;} for (int i = start; i < x.length(); i++) if (x.charAt(i) == '.') {res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;} else {sb.append(x.charAt(i)); if (dec)                        f *= 10;}            res += Long.parseLong(sb.toString()) / f; return res * (neg ? -1: 1);}         public
boolean
ready()
throws
IOException
{
return br.ready();} } }
