import java.io.*;import java.util.*; public class Main {    public static void main(String[] args) throws IOException {//        int n = sc.nextInt(); int q = sc.nextInt();//        char[] chars = sc.nextLine().toCharArray();//        pw.println(chars);//        while(q-- > 0){//            int l = sc.nextInt(); int r = sc.nextInt();//            int p = l; int d = 1;//            int[] freqArr = new int[100];//            while(p >= l && p <= r){//                char c = chars[p];//                if(c == '@'){//                    if(d == 1) p++;//                    else p--;//                }//                if(c == '<'){//                    d = 1; chars[p] = '@';//                }//                else if(c == '>'){//                    d = -1; chars[p] = '@';//                }//                else if(c == '0'){//                    freqArr[0]++; chars[p] = '@';//                }//                else{//                    freqArr[c]++; chars[p]--;//                }////                if(d == 1) p++;//                else p--;//            }//            pw.println(Arrays.toString(freqArr));//        }        char[][] grid = new char[8][8];        boolean f1 = true, f2 = true;        for (int i = 0; i < 8; i++) {            grid[i] = sc.nextLine().toCharArray();            for(char c : grid[i]) if(c == 'B') f1 = false;        }        for (int i = 0; i < 8; i++) {            for(char c : grid[i]) if(c == 'W') f2 = false;        }        if(f1) pw.println(0);        else if(f2) pw.println(8);        else{            int ans = 0;            for (int i = 0; i < 8; i++) {                boolean ff = true;                for (int j = 0; j < 8; j++) {                    if(grid[i][j] == 'W') ff = false;                }                if(ff) ans++;            }            for (int j = 0; j < 8; j++) {                boolean ff = true;                for (int i = 0; i < 8; i++) {                    if (grid[i][j] == 'W') ff = false;                }                if(ff) ans++;            }            pw.println(ans);        }        pw.close();    }      public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        for (Pair i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static class Pair implements Comparable<Pair>{        int first, second;        public Pair(int first, int second){            this.first = first; this.second = second;        }         @Override        public int compareTo(Pair p2) {            return first - p2.first;        }         @Override        public String toString() { return "("+ first + "," + second + ')'; }     }     static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static final int MOD = (int) 1e9 + 7;} 	       		 	 		 	    		 	   		