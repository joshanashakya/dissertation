import java.io.*;import java.util.*; public class Main {    static int n;    static ArrayList<Integer>[] adjList;    static int[] setNum;    static boolean bipartiteCheck;    static boolean[] vis;    static int s;     public static void bfs(int startingNode){        Queue<Integer> q = new LinkedList<>();        q.add(startingNode);         setNum[startingNode] = 1;        vis[startingNode] = true;        while(!q.isEmpty()){//            pw.println(Arrays.toString(setNum));            int u = q.poll();            for(int v : adjList[u]){                vis[v] = true;                if(setNum[v] == 0) {                    q.add(v);                    setNum[v] = 3 - setNum[u];                }                else if(setNum[v] == setNum[u]){                    bipartiteCheck = false;                    return;                }            }        }    }     public static void main(String[] args) throws IOException {        n = sc.nextInt(); int m = sc.nextInt();        adjList = new ArrayList[n+1]; vis = new boolean[n+1];        for (int i = 0; i <= n; i++) adjList[i] = new ArrayList<>();         while(m --> 0){            int u = sc.nextInt(); int v = sc.nextInt();            s = u;            adjList[u].add(v); adjList[v].add(u);        } //        for (int i = 1; i <= n; i++) {//            pw.println(i + " -> " + adjList[i]);//        }        setNum = new int[n+1];        bipartiteCheck = true;        for (int i = 1; i <= n && bipartiteCheck; i++) {            if(!vis[i]) bfs(i);        }        if(!bipartiteCheck) pw.println(-1);        else{            ArrayList<Integer> onesList = new ArrayList<>(), twosList = new ArrayList<>();            for (int i = 0; i <= n; i++) {                if(setNum[i] == 1) onesList.add(i);                else if(setNum[i] == 2) twosList.add(i);            }            pw.println(onesList.size());            for(int x : onesList) pw.print(x + " ");            pw.println();            pw.println(twosList.size());            for(int x : twosList) pw.print(x + " ");        }         pw.close();    }     public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        Collections.addAll(l, arr);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Pair implements Comparable<Pair> {        int v; int w;        public Pair(int first, int second){            this.v = first; this.w = second;        }         @Override        public int compareTo(Pair p2) {            return v - p2.v;        }         @Override        public String toString() { return "("+ v + "," + w + ')'; }     }    static class Triple {        int x, y, z;         Triple(int a, int b, int c) { x = a; y = b; z = c;}          //        public int compareTo(Triple t)//        {//            if(Math.abs(sum - t.sum) < 1e-9) return x > t.x ? 1 : -1;//            return sum > t.sum ? 1 : -1;//        }        public String toString()        {            return "(" + x + ", " + y  + ", " + z + ")";        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static Random random = new Random();    static final long MOD = 1_000_000_000 + 7;}
