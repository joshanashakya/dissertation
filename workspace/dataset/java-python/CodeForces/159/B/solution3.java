import java.io.*;import java.util.*; public class Main {     public static void main(String[] args) throws IOException, InterruptedException {        int M = sc.nextInt(); int C = sc.nextInt();        Pair[] m = new Pair[M], c = new Pair[C];        for (int i = 0; i < M; i++) m[i] = new Pair(sc.nextInt(), sc.nextInt());        for (int i = 0; i < C; i++) c[i] = new Pair(sc.nextInt(), sc.nextInt());         int[] u = new int[1001];        int[][] v = new int[1001][1001];        for(Pair p : m){            v[p.first][p.second]++;            u[p.second]++;        }        int U = 0, V = 0;        for(Pair p : c){            if(v[p.first][p.second] > 0){                v[p.first][p.second]--;                V++;            }            if(u[p.second] > 0){                u[p.second]--;                U++;            }        }        pw.println(U + " " + V);         pw.close();    }     public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        Collections.addAll(l, arr);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static class Pair implements Comparable<Pair>{        int first; int second; int length;        public Pair(int first, int second){            this.first = first; this.second = second; this.length = second-first+1;        }         @Override        public int compareTo(Pair p2) {            if(first == p2.first) return second - p2.second;            else return first - p2.first;        }         @Override        public String toString() { return "("+ first + "," + second + ')'; }     }    static class Triple implements Comparable<Triple> {        double x, y, z, sum;         Triple(double a, double b, double c) { x = a; y = b; z = c; sum = x + y + z; }          public int compareTo(Triple t)        {            if(Math.abs(sum - t.sum) < 1e-9) return x > t.x ? 1 : -1;            return sum > t.sum ? 1 : -1;        }        public String toString()        {            return x + " " + y  + " " + z;        }    }     static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static Random random = new Random();    static final int MOD = (int) 1e9 + 7;}		   	 	 	      			  	  	  		 	
