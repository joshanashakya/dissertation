//package main; import java.io.*;import java.util.*; public final class Main {    BufferedReader br;    StringTokenizer stk;     public static void main(String[] args) throws Exception {        new Main().run();    }        {        stk = null;        br = new BufferedReader(new InputStreamReader(System.in));    }        long mod = 998244353;        void run() throws Exception {        long[] p = new long[] {nl(), nl()};        long[] q = new long[] {nl(), nl()};        long[] r = new long[] {nl(), nl()};        long K = (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);        if(K == 0)            System.out.println("TOWARDS");        else if(K < 0)            System.out.println("LEFT");        else            System.out.println("RIGHT");    }        //Reader & Writer    String nextToken() throws Exception {        if (stk == null || !stk.hasMoreTokens())            stk = new StringTokenizer(br.readLine(), " ");        return stk.nextToken();    }     String nt() throws Exception {        return nextToken();    }     int ni() throws Exception {        return Integer.parseInt(nextToken());    }     long nl() throws Exception {        return Long.parseLong(nextToken());    }        double nd() throws Exception {        return Double.parseDouble(nextToken());    }        //Some Misc methods    int get(int l, int r, int[] a) {        return l == 0 ? a[r] : a[r] - a[l - 1];    }        void shuffle(int[] a) {        Random r = new Random();        for(int i = 0; i < a.length; i++) {            int idx = r.nextInt(a.length);            int temp = a[i];            a[i] = a[idx];            a[idx] = temp;        }    }        void reverse(char[] a) {        for(int i = 0, j = a.length - 1; i < j; i++, j--) {            char temp = a[i];            a[i] = a[j];            a[j] = temp;        }    }}
