//package main; import java.io.*;import java.util.*;import java.math.*; public final class Main {    BufferedReader br;    StringTokenizer stk;        public static void main(String[] args) throws Exception {        new Main().run();    }        {        stk = null;        br = new BufferedReader(new InputStreamReader(System.in));    }        long mod = 998244353;    StringBuilder res = new StringBuilder(1000005);    void run() throws Exception {        char[] c = nc();        String s = "OMAHITUVWXYovwx";        boolean ok = true;        for(int i = 0, j = c.length - 1; i <= j; i++, j--) {            if(i == j) {                if(!s.contains("" + c[i])) {                    //System.out.println("1");                    ok = false;                }                break;            } else {                                String t = "" + c[i] + c[j];                if(t.equals("bd") || t.equals("db") || t.equals("pq") || t.equals("qp")) {                    continue;                }                                if(c[i] == 'p' && c[j] != 'q') {                    //System.out.println("2");                    ok = false;                } else if(c[i] == 'b' && c[j] != 'd') {                    //System.out.println("3");                    ok = false;                } else if(c[i] == 'q' && c[j] != 'p') {                    //System.out.println("4");                    ok = false;                } else if(c[i] == 'd' && c[j] != 'b') {                    //System.out.println("5");                    ok = false;                } else {                    if(c[i] == c[j] && s.contains("" + c[i])) {                        // accept                    } else {                        //System.out.println("6");                        ok = false;                    }                }            }        }        System.out.println(ok ? "TAK" : "NIE");    }        //Reader & Writer    String nt() throws Exception {        if (stk == null || !stk.hasMoreTokens())            stk = new StringTokenizer(br.readLine(), " ");        return stk.nextToken();    }     char[] nc() throws Exception {        return nt().toCharArray();    }     int ni() throws Exception {        return Integer.parseInt(nt());    }     long nl() throws Exception {        return Long.parseLong(nt());    }        double nd() throws Exception {        return Double.parseDouble(nt());    }        //Some Misc methods    long get(int l, int r, long[] a) {        return l == 0 ? a[r] : a[r] - a[l - 1];    }        void shuffle(long[] a) {        Random r = new Random();        for(int i = 0; i < a.length; i++) {            int idx = r.nextInt(a.length);            long temp = a[i];            a[i] = a[idx];            a[idx] = temp;        }    }        void reverse(long[] a) {        for(int i = 0, j = a.length - 1; i < j; i++, j--) {            long temp = a[i];            a[i] = a[j];            a[j] = temp;        }    }        void print(int[] a) {        System.out.println(Arrays.toString(a));    }}