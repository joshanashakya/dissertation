import java.io.*;import java.util.*; public class Main {    public static void main(String[] args) throws IOException {        int n = sc.nextInt();        String s = sc.nextLine();        int ans = 0;        for (int i = 0; i < n; i++) {            int currAns = 0;            HashSet<Character> set = new HashSet<>();            for (int j = i; j < n; j++) {                char c = s.charAt(j);                if(Character.isLowerCase(c)) {                    if(set.add(c)) ans = Math.max(ans, ++currAns);                }                else break;            }        }        pw.println(ans);         pw.close();    }      public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        for (Pair i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static class Pair implements Comparable<Pair>{        int first, second;        public Pair(int first, int second){            this.first = first; this.second = second;        }         @Override        public int compareTo(Pair p2) {            return first - p2.first;        }         @Override        public String toString() { return "("+ first + "," + second + ')'; }     }     static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static final int MOD = (int) 1e9 + 7;}  			 								 		 		 	  	 	
