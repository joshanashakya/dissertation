import java.io.*;import java.util.*; public class Main {    public static void main(String[] args) throws IOException {        int n = sc.nextInt(); int q = sc.nextInt();        String s = sc.nextLine();        while(q-- > 0){            int l = sc.nextInt()-1; int r = sc.nextInt()-1;            String ss = s.substring(l,r+1);            List<Character> list = new ArrayList<>();            for(char c : ss.toCharArray()) list.add(c);            int[] freqArr = new int[10];            int cp = 0, dp = 1;            while(cp >= 0 && cp < list.size()){                boolean erase = false;                if(list.get(cp) >= '0' && list.get(cp) <= '9'){                    freqArr[Integer.parseInt(list.get(cp)+"")]++;                    list.set(cp, (char) (list.get(cp) - 1));                    if(list.get(cp) < '0') erase = true;                }                else{                    if(list.get(cp) == '>') dp = 1;                    else dp = -1;                    if (cp+dp >= 0 && cp+dp < list.size() && (list.get(cp+dp) == '<' || list.get(cp+dp) == '>'))                        erase = true;                }                 if(erase) {                    list.remove(cp);                    if(dp == -1) cp--;                }                else cp += dp;            }            for(int x : freqArr) pw.print(x + " ");            pw.println();        }         pw.close();    }     public static void pairSort(Pair[] arr) {        ArrayList<Pair> l = new ArrayList<>();        for (Pair i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void longSort(long[] arr) {        ArrayList<Long> l = new ArrayList<>();        for (long i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }    public static void intSort(int[] arr) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : arr) l.add(i);        Collections.sort(l);        for (int i = 0; i < arr.length; i++) {            arr[i] = l.get(i);        }    }     static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public boolean ready() throws IOException {            return br.ready();        }         public int[] nextIntArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < n; i++) {                arr[i] = Integer.parseInt(next());            }            return arr;        }         public long[] nextLongArr(int n) throws IOException {            long[] arr = new long[n];            for (int i = 0; i < n; i++) {                arr[i] = Long.parseLong(next());            }            return arr;        }     }    static class Pair implements Comparable<Pair>{        int first, second;        public Pair(int first, int second){            this.first = first; this.second = second;        }         @Override        public int compareTo(Pair p2) {            return first - p2.first;        }         @Override        public String toString() { return "("+ first + "," + second + ')'; }     }     static PrintWriter pw = new PrintWriter(System.out);    static Scanner sc = new Scanner(System.in);    static final int MOD = (int) 1e9 + 7;}
