import java.io.*;import java.util.*; public class Main {     public static void main(String[] args) throws IOException {        String[] arr = {"50", "80", "170", "20", "200", "110"};        int n = sc.nextInt();        if(n <= 2) pw.println(-1);        else if(n == 3) pw.println(210);        else{            String rest = arr[(n-4)%6];            pw.print(1);            for (int i = 0; i < n-rest.length()-1; i++) {                pw.print(0);            }            pw.print(rest);        }        pw.close();    }     public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        Collections.addAll(l, arr);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Pair implements Comparable<Pair> {        long N; int cnt; boolean stop;        public Pair(long first, int second, boolean third){            this.N = first; this.cnt = second; this.stop = third;        }         @Override        public int compareTo(Pair o) {            return 0;        }    }    static class Edge implements Comparable<Edge> {        int node, w;         Edge(int node, int w) {	this.node = node; this.w = w; }         public int compareTo(Edge e) { return w - e.w; }         @Override        public String toString() {            return "("+ node +","+w+")";        }    }    static class Triple {        int x, y, z;         Triple(int a, int b, int c) { x = a; y = b; z = c;}          //        public int compareTo(Triple t)//        {//            if(Math.abs(sum - t.sum) < 1e-9) return x > t.x ? 1 : -1;//            return sum > t.sum ? 1 : -1;//        }        public String toString()        {            return "(" + x + ", " + y  + ", " + z + ")";        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static Random random = new Random();    static final long MOD = 1_000_000_000 + 7;    static final int INF = (int) 1e9;}
