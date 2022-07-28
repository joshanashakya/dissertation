import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.StringTokenizer; public class B {    static BufferedReader br;    static StringTokenizer st;    static PrintWriter pw;     static String nextToken() {        try {            while (st == null || !st.hasMoreTokens()) {                st = new StringTokenizer(br.readLine());            }        } catch (IOException e) {            e.printStackTrace();        }        return st.nextToken();    }     static int nextInt() {        return Integer.parseInt(nextToken());    }     public static void main(String[] args) {        br = new BufferedReader(new InputStreamReader(System.in));        pw = new PrintWriter(System.out, true);        solve();        pw.close();    }     private static void solve() {        int t = nextInt();        for (int i = 0; i < t; i++) {            int n = nextInt();            ArrayList<Pair> list = new ArrayList<>();            for (int j = 0; j + 1 < n; j += 2) {                pw.println("? " + (j + 1) + " " + (j + 2));                String s = nextToken();                Pair p;                if (s.equals(">")) {                    p = new Pair(j + 2, j + 1);                } else {                    p = new Pair(j + 1, j + 2);                }                list.add(p);            }            if (n % 2 == 1) {                list.add(new Pair(n, n));            }            while (list.size() > 1) {                ArrayList<Pair> list2 = new ArrayList<>();                for (int j = 0; j + 1< list.size(); j += 2) {                    pw.println("? " + list.get(j).min + " " + list.get(j + 1).min);                    String s = nextToken();                    Pair p = new Pair();                    if (s.equals(">")) {                        p.min = list.get(j + 1).min;                    } else {                        p.min = list.get(j).min;                    }                    pw.println("? " + list.get(j).max + " " + list.get(j + 1).max);                    s = nextToken();                    if (s.equals(">")) {                        p.max = list.get(j).max;                    } else {                        p.max = list.get(j + 1).max;                    }                    list2.add(p);                }                if (list.size() % 2 == 1) {                    list2.add(list.get(list.size() - 1));                }                list = list2;            }            pw.println("! " + list.get(0).min + " " + list.get(0).max);        }    }     static class Pair {        int min;        int max;         public Pair() {        }         public Pair(int min, int max) {            this.min = min;            this.max = max;        }    }}